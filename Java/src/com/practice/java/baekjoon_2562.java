package com.practice.java;

import java.util.Scanner;

/*영수증 출력하기 -백준 25304번*/
/*클래스 이름은 Main으로 할것..*/
public class baekjoon_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		int max = num[0];
		int index = 0;
		
		
		for(int i=0; i<9; i++) {
			num[i] = sc.nextInt();
			if(num[i]>max) {
				max = num[i];
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}


