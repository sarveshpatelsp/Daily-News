package com.akkupatel.dailynewsapp;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<ArticleClass> Modellist;
    Context context;

    public Adapter(ArrayList<ArticleClass> modellist, Context context) {
        Modellist = modellist;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_headlines_layout , parent , false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        ArticleClass articles = Modellist.get(position);
        holder.msource.setText(articles.getSource());
        holder.mtitle.setText(articles.getTitle());
        holder.mdescription.setText(articles.getDescription());
        Picasso.get().load(articles.getUrlToImage()).into(holder.mimageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context , OpenNews.class);
                intent.putExtra("title" , articles.getTitle());
                intent.putExtra("desc" , articles.getDescription());
                intent.putExtra("imageURL" , articles.getUrlToImage());
                intent.putExtra("url" , articles.getUrl());
                intent.putExtra("content" , articles.getContent());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return Modellist.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView msource, mtitle , mdescription;
        private ImageView mimageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        msource = itemView.findViewById(R.id.source);
        mtitle = itemView.findViewById(R.id.title);
        mdescription = itemView.findViewById(R.id.description);
        mimageView = itemView.findViewById(R.id.imageView);
        }
    }
}
