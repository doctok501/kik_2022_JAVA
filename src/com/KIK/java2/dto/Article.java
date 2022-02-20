package com.KIK.java2.dto;

public class Article {

	public int id;
	public String title;
	public String body;
	public String regDate;
	public int hit;

	public Article(int id, String regDate, String title, String body) {
		this(id, regDate, title, body, 0);
	}
	
	public Article(int id, String regDate, String title, String body, int hit) {
	this.id = id;
		this.title = title;
		this.body = body;
		this.hit = hit;
		this.regDate = regDate;
	}

	public void increaseHit() {
		hit++;
	}

}