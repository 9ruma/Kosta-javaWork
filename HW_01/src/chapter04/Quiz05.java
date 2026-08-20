package chapter04;

public class Quiz05 {

	public static void main(String[] args) {
		
		//방정식 모든 해 구하기
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(((4*x)+(5*y))==60) {
					//방정식 해 출력
					System.out.println("(" + x + ", " + y + ")");
				}
				
			}
			
		}

	}

}
