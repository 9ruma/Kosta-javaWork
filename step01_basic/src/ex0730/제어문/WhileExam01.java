package ex0730.제어문;

public class WhileExam01 {

	public static void main(String[] args) {
		//1. 1~ 100가지 한줄로 출력
		int i = 1;
		
		while(i <= 100) {
			System.out.print(i+" ");
			i++;
		}
		
		//줄바꿈
		System.out.println("\n");
		
		//2. A ~Z 까지 한줄로 출력
		char ch  = 'A';
		
		while(ch <= 'Z') {
			System.out.print(ch + " ");
			ch++;
		}
		
		//줄바꿈
		System.out.println("\n");

		//3. 1~ 10 까지  합 구해서 출력
		int sum = 0;
		i = 1;
		
		while(i <= 10) {
			sum += i;
			i++;
		}
		
		System.out.print(sum);
		
		//줄바꿈
		System.out.println("\n");

		//4. 1 ~ 100 사이의 7의 배수만 출력
		int multi7 = 0;
		i = 1;
		
		while(i <= 100) {
			if(i % 7 == 0) {
				multi7 = i;
				System.out.print(multi7 + " ");	
			}
			
			i++;
		}
		
		//줄바꿈
		System.out.println("\n");

		//5. 100 ~ 1 사이의 5 의 배수만 출력 
		int multi5 = 0;
		i = 100;
		
		while(i>=1) {
			if(i % 5 == 0) {
				multi5 = i;
				System.out.print(multi5 + " ");
			}
			
			i--;
		}
		
		//줄바꿈
		System.out.println("\n");
		
		//1.  1 ~ 100가지 10행 10열로 출력 (while 문 안에 while 문 이용)
		int num = 0;
		i = 1;
		
		while(i <= 10) {
			int j = 1;
			
			while(j <= 10) {
				num += 1;
				System.out.print(num + " ");
				j++;
			}
			
			System.out.println();
			i++;
		}
				
		//줄바꿈
		System.out.println();
				
		//2. 1 ~ 100가지 10행 10열로 출력 (while 문 안에  if 문 이용)
		i = 1;
		
		while(i <= 100) {
			System.out.print(i + " ");
			
			if(i % 10 == 0) {
				System.out.println();
			}
			
			i++;
		}
				
		//줄바꿈
		System.out.println();

		//3. 구구단 출력  -  while 문안에 while 문 이용
		i = 2;
		
		while(i <= 9) {
			int j = 1;
			
			while(j <= 9) {
				System.out.print(i + "*" + j + " = " + (i * j) + "  ");
				j++;
			}
			
			System.out.println();
			i++;
		}

	}

}
