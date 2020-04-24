package com.example.mttv.network;
import com.example.mttv.tvapp.Constants;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author zl
 */
public class RetrofitFactory {
    private final int TIME_OUT = 60;
    private static RetrofitFactory retrofitFactory;
    private Retrofit retrofit;

    private RetrofitFactory() {
        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.HOST_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(getHttpClient())
                .build();
    }

    public static RetrofitFactory getInstance() {
        if (retrofitFactory == null) {
            synchronized (RetrofitFactory.class) {
                if (retrofitFactory == null) {
                    retrofitFactory = new RetrofitFactory();
                }
            }
        }
        return retrofitFactory;
    }

    public <T> T createService(Class<T> service) {
        return retrofit.create(service);
    }

    private OkHttpClient getHttpClient() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder()
                .cookieJar(new CookiesManager())
                .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(TIME_OUT, TimeUnit.SECONDS)
                .writeTimeout(TIME_OUT, TimeUnit.SECONDS)
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request().newBuilder()
                                .addHeader("Content-Type", "application/json; charset=utf-8")
                                .addHeader("Connection", "keep-alive")
                                .addHeader("Accept", "*/*")
                                .build();
                        return chain.proceed(request);
                    }
                }).addInterceptor(httpLoggingInterceptor)
                .build();
    }
}