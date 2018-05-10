package com.hamdi.gestionStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamdi.gestionStock.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long>{

}
