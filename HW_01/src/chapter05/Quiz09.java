package chapter05;

import java.util.Scanner;

class ScoreCalculatorMethod {
	
	//점수 리스트 출력 메소드
	public void ScoreList(int[] arr) {
		int arrLength = arr.length;
		
		for(int i = 0; i < arrLength; i++) System.out.printf("학생 %d 점수 > %d%n", (i+1), arr[i]);
		
	}
	
	//점수 분석 출력 메소드
	public void ScoreAnalyze(int[] arr, int a) {
		System.out.println("최고 점수는 " + HighestScoreCalculator(arr));
		System.out.printf("평균 점수는 %.2f%n", AvgScoreCalculator(arr, a));
		
	}
	
	//평균 계산 메소드
	private double AvgScoreCalculator(int[] arr, int a) {
		int arrLength = arr.length;
		double sum = 0;
		double avgScore = 0;
		
		for(int i = 0; i < arrLength; i++) {
			sum += arr[i];
		}
		
		avgScore = (double)sum / a;
		
		return avgScore;
	}
	
	//최고 점수 계산 메소드
	private int HighestScoreCalculator(int[] arr) {
		
		int max = arr[0];
		int arrLength = arr.length;
		
		for(int i = 1; i < arrLength; i++) if (max < arr[i]) max = arr[i];
		
		return max;
	}
	
}

public class Quiz09 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ScoreCalculatorMethod ca = new ScoreCalculatorMethod();
		
		int studentNum = 0;
		int[] scores = new int[0];
		
		outer:
		while(true) {
			
			int menuChoice = 0;
			
			//프로그램 메뉴 선택 출력
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------------");
			System.out.println();
			System.out.print("선택 > ");
			menuChoice = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			//메뉴별 실행
			switch(menuChoice) {
				
				//학생 수 입력
				case 1 -> {
					System.out.print("학생수 > ");
					studentNum = Integer.parseInt(sc.nextLine());
					scores = new int[studentNum];
					
				}
				
				//점수 입력
				case 2 -> {
					for(int i = 0; i < studentNum; i++) {
						System.out.printf("학생 %d 점수 > ", (i + 1));
						scores[i] = Integer.parseInt(sc.nextLine());
						
					}
					
				}
				
				//점수 리스트
				case 3 -> ca.ScoreList(scores);
				
				//점수 분석
				case 4 -> ca.ScoreAnalyze(scores, studentNum);
				
				//프로그램 종료
				case 5 -> {
					System.out.println("프로그램 종료");
					
					break outer;
					
				}
				
			}
			
		}
		
	}

}
