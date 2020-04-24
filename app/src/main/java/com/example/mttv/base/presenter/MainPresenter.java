package com.example.mttv.base.presenter;

import android.util.Log;

import com.example.mttv.base.BaseObserver;
import com.example.mttv.base.BasePresenter;
import com.example.mttv.base.BaseView;
import com.example.mttv.base.view.MainView;
import com.example.mttv.bean.LoginBean;

import java.util.HashMap;

import okhttp3.RequestBody;

/**
 * @ author: lkw
 * created on:2020/4/24 16:04
 * description:
 * email:lkw@mantoo.com.cn
 */
public class MainPresenter extends BasePresenter<MainView> {

    public void login(String userName,String password ){
        HashMap<String, Object> map = new HashMap<>(3);
        map.put("userName", userName);
        map.put("password", password);

        RequestBody body = createBody(map);
        service.login(body)
                .compose(transformer())
                .subscribe(new BaseObserver<LoginBean>(mview) {
                    @Override
                    public void onSuccess(LoginBean loginBean) {
                        mview.accountLoginSuccess();
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        Log.i("LKW",e.getMessage());
                    }
                });

    }
}
