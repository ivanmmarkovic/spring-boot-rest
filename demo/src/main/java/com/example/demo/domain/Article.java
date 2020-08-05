package com.example.demo.domain;

import java.time.LocalDateTime;

public class Article {
	
	private int id;
	private String title;
	private String body;
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
	
	public Article() {
		this.createdAt = LocalDateTime.now();
		this.modifiedAt = this.createdAt;
	}
	public Article(String title, String body) {
		this();
		this.title = title;
		this.body = body;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(LocalDateTime modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	
	
}
