package com.sbs.java.ssg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> nums=new ArrayList<>();
		
		while (true) {
			System.out.printf("명령어)");
			String command = sc.nextLine();
			command.trim();
			

			if (command.length() == 0) {
				continue;
			}
			if (command.equals("system exit")) {
				break;
			} else if (command.equals("num")) {
				System.out.printf("숫자 :");
				int num = sc.nextInt();
				sc.nextLine();
				nums.add(num);
			} else if (command.equals("nums")) {
				System.out.printf("숫자들 : %s\n", nums.toString());
			}
		}
		sc.close();
	}
}