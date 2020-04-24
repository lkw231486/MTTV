package com.example.mttv.base;


import com.example.mttv.network.RetrofitFactory;
import com.example.mttv.network.ServiceApi;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * @author: jinjianxin
 * created on: 2019/4/15 上午9:43
 * description:
 */
public class BasePresenter<V extends BaseView> {
    protected ServiceApi service;
    protected V mview;

    public BasePresenter() {
        service = RetrofitFactory.getInstance().createService(ServiceApi.class);
    }

    public void attachView(V mvpView) {
        this.mview = mvpView;
    }

    public void detachView() {
        this.mview = null;
    }

    protected <T> ObservableTransformer<T, T> transformer() {
        mview.showLoading();
//        LogHelper.LogOut("显示loading");
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(Observable<T> upstream) {
                return upstream
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.io());
            }
        };
    }

    protected boolean isViewAttached() {
        return mview != null;
    }

    protected void onFailed(String msg) {
        if (isViewAttached()) {
            mview.onFailed(msg);
        }
    }

    protected RequestBody createBody(Map<String, Object> map) {
        JSONObject jsonObject = new JSONObject();
        for (Map.Entry<String, Object> stringObjectEntry : map.entrySet()) {
            try {
                jsonObject.put(stringObjectEntry.getKey(), stringObjectEntry.getValue());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return RequestBody.create(MediaType.parse("json/application;UTF-8"), jsonObject.toString());
    }
}