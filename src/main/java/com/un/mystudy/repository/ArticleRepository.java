package com.un.mystudy.repository;

import com.un.mystudy.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long>  {
}
