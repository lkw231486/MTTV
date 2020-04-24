package com.example.mttv.Utils;

import android.annotation.SuppressLint;
import android.widget.Toast;

import com.example.mttv.tvapp.TVApplication;

public class ToastUtils {

    private static Toast toast;

    @SuppressLint("ShowToast")
    public static void showToast(String content) {
        if (toast == null) {
            toast = Toast.makeText(TVApplication.getInstance(),content+"", Toast.LENGTH_SHORT);
        } else {
            toast.setText(content);
        }
        toast.show();
    }
}
