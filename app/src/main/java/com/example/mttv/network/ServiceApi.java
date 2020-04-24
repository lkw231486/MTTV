package com.example.mttv.network;
import com.example.mttv.bean.LoginBean;
import com.example.mttv.bean.RespInfo;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * @author api接口声明
 */
public interface ServiceApi {

    @POST("app/login")
    Observable<RespInfo<LoginBean>> login(@Body RequestBody body);
}