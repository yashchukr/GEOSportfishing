package com.geosportfishing.backend.dao;

import com.geosportfishing.backend.model.Article;

import java.util.List;

public interface IArticleDao {
    List<Article> getAllArticles();

    Article getArticleById(int articleId);

    void createArticle(Article article);

    void updateArticle(Article article);

    void deleteArticle(int articleId);

    boolean articleExists(String title, String category);
}
