package com.sgd.zitai.retrofit.service;

import com.sgd.zitai.bean.TextEntity;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

public interface ArticleService {

    @GET("/zitai-server/index.php/Articles/getarticles")
    Observable<TextEntity> getArticle(@Query("page")int page, @Query("userId")String userId);

}
