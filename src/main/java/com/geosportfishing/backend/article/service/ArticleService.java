package com.geosportfishing.backend.article.service;

import com.geosportfishing.backend.article.dao.IArticleDao;
import com.geosportfishing.backend.article.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService implements IArticleService {

    @Autowired
    private IArticleDao articleDao;

    @Override
    public Article getArticleById(int articleId) {
        Article obj = articleDao.getArticleById(articleId);
        return obj;
    }

    @Override
    public List<Article> getAllArticles(){
        return articleDao.getAllArticles();
    }

    @Override
    public synchronized boolean createArticle(Article article){
        if (articleDao.articleExists(article.getTitle(), article.getCategory())) {
            return false;
        } else {
            articleDao.createArticle(article);
            return true;
        }
    }

    @Override
    public void updateArticle(Article article) {
        articleDao.updateArticle(article);
    }

    @Override
    public void deleteArticle(int articleId) {
        articleDao.deleteArticle(articleId);
    }
}