package com.sbs.java.ssg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== ���α׷� ���� ==");
		

		Scanner sc = new Scanner(System.in);
		String command;

		System.out.printf("��ɾ�) ");
		command = sc.next();
		System.out.printf("�Էµ� ��ɾ� : %s\n", command);
		int lastArticleId = 0;

		System.out.printf("��ɾ�) ");
		int num = sc.nextInt();
		System.out.printf("�Էµ� ���� : %d\n", num);
		while (true) {
			System.out.printf("��ɾ�) ");
			String command1 = sc.nextLine();

			command1 = command1.trim();

			if (command1.length() == 0) {
				continue;
			}

			if (command1.equals("system exit")) {
				break;
			}
			if (command1.equals("article write")) {
				int id = lastArticleId + 1;
				lastArticleId = id;
				System.out.printf("���� : ");
				String title = sc.nextLine();
				System.out.printf("���� : ");
				String body = sc.nextLine();

				System.out.printf("%d������ �����Ǿ����ϴ�.\n", id);

			} else if (command1.equals("article list")) {
				System.out.println("�Խù��� �����ϴ�.");
			} else {
				System.out.printf("%s(��)�� �������� �ʴ� ��ɾ� �Դϴ�.\n", command1);
			}
		}

		sc.close();
		

		System.out.println("== ���α׷� �� ==");
	}
}