package chapter04;

public class Quiz04 {

	public static void main(String[] args) {
		
		while(true) {
			//두 개의 주사위를 던졌을 때 나오는 난수 생성
			int diceNum1 = (int)(Math.random() * 6 + 1);
			int diceNum2 = (int)(Math.random() * 6 + 1);
			
			//주사위 눈 출력
			System.out.println("( " + diceNum1 + " , " + diceNum2 + " )");
			
			//주사위 눈 합 5일 경우 종료
			if((diceNum1 + diceNum2)==5) {
				System.out.println("( " + diceNum1 + " , " + diceNum2 + " )" + " => 주사위 눈의 합 5");
				break;
			}
			
		}

	}

}
