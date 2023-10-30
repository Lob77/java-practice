package algorithm;

import java.util.Scanner;

public class Chapter1 {
// 대소문자 변환
  public String solution(String str){
	   	String answer ="";
	    for(char x :str.toCharArray()){
	     if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
	      else answer+= Character.toLowerCase(x);
	       
	    }
	    return answer;
	  }  
	  
	  public static void main(String[] args){
		Chapter1 T = new Chapter1();
	    Scanner kb = new Scanner(System.in);
	    String str = kb.next();
	    System.out.print(T.solution(str));
	  }
			  
}
