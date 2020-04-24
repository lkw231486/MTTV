package com.example.mttv.base;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.example.mttv.R;
import com.example.mttv.Utils.AppManager;
import com.example.mttv.Utils.ToastUtils;

/**
 * @author zl
 * @date 2016/8/28
 */
public abstract class BaseActivity extends Activity {
    protected View loadingView;
    protected View contentView;
    protected View loadLayout;
    public static final String TAG = BaseActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //设置窗口无title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        AppManager.getInstance().addActivity(this);

        View content = ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
        if (content != null) {
            //页面背景
            content.setBackgroundColor(ContextCompat.getColor(this, R.color.activity_bg));
            content.setFitsSystemWindows(true);
        }
        initData();
    }

    @Override
    protected void onStart() {
        super.onStart();
//        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
//        EventBus.getDefault().unregister(this);
    }

    /**
     * 设置布局
     *
     * @return LayoutRes
     */
    protected abstract int setLayout();

    /**
     * 页面初始化
     */
    protected abstract void initData();

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: " + this.getClass().getSimpleName());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: " + this.getClass().getSimpleName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: " + this.getClass().getSimpleName());
        AppManager.getInstance().finishActivity(this);
    }

    protected <T extends BaseActivity> void openActivity(Class<T> mClass) {
        Log.d(TAG, "openActivity: open " + mClass.getSimpleName());
        openActivity(mClass, null);
    }

    protected <T extends BaseActivity> void openActivity(Class<T> mClass, Bundle bundle) {
        Intent intent = new Intent(this, mClass);
        if (null != bundle) {
            intent.putExtras(bundle);
        }
        Log.d(TAG, "openActivity with bundle: open " + mClass.getSimpleName());
        startActivity(intent);
    }

    @Override
    public void finish() {
        super.finish();
        Log.d(TAG, "finish: " + this.getClass().getSimpleName());
        //  overridePendingTransition(R.anim.push_right_in,R.anim.push_right_out);
    }

    public void onFailed(String msg) {
        ToastUtils.showToast(msg);
    }

    public Context getContext() {
        return this;
    }

    protected void showKeyboard(View view) {
        InputMethodManager imm = (InputMethodManager) view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            view.requestFocus();
            imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

    public void hideKeyboard(View view) {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

//    @Subscribe
//    public void onEvent(EventMsg eventMsg) {
//    }

    @SuppressLint("ResourceType")
    @Override
    public void setContentView(int layoutResID) {
        FrameLayout baseLayout = (FrameLayout) LayoutInflater.from(this).inflate(R.layout.layout_base, null);
        contentView = LayoutInflater.from(this).inflate(layoutResID, null);
        contentView.getRootView().setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        RelativeLayout container = baseLayout.findViewById(R.id.container);
        container.addView(contentView.getRootView());
        getWindow().setContentView(baseLayout.getRootView());
        loadLayout = findViewById(R.id.load_layout);
        loadLayout.setOnClickListener(null);
        ViewStub loadViewStud = findViewById(R.id.loading_view_stub);
        loadingView = loadViewStud.inflate();
        ImageView loadImg = loadingView.findViewById(R.id.loading_img);
        Glide.with(this).asGif().load(R.drawable.loading).into(loadImg);
        loadingView.setVisibility(View.GONE);
        contentView.setVisibility(View.VISIBLE);
        loadLayout.setVisibility(View.GONE);
    }
}