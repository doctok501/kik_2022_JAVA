package com.KIK.java;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		
		ArrayList articles = new ArrayList();
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		
		
	}
}

class Article {
	static int LastId;
	int id;
	String regDate;

	static {
		LastId = 0;
	}

	Article() {
		this(LastId + 1 , "2022-12-12 12:12:12");
		LastId++;
	}

	Article(int id, String regDate) {
		this.id = id;
		this.regDate = regDate;
	}
}