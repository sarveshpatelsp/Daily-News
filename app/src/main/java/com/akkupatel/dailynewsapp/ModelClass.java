package com.akkupatel.dailynewsapp;

import java.util.ArrayList;

public class ModelClass {

    private String status;
    private int totalResult;
    private ArrayList<ArticleClass> articles;

    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(int totalResult) {
        this.totalResult = totalResult;
    }

    public ArrayList<ArticleClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ArticleClass> articles) {
        this.articles = articles;
    }
}