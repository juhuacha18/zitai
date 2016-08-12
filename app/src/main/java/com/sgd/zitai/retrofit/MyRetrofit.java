package com.sgd.zitai.retrofit;




import com.sgd.zitai.constants.ConstantCode;
import com.sgd.zitai.retrofit.service.ArticleService;
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
    private final OkHttpClient mHttpClient;

    /* 单例 */
    private static MyRetrofit mInstance;

    /* 超时时间 */
    private static final int TIMEOUT_IN_SECOND = 15;


    /* Retrofit对象 */
    private Retrofit mRetrofit;


    public MyRetrofit() {
        mHttpClient = new OkHttpClient();
        mHttpClient.setConnectTimeout(TIMEOUT_IN_SECOND,TimeUnit.SECONDS);
        mHttpClient.setReadTimeout(TIMEOUT_IN_SECOND,TimeUnit.SECONDS);
        mRetrofit = buildRetrofit();
    }

    public static MyRetrofit getInstances(){
        if(mInstance == null){
            mInstance = new MyRetrofit();
        }
        return mInstance;
    }


    private Retrofit buildRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(mHttpClient)
                .build();
    }


    public static Retrofit getInstance(){
        return RetrofitHelp.retrofit;
    }

    private static class RetrofitHelp{
       private static final Retrofit  retrofit=new Retrofit.Builder()
               .baseUrl(ConstantCode.baseurl)
               .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
               .addConverterFactory(GsonConverterFactory.create())
               .build();
    }

    /* 文字Fragment的请求 */
    public ArticleService getArticleService() {
        return mRetrofit.create(ArticleService.class);
    }
}
