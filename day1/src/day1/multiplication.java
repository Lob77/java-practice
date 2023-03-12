package day1;

/*간단한 구구단 예제*/
public class multiplication {
	public static void main(String[] args) {
		int x = 2;
		int y = 1;
		
		for(int i=x; i<=9; i++) {
			System.out.println(i + "단");
			for(int j=y; j<=9; j++) {				
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println(System.lineSeparator());
		}
	}
}
