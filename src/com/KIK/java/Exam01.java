package com.KIK.java;

public class Exam01 {
	public static void main(String[] args) {
		App.start();
	}
}

class App {
	public static int a = 10;

	static {
		a = 10;
	}

	public static void start() {
		makeTestData();
		System.out.println(a);
	}

	private static void makeTestData() {
		a = 5;

	}
}