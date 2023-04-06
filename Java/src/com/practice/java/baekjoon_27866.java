package com.practice.java;

import java.util.Scanner;

/*묹자열 출력하기 -백준 27866번*/
/*클래스 이름은 Main으로 할것..*/
public class baekjoon_27866 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();//초기에 입력받을 단어
		int num = scanner.nextInt();//초기에 입력받을 정수 자릿수
		String[] arr = word.split("");
		
		System.out.println(arr[num-1]);
	}
}


