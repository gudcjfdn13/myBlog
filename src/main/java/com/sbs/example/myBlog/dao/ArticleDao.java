package com.sbs.example.myBlog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sbs.example.myBlog.dto.Article;

@Mapper
public interface ArticleDao {

	List<Article> getArticles();
	
}
