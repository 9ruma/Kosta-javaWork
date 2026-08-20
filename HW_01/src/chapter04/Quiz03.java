package chapter04;

public class Quiz03 {

	public static void main(String[] args) {
		//정수 변수 선
		int num = 0;
		
		//1~100까지 3의 배수 추출
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				num = i;
				
				//출력
				System.out.print(num + " ");
				
			}
			
		}

	}

}
