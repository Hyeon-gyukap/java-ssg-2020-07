package com.sbs.java.ssg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		

		Scanner sc = new Scanner(System.in);
		String command;

		System.out.printf("명령어) ");
		command = sc.next();
		System.out.printf("입력된 명령어 : %s\n", command);
		int lastArticleId = 0;

		System.out.printf("명령어) ");
		int num = sc.nextInt();
		System.out.printf("입력된 숫자 : %d\n", num);
		while (true) {
			System.out.printf("명령어) ");
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
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();

				System.out.printf("%d번글이 생성되었습니다.\n", id);

			} else if (command1.equals("article list")) {
				System.out.println("게시물이 없습니다.");
			} else {
				System.out.printf("%s(은)는 존재하지 않는 명령어 입니다.\n", command1);
			}
		}

		sc.close();
		

		System.out.println("== 프로그램 끝 ==");
	}
}