package com.akkupatel.dailynewsapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiInterface {

    @GET
    Call<ModelClass> getNews(@Url String url);

}
