package com.sgd.zitai.retrofit;




import com.sgd.zitai.constants.ConstantCode;
import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by Allen Liu on 2016/5/27.
 */
public class MyRetrofit {


    /* 服务器的BaseUrl */
    private static final String BASE_URL = "http://ls.otzkxy.com/zitai-server/index.php/";

    /* 使用OkHttp请求网络 */
    private final  OkHttpClient mHttpClient;

    /* Retrofit单例 */
    private static MyRetrofit mInstance;

    /* 超时时间 */
    private static final int TIMEOUT_IN_SECOND = 15;


    private Retrofit mRetrofit;

    public MyRetrofit() {
        mHttpClient = new OkHttpClient();
        mHttpClient.setReadTimeout(TIMEOUT_IN_SECOND, TimeUnit.SECONDS);
        mHttpClient.setConnectTimeout(TIMEOUT_IN_SECOND, TimeUnit.SECONDS);
        mRetrofit = buildRetrofit();
    }

    public static MyRetrofit getInstance(){
        if(mInstance == null){
            mInstance = new MyRetrofit();
        }
        return mInstance;
    }


    private Retrofit buildRetrofit() {
        return null;
    }

    private static class RetrofitHelp{
       private static final Retrofit  retrofit=new Retrofit.Builder().baseUrl(ConstantCode.baseurl).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build();
    }
}
