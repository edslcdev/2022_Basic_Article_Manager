package com.KoreaIT.java.BAM;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		
		Scanner sc = new Scanner(System.in);
		
		String cmd  = sc.nextLine();
		int number = sc.nextInt();
		
		System.out.println("입력된 명령어 : " + cmd);
		System.out.println("입력된 숫자 : " + number);
		
		sc.close();
		
		System.out.println("== 프로그램 종료 ==");
		
	}
}
