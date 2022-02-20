package com.KIK.java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.KIK.java.Util;
import com.KIK.java2.dto.Article;

public class App {
	private static List<Article> articles;

	static {
		articles = new ArrayList<>();
	}

	public void start() {
		System.out.println("==���α׷� ����==");

		makeTestData();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.printf("��ɾ�) ");
			String command = sc.nextLine().trim();

			if (command.length() == 0) {
				continue;
			}
			if (command.equals("system exit")) {
				break;
			}

			if (command.equals("article write")) {
				int id = articles.size() + 1;
				String regDate = Util.getNowDateTimeStr();
				System.out.printf("���� : ");
				String title = sc.nextLine();
				System.out.printf("���� : ");
				String body = sc.nextLine();

				Article article = new Article(id, regDate, title, body);
				articles.add(article);

				System.out.printf("%d������ �����Ǿ����ϴ�\n", id);
			} else if (command.equals("article list")) {
				System.out.println("�Խñ��� �����ϴ�.");
				if (articles.size() == 0) {
					System.out.println("�Խù��� �����ϴ�.");
					continue;
				}
				System.out.println("��ȣ    |  ��ȸ  |  ����");
				for (int i = articles.size() - 1; i >= 0; i--) {
					Article article = articles.get(i);

					System.out.printf("%d	|  %d  | %s\n", article.id, article.hit, article.title);
				}
			} else if (command.startsWith("article detail ")) {
				String[] commandBits = command.split(" ");
				int id = Integer.parseInt(commandBits[2]);

				Article foundArticle = null;

				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);

					if (article.id == id) {
						foundArticle = article;
						break;
					}
				}

				if (foundArticle == null) {
					System.out.printf("%d�� �Խù��� �������� �ʽ��ϴ�.\n", id);
					continue;
				}

				foundArticle.increaseHit();

				System.out.printf("��ȣ : %d\n", foundArticle.id);
				System.out.printf("��¥ : %s\n", foundArticle.regDate);
				System.out.printf("���� : %s\n", foundArticle.title);
				System.out.printf("���� : %s\n", foundArticle.body);
				System.out.printf("��ȸ�� : %d\n", foundArticle.hit);

			} else if (command.startsWith("article delete ")) {
				String[] commandBits = command.split(" ");
				int id = Integer.parseInt(commandBits[2]); // "1" -> 1
				int foundIndex = -1;
				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);
					if (article.id == id) {
						foundIndex = i;
						break;
					}
				}
				if (foundIndex == -1) {
					System.out.printf("%d�� �Խù��� �������� �ʽ��ϴ�.\n", id);
					continue;
				}
				articles.remove(foundIndex);
				System.out.printf("%d�� �Խù��� �����Ǿ����ϴ�.\n", id);
			} else {
				System.out.printf("%s��(��) �������� �ʴ� ��ɾ� �Դϴ�.\n", command);
			}

		}
		sc.close();
		System.out.println("== ���α׷� �� ==");
	}

	private static void makeTestData() {
		System.out.println("�׽�Ʈ�� ���� �����͸� �����մϴ�.");

		articles.add(new Article(1, Util.getNowDateTimeStr(), "���� 1", "���� 1"));
		articles.add(new Article(2, Util.getNowDateTimeStr(), "���� 2", "���� 2"));
		articles.add(new Article(3, Util.getNowDateTimeStr(), "���� 3", "���� 3"));

	}

}
