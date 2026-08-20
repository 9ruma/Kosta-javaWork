package ex0730;

public class StarPattern {

	public static void main(String[] args) {
		
		//기본 별 패턴
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			//줄바꿈
			System.out.println();
		}
		
		System.out.println("==========");
		
		//상하 역방향 별 패턴
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			//줄바꿈
			System.out.println();
		}
		
		System.out.println("==========");
		
		//좌우 역방향 별 패턴
		for(int i=1; i<=5; i++) {
			
			//공백 출력
			for(int j=1; j<=(5-i); j++) {
				System.out.print(" ");
			}
			
			//별 출력
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			//줄바꿈
			System.out.println();
		}
		
		System.out.println("==========");
		
		//상하좌우 역방향 별 패턴
		for(int i=0; i<5; i++) {
			
			//공백 출력
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			
			//별 출력
			for(int j=0; j<(5-i); j++) {
				System.out.print("*");
			}
			//줄바꿈
			System.out.println();
		}

	}

}
