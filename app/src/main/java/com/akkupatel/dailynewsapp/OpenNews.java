package com.akkupatel.dailynewsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class OpenNews extends AppCompatActivity {

    private String title , desc , content , url , imageURL;

    private TextView mtitle , mdescription ;
    private ImageView mimageView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_news);
        title = getIntent().getStringExtra("title");
        content = getIntent().getStringExtra("content");
        desc = getIntent().getStringExtra("desc");
        url = getIntent().getStringExtra("url");
        imageURL = getIntent().getStringExtra("imageURL");
        mtitle = findViewById(R.id.titleOpen);
        mdescription = findViewById(R.id.descriptionOpen);
        mimageView = findViewById(R.id.imageViewOpen);
        mtitle.setText(title);
        mdescription.setText(desc);
        Picasso.get().load(imageURL).into(mimageView);
    }
}