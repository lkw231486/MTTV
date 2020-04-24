package com.example.mttv.base;

/**
 * author: jinjianxin
 * created on: 2019/4/15 上午9:36
 * description:
 */
public interface BaseView {

    void initData();

    void onFailed(String msg);

    void showLoadingAndHideContent();

    void finishLoading();

    void showLoading();
}