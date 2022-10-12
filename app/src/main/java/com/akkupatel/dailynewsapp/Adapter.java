package com.akkupatel.dailynewsapp;

import android.content.Context;
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
        holder.msource.setText(Modellist.get(position).getSource());
        holder.mtitle.setText(Modellist.get(position).getTitle());
        holder.mdescription.setText((Modellist.get(position)).getDescription());
        Picasso.get().load(Modellist.get(position).getUrlToImage()).into(holder.mimageView);
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
