package com.geosportfishing.backend.service;

import com.geosportfishing.backend.entity.Article;

import java.util.List;

public interface IArticleService {

    List<Article> getAllArticles();

    Article getArticleById(int articleId);

    boolean createArticle(Article article);

    void updateArticle(Article article);

    void deleteArticle(int articleId);
}
