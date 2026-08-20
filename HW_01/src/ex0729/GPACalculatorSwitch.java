package ex0729;

public class GPACalculatorSwitch {

	public static void main(String[] args) {
		//본인 이름(String)을 저장할 변수 선언
		String myName = "차준혁";
		
		//국어, 영어, 수학 점수를 저장할 변수 선언
		int kr, en, math;
			
		//국어, 영어, 수학 점수에 45~100 사이 난수 생성
		kr = (int)(Math.random() * 56 + 45);
		en = (int)(Math.random() * 56 + 45);
		math = (int)(Math.random() * 56 + 45);
		
		System.out.println(myName + "님의 국어 점수는 " + kr + "점 입니다.\n" + myName + "님의 영어 점수는 " + en + "점 입니다.\n" + myName + "님의 수학 점수는 " + math + "점 입니다.\n");
		
		//총점 변수 선언
		int total = kr + en + math;
		
		//평균 점수 변수 선언
		double avg = total / 3.0;
		
		//학점 변수 선언
		char grade = 'A';
		
		//학점 계산 (Switch 문)
		switch((int)avg/10) {
			case 10, 9 -> grade = 'A';
			case 8 -> grade = 'B';
			case 7 -> grade = 'C';
			case 6 -> grade = 'D';
			default -> grade = 'F';
		}
		
		System.out.println(myName + "님의 총점은 " + total + "점, 평균 점수는 " + ((int)(avg*100)/100.0) + "점으로 학점은 " + grade + "입니다.");
		
	}

}
