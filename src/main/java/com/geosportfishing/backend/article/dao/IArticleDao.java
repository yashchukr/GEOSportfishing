package com.geosportfishing.backend.article.dao;

import com.geosportfishing.backend.article.entity.Article;

import java.util.List;

public interface IArticleDao {
    List<Article> getAllArticles();

    Article getArticleById(int articleId);

    void createArticle(Article article);

    void updateArticle(Article article);

    void deleteArticle(int articleId);

    boolean articleExists(String title, String category);
}
