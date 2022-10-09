package com.akkupatel.dailynewsapp;

import java.util.ArrayList;

public class ModelClass {

    private String status , totalResult;
    private ArrayList<ArticleClass> articles;

    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(String totalResult) {
        this.totalResult = totalResult;
    }

    public ArrayList<ArticleClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ArticleClass> articles) {
        this.articles = articles;
    }


    public static class ArticleClass {
        private String source, title, description, url, urlToImage, publishedAt;

        public ArticleClass(String source, String title, String description) {
            this.source = source;
            this.title = title;
            this.description = description;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrlToImage() {
            return urlToImage;
        }

        public void setUrlToImage(String urlToImage) {
            this.urlToImage = urlToImage;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }
    }
}