package com.example.mttv;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoosTypeActivity extends Activity {
    private Button mLeftBtn;
    private Button mRightBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choos_type);
        mLeftBtn=findViewById(R.id.left_btn);
        mRightBtn=findViewById(R.id.right_btn);
        int with= mLeftBtn.getMeasuredWidthAndState();
        mRightBtn.setWidth(with);
        mLeftBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChoosTypeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
