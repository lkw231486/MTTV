package com.example.mttv.network;

import android.text.TextUtils;

import com.example.mttv.Utils.SharePreferenceUtil;
import com.example.mttv.Utils.ThreadPoolUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/**
 * cookies管理类
 *
 * @author zl
 */
public class CookiesManager implements CookieJar {
    private HashMap<HttpUrl, List<Cookie>> cookieStore = new HashMap<>();
    private HttpUrl url;

    @Override
    public void saveFromResponse(final HttpUrl httpUrl, final List<Cookie> list) {
        cookieStore.put(httpUrl, list);
        ThreadPoolUtils.exec(new Runnable() {
            @Override
            public void run() {
                Gson gson = new Gson();
                //转换成json数据，再保存
                String strJson = gson.toJson(list);
                SharePreferenceUtil.putString(httpUrl.host(), strJson);
            }
        });
        url = httpUrl;
    }

    @Override
    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        List<Cookie> cookies = cookieStore.get(url);
        if (cookies != null) {
            return cookies;
        } else {
            String string = SharePreferenceUtil.getString(httpUrl.host());
            if (!TextUtils.isEmpty(string)) {
                Gson gson = new Gson();
                return gson.fromJson(string, new TypeToken<List<Cookie>>() {
                }.getType());
            }
        }
        return new ArrayList<>();
    }
}