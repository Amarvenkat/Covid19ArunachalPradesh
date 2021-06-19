package com.amar.covid19arunachalpradesh.RetrofitClass;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DailyNews {

@SerializedName("articles")
    private List<Articles> articles;

    public DailyNews(List<Articles> articles) {
        this.articles = articles;
    }

    public List<Articles> getArticles() {
        return articles;
    }

    public void setArticles(List<Articles> articles) {
        this.articles = articles;
    }
}
