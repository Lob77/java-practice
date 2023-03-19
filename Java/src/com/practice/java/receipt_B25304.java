package com.practice.java;

import java.util.Scanner;

/*영수증 출력하기 -백준 25304번*/
/*
 * 1. 클래스 이름 -Main으로 넣기
 * 2. 변수명 문제에서 제시한 것과 동일하게 맞춰주기(N, X, a, b...)
 * 3. 출력문 넣지 말기..*/
public class receipt_B25304 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();/*주어지는 영수증 행 갯수*/
		int X = scanner.nextInt();/*주어지는 총 금액*/
		int a =0;/*물건가격*/		
		int b =0;/*물건갯수*/
		int net =0;
//		System.out.println(X);
//		System.out.println(N);
		for(int i=1; i<= N; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
//			System.out.println(a + " " + b);
			net += a * b;
		}
		if(net == X) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}

