package com.practice.java;

import java.util.Scanner;

/*영수증 출력하기 -백준 25304번*/
/*클래스 이름은 Main으로 할것..*/
public class baekjoon_25314 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();//초기에 입력받을 정수값
		
		String init = "int";//초기 문자열 값
		String b = "";//빈 변수
		
		if(N%4==0) { //4의 배수만
			int quotient = N/4;//몫
			for(int i=1; i<=quotient; i++) {
				b += "long"+ " ";//b+"long"+" "
			}
			System.out.println(b+init);
		}
	}
}


