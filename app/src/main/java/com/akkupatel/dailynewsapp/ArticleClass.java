package com.akkupatel.dailynewsapp;

import com.google.gson.annotations.SerializedName;

public class ArticleClass {
    @SerializedName("author")
    private String source;
    private String title, description, url, urlToImage, publishedAt , content;

    public ArticleClass(String source, String title, String description , String urlToImage , String content) {
        this.source = source;
        this.title = title;
        this.description = description;
        this.urlToImage = urlToImage;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}