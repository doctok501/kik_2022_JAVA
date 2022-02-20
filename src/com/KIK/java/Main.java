package com.KIK.java;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		
		ArrayList articles = new ArrayList();
		articles.add(new Article1());
		articles.add(new Article1());
		articles.add(new Article1());
		articles.add(new Article1());
		articles.add(new Article1());
		
		
	}
}

class Article1 {
	static int LastId;
	int id;
	String regDate;

	static {
		LastId = 0;
	}

	Article1() {
		this(LastId + 1 , "2022-12-12 12:12:12");
		LastId++;
	}

	public Article1(int i, String string) {
	
	}

	void Article(int id, String regDate) {
		this.id = id;
		this.regDate = regDate;
	}
}