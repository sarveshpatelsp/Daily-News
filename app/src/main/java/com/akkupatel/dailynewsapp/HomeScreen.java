package com.akkupatel.dailynewsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity {

    RecyclerView recyclerView;
    private Adapter adapter;
    ArrayList<ModelClass.ArticleClass> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        recyclerView = findViewById(R.id.recycler_view);

        list.add(new ModelClass.ArticleClass("Suzuki Shillsalot" , "Dogecoin (DOGE) Price Prediction 2025-2030: Is $0.64 too high a target" , "Disclaimer: The datasets shared in the following article have been compiled from a set of online resources and do not reflect AMBCrypto’s own research on the subject. Memecoins are digital currencies that draw inspiration from online jokes and memes."));
        list.add(new ModelClass.ArticleClass("Suzuki Shillsalot" , "Dogecoin (DOGE) Price Prediction 2025-2030: Is $0.64 too high a target" , "Disclaimer: The datasets shared in the following article have been compiled from a set of online resources and do not reflect AMBCrypto’s own research on the subject. Memecoins are digital currencies that draw inspiration from online jokes and memes."));
        list.add(new ModelClass.ArticleClass("Suzuki Shillsalot" , "Dogecoin (DOGE) Price Prediction 2025-2030: Is $0.64 too high a target" , "Disclaimer: The datasets shared in the following article have been compiled from a set of online resources and do not reflect AMBCrypto’s own research on the subject. Memecoins are digital currencies that draw inspiration from online jokes and memes."));
        list.add(new ModelClass.ArticleClass("Suzuki Shillsalot" , "Dogecoin (DOGE) Price Prediction 2025-2030: Is $0.64 too high a target" , "Disclaimer: The datasets shared in the following article have been compiled from a set of online resources and do not reflect AMBCrypto’s own research on the subject. Memecoins are digital currencies that draw inspiration from online jokes and memes."));
        list.add(new ModelClass.ArticleClass("Suzuki Shillsalot" , "Dogecoin (DOGE) Price Prediction 2025-2030: Is $0.64 too high a target" , "Disclaimer: The datasets shared in the following article have been compiled from a set of online resources and do not reflect AMBCrypto’s own research on the subject. Memecoins are digital currencies that draw inspiration from online jokes and memes."));
        list.add(new ModelClass.ArticleClass("Suzuki Shillsalot" , "Dogecoin (DOGE) Price Prediction 2025-2030: Is $0.64 too high a target" , "Disclaimer: The datasets shared in the following article have been compiled from a set of online resources and do not reflect AMBCrypto’s own research on the subject. Memecoins are digital currencies that draw inspiration from online jokes and memes."));
        list.add(new ModelClass.ArticleClass("Suzuki Shillsalot" , "Dogecoin (DOGE) Price Prediction 2025-2030: Is $0.64 too high a target" , "Disclaimer: The datasets shared in the following article have been compiled from a set of online resources and do not reflect AMBCrypto’s own research on the subject. Memecoins are digital currencies that draw inspiration from online jokes and memes."));
        list.add(new ModelClass.ArticleClass("Suzuki Shillsalot" , "Dogecoin (DOGE) Price Prediction 2025-2030: Is $0.64 too high a target" , "Disclaimer: The datasets shared in the following article have been compiled from a set of online resources and do not reflect AMBCrypto’s own research on the subject. Memecoins are digital currencies that draw inspiration from online jokes and memes."));
        list.add(new ModelClass.ArticleClass("Suzuki Shillsalot" , "Dogecoin (DOGE) Price Prediction 2025-2030: Is $0.64 too high a target" , "Disclaimer: The datasets shared in the following article have been compiled from a set of online resources and do not reflect AMBCrypto’s own research on the subject. Memecoins are digital currencies that draw inspiration from online jokes and memes."));
        list.add(new ModelClass.ArticleClass("Suzuki Shillsalot" , "Dogecoin (DOGE) Price Prediction 2025-2030: Is $0.64 too high a target" , "Disclaimer: The datasets shared in the following article have been compiled from a set of online resources and do not reflect AMBCrypto’s own research on the subject. Memecoins are digital currencies that draw inspiration from online jokes and memes."));

        adapter = new Adapter(list , this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}