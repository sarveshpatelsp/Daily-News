package com.akkupatel.dailynewsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<ModelClass.ArticleClass> Modellist;
    Context context;

    public Adapter(ArrayList<ModelClass.ArticleClass> modellist, Context context) {
        Modellist = modellist;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.top_headlines_layout , parent , false);
        ViewHolder v = new ViewHolder(view);
        return v;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.msource.setText(Modellist.get(position).getSource());
        holder.mtitle.setText(Modellist.get(position).getTitle());
        holder.mdescription.setText((Modellist.get(position)).getDescription());
    }

    @Override
    public int getItemCount() {
        return Modellist.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView msource, mtitle , mdescription;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        msource = itemView.findViewById(R.id.source);
        mtitle = itemView.findViewById(R.id.title);
        mdescription = itemView.findViewById(R.id.description);
        }
    }
}