package com.example.mttv.Utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.mttv.tvapp.Constants;
import com.example.mttv.tvapp.TVApplication;

/**
 * @author: lkw
 * created on:2019/11/12 14:29
 * description: 数据缓存工具类
 * email:lkw@mantoo.com.cn
 */
public class SharePreferenceUtil {
    public static final String PREFERENCE_NAME = Constants.CONFIG_PATH;
    private static final Context CONTEXT = TVApplication.getInstance();

    /**
     * put String to SharePreference
     *
     * @param key
     * @param value
     * @return
     */
    public static boolean putString(String key, String value) {
        SharedPreferences sp = CONTEXT.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(key, value);
        return editor.commit();
    }

    /**
     * get String from SharedPreferences
     */
    public static String getString(String key, String defaultValue) {
        SharedPreferences preferences = CONTEXT.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        return preferences.getString(key, defaultValue);
    }

    /**
     * get String from SharedPreferences
     */
    public static String getString(String key) {
        return getString(key, null);
    }

    /**
     * put int to SharedPreferences
     */
    public static boolean putInt(String key, int value) {
        SharedPreferences preferences = CONTEXT.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(key, value);
        return editor.commit();
    }

    /**
     * get int from SharedPreferences
     */
    public static int getInt(String key, int defaultValue) {
        SharedPreferences preferences = CONTEXT.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        return preferences.getInt(key, defaultValue);
    }

    /**
     * get int from SharedPreferences
     */
    public static int getInt(String key) {
        return getInt(key, -1);
    }

    /**
     * put long to SharedPreferences
     */
    public static boolean putLong(String key, long value) {
        SharedPreferences preferences = CONTEXT.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putLong(key, value);
        return editor.commit();
    }

    /**
     * get long from SharedPreferences
     */
    public static long getLong(String key, long defaultValue) {
        SharedPreferences preferences = CONTEXT.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        return preferences.getLong(key, defaultValue);
    }

    /**
     * get long from SharedPreferences
     */
    public static long getLong(String key) {
        return getLong(key, -1);
    }

    /**
     * put float to SharedPreferences
     */
    public static boolean putFloat(String key, float value) {
        SharedPreferences preferences = CONTEXT.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putFloat(key, value);
        return editor.commit();
    }

    /**
     * get float from SharedPreferences
     */
    public static float getFloat(String key, float defaultValue) {
        SharedPreferences preferences = CONTEXT.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        return preferences.getFloat(key, defaultValue);
    }

    /**
     * get float from SharedPreferences
     */
    public static float getFloat(String key) {
        return getFloat(key, -1);
    }

    /**
     * put boolean to SharedPreferences
     */
    public static boolean putBoolean(String key, boolean value) {
        SharedPreferences preferences = CONTEXT.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key, value);
        return editor.commit();
    }

    /**
     * get boolean from SharedPreferences
     */
    public static boolean getBoolean(String key, boolean defaultValue) {
        SharedPreferences preferences = CONTEXT.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        return preferences.getBoolean(key, defaultValue);
    }

    /**
     * get boolean from SharedPreferences
     */
    public static boolean getBoolean(String key) {
        return getBoolean(key, false);
    }

    /**
     * if SharedPreferences have the key
     */
    public static boolean haveKey(String key) {
        SharedPreferences preferences = CONTEXT.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        return preferences.contains(key);
    }
}
