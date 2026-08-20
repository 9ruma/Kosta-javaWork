package ex0731;

import java.util.Scanner;

class GPACalculatorMethod {
	
	//총점 계산 메소드
	private int totalCalc(int a, int b, int c) {		
		int sum = a + b + c;	
		
		return sum;
			
	}
	
	//평균 계산 메소드
	private double avgCalc(int a, int b, int c, double d) {
		double avg = (a + b + c) / d;
			
		return avg;
			
	}
	
	//등급 계산 메소드
	private char gradeCalc(double d) {
		char grade = 'A';
		
		switch((int)d/10) {
			case 10, 9 -> grade = 'A';
			case 8 -> grade = 'B';
			case 7 -> grade = 'C';
			case 6 -> grade = 'D';
			default -> grade = 'F';
		
		}
		
		return grade;
		
	}
	
	//총점, 평균, 등급 출력 메소드
	public void gpaPrint(String str, int a, int b, int c) {
		System.out.println("총점은 : " + totalCalc(a, b, c));
		System.out.println("평균은 : " + avgCalc(a, b, c, 3.0));
		System.out.println("등급은 : " + gradeCalc(avgCalc(a, b, c, 3.0)));
		System.out.println();
		
	}
	
}

public class GPACalculatorV2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		GPACalculatorMethod cal = new GPACalculatorMethod();
		
		//이름, 점수(국어, 영어, 수학) 변수
		String name = " ";
		int kor, eng, math = 0;
		
		outer:
		while(true) {
			
			//선택한 메뉴 변수
			int menuChoice = 0;
			
			//메뉴 출력
			System.out.println("1. 성적표 구하기 2. 종료");
			System.out.println();
			System.out.print("메뉴 선택 > ");
			menuChoice = Integer.parseInt(scanner.nextLine());
			
			System.out.println();
			
			switch(menuChoice) {
				//이름, 점수(국어, 영어, 수학) 점수 입력 받기
				case 1 -> {
					System.out.print("이름 > ");
					name = scanner.nextLine();
					
					System.out.print("국어 > ");
					kor = Integer.parseInt(scanner.nextLine());
					
					System.out.print("영어 > ");
					eng = Integer.parseInt(scanner.nextLine());
					
					System.out.print("수학 > ");
					math = Integer.parseInt(scanner.nextLine());
					
					cal.gpaPrint(name, kor, eng, math);
				}
				//프로그램 종료
				case 2 -> {
					System.out.println("프로그램 종료");
					
					break outer;
					
				}
				
			}
			
		}
		
	}

}
