package ex0730.제어문;

public class ForExam01 {

	public static void main(String[] args) {
		//1. 1~ 10지 한줄로 출력
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
		}
		
		//줄바꿈
		System.out.println("\n");
		
		//2. A ~Z 까지 한줄로 출력
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch + " ");
		}
		
		//줄바꿈
		System.out.println("\n");

		//3. 1~ 10 까지  합 구해서 출력
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		//줄바꿈
		System.out.println();

		//4. 1 ~ 100 사이의 7의 배수만 출력 
		int multi7 = 0;
		
		for(int i=1; i<=100; i++) {
			if(i % 7 == 0) {
				multi7 = i;
				System.out.print(multi7 + " ");
			}
		}
		
		//줄바꿈
		System.out.println("\n");

		//5. 100 ~ 1 사이의 5 의 배수만 출력 
		int multi5 = 0;
		
		for(int i=100; i>=1; i--) {
			if(i % 5 == 0) {
				multi5 = i;
				System.out.print(multi5 + " ");
			}
		}

	}

}
