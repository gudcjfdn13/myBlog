package com.sbs.example.myBlog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Article {
	private int id;
	private String regDate, updateDate, title, body;
	
}
