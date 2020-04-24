package com.example.mttv.base;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.List;


/**
 * Created by asus on 2016/8/28.
 */
public abstract class BaseMvpActivity<P extends BasePresenter> extends BaseActivity implements BaseView {
    public P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mPresenter = initPresenter();
        mPresenter.attachView(this);
        super.onCreate(savedInstanceState);

    }

    protected abstract P initPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (null != mPresenter) {
            mPresenter.detachView();
            mPresenter = null;
        }
    }

    @Override
    public void showLoadingAndHideContent() {
        //显示加载动画
        loadingView.setVisibility(View.VISIBLE);
        //隐藏页面内容
        contentView.setVisibility(View.GONE);
        loadLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void showLoading() {
        //显示加载动画
        loadingView.setVisibility(View.VISIBLE);
        //显示页面内容
        contentView.setVisibility(View.VISIBLE);
        loadLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void finishLoading() {
        //隐藏加载动画
        loadingView.setVisibility(View.GONE);
        //显示页面内容
        contentView.setVisibility(View.VISIBLE);
        loadLayout.setVisibility(View.GONE);
    }
}
