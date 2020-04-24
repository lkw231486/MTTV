package com.example.mttv.base;

import android.net.ParseException;

import com.example.mttv.Utils.ToastUtils;
import com.example.mttv.bean.RespInfo;
import com.example.mttv.network.HttpStatusCodeEnum;

import org.json.JSONException;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import io.reactivex.observers.DisposableObserver;
import retrofit2.HttpException;

/**
 * @author zl
 * date 2019-04-01 下午 1:58
 * description:
 */
public abstract class BaseObserver<T> extends DisposableObserver<RespInfo<T>> {
    private String msg;
    private BaseView baseView;

    public BaseObserver(BaseView baseView) {
        this.baseView = baseView;
    }

    @Override
    public void onNext(RespInfo<T> tRespInfo) {
        if (baseView != null) {
            baseView.finishLoading();
        }
        msg = tRespInfo.getMsg();
        if (tRespInfo.isSuccess()) {
            if (baseView != null) {
                onSuccess(tRespInfo.getData());
                onSuccessMsg(msg);
            }
        } else {
            onFailure(msg);
        }
    }

    /**
     * 接口请求成功回调
     *
     * @param t 接口返回值
     */
    public abstract void onSuccess(T t);

    @Override
    public void onComplete() {
        if (baseView != null) {
            baseView.finishLoading();
        }
    }

    @Override
    public void onError(Throwable e) {
        if (baseView != null) {
            baseView.finishLoading();
        }
        String errorMsg = "未知错误";
        if (e instanceof HttpException) {
            int code = ((HttpException) e).code();
            if (code == HttpStatusCodeEnum.BAD_REQUEST.getRespCode()) {
                errorMsg = "请求参数有误";
            } else if (code == HttpStatusCodeEnum.UNAUTHORIZED.getRespCode()) {
//                SharePreferenceUtil.putBoolean(TVApplication.getInstance(), Constants.IS_LOGIN, false);
                errorMsg = "您未登录，请先登录";
            } else if (code == HttpStatusCodeEnum.FORBIDDEN.getRespCode()) {
                errorMsg = "服务器拒绝访问";
            } else if (code == HttpStatusCodeEnum.NOT_FOUND.getRespCode()) {
                errorMsg = "请求路径不存在";
            } else if (code == HttpStatusCodeEnum.METHOD_NOT_ALLOWED.getRespCode()) {
                errorMsg = "请求方式不正确";
            } else if (code == HttpStatusCodeEnum.INTERNAL_SERVER_ERROR.getRespCode()) {
                errorMsg = "服务器处理请求异常";
            } else if (code == HttpStatusCodeEnum.BAC_GATEWAY.getRespCode()) {
                errorMsg = "网关错误";
            } else if (code == HttpStatusCodeEnum.GATEWAY_TIMEOUT.getRespCode()) {
                errorMsg = "网关超时";
            }
        } else if (e instanceof UnknownHostException) {
            errorMsg = "网络或服务器不可用";
        } else if (e instanceof SocketTimeoutException) {
            errorMsg = "请求超时";
        } else if ((e instanceof ParseException) || (e instanceof JSONException)) {
            errorMsg = "数据解析错误";
        }
//        ToastUtils.showToast(errorMsg);
    }

    /**
     * 后台返回错误时回调
     *
     * @param msg 后台提示消息
     */
    protected void onFailure(String msg) {
        ToastUtils.showToast(msg);
    }

    protected void onSuccessMsg(String msg) {

    }


    protected void showToast() {
        ToastUtils.showToast(msg);
    }
}