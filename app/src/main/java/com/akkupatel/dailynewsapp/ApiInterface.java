package com.akkupatel.dailynewsapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    String BASE_URL = "https://newsapi.org/v2/";

    @GET("top-headlines")
    Call<ArticleClass> getNews(
            @Query("country") String country,
            @Query("pageSize") String pagesize,
            @Query("apiKey") String apikey
    );

    @GET("top-headlines")
    Call<ArticleClass> getCategoryNews(
            @Query("country") String country,
            @Query("category") String category,
            @Query("pageSize") String pagesize,
            @Query("apiKey") String apikey
    );
}
