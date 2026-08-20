package ex0730.제어문;

public class ForExam02 {

	public static void main(String[] args) {
		//1.  1 ~ 100가지 10행 10열로 출력 (for 문 안에 for 문 이용)
		int num = 0;
				
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				num += 1;
				System.out.print(num + " ");
			}
			System.out.println();
			
		}
				
		//줄바꿈
		System.out.println();
				
		//2. 1 ~ 100가지 10행 10열로 출력 (for 문 안에  if 문 이용)
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
					
			if((i % 10)==0) {
				System.out.println();
			}
					
		}
				
		//줄바꿈
		System.out.println();

		//3. 구구단 출력  -  for 문안에 for 문 이용
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i + "*" + j + " = " + (i * j) + "  ");
					
			}
			System.out.println();
			
		}

	}

}
