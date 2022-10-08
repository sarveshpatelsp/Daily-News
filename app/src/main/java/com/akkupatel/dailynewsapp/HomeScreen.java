package com.akkupatel.dailynewsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;

public class HomeScreen extends AppCompatActivity {

    Toolbar mtoolbar;

    String api = "7902bb7da4e34f63be4290f53ea2e6ba";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        mtoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);


    }
}