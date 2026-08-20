package chapter04;

public class Quiz06 {

	public static void main(String[] args) {
		//별 패턴
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			//줄바꿈
			System.out.println();
		}

	}

}
