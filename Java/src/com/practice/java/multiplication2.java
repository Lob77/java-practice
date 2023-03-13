package com.practice.java;

import java.util.Scanner;

/*간단한 구구단 예제2-구구단을 계산할 숫자를 입력받아서 실행결과를 출력하기*/
public class multiplication2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1에서 9사이의 숫자 한 개를 입력하세요:" );
		int x = scanner.nextInt();
		if(x >10) {
			System.out.println("1에서 9사이의 숫자를 다시 입력해주세요");
			x = scanner.nextInt();
		}else{		
			System.out.println(x + "단");
				for(int i=1; i<=9; i++) {
					System.out.println(x+" * "+i+" = "+(x*i));
			}
		}
	}
}

