package com.akkupatel.dailynewsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Toast;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HomeScreen extends AppCompatActivity {

    RecyclerView recyclerView;
    private Adapter adapter;
    ArrayList<ArticleClass> list = new ArrayList<>();
    BroadcastReceiver broadcastReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        broadcastReceiver = new NetworkBroadcast();
        registerReceiver(broadcastReceiver , new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
        recyclerView = findViewById(R.id.recycler_view);
        adapter = new Adapter(list , this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        getNews();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(broadcastReceiver);
    }

    public void getNews()
    {
        String url = "https://newsapi.org/v2/top-headlines?country=in&excludeDomains=stackoverflow.com&sortBy=publishedAt&language=en&apiKey=7902bb7da4e34f63be4290f53ea2e6ba";
        String BASE_URL = "https://newsapi.org/";
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<ModelClass> call = apiInterface.getNews(url);
        call.enqueue(new Callback<ModelClass>() {
            @Override
            public void onResponse(Call<ModelClass> call, Response<ModelClass> response) {
             ModelClass modelClass = response.body();
             ArrayList<ArticleClass> articles = modelClass.getArticles();
             for (int i = 0 ; i < articles.size() ; i++)
             {
                 list.add(new ArticleClass(articles.get(i).getSource(), articles.get(i).getTitle() ,
                         articles.get(i).getDescription(), articles.get(i).getUrlToImage(), articles.get(i).getUrl()));
             }
             adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ModelClass> call, Throwable t) {
                Toast.makeText(HomeScreen.this, "Oops! Something went wrong", Toast.LENGTH_SHORT).show();
            }
        });

    }
}