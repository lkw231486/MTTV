package com.example.mttv;

import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.mttv.Utils.ToastUtils;
import com.example.mttv.base.BaseMvpActivity;
import com.example.mttv.base.presenter.MainPresenter;
import com.example.mttv.base.view.MainView;

import org.w3c.dom.Text;

public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainView {

    private TextView textOne;
    private TextView textTwo;
    private TextView textThree;
    private TextView textData;
    private FrameLayout frameLayout;

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected MainPresenter initPresenter() {
        return new MainPresenter();
    }

    @Override
    public void initData() {
        initView();
       mPresenter.login("admin","123456");
    }

    private void initView() {
        textOne=findViewById(R.id.text1);
        textTwo=findViewById(R.id.text2);
        textThree=findViewById(R.id.text3);
        textData=findViewById(R.id.date);
        frameLayout=findViewById(R.id.frame_layout);

    }

    @Override
    public void accountLoginSuccess() {
        ToastUtils.showToast("登陆成功");
    }
}
