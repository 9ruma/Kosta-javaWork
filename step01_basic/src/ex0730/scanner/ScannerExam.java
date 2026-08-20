package ex0730.scanner;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		
		// 키보드 입력받기
		Scanner sc = new Scanner(System.in); //cmd + shift + o
		
		while(true) {
			System.out.println("1.성적표 2. 종료");
			System.out.print("메뉴 선택 > ");
			int menuChoice = sc.nextInt();
			
			if(menuChoice == 1) {
				System.out.print("이름 = ");
				String name = sc.next();
				
				System.out.print("국어 점수 = ");
				int kor = sc.nextInt();
				
				System.out.print("영어 점수 = ");
				int eng = sc.nextInt();
				
				System.out.println("***" + name + "님 성적표 ***");
				System.out.println("국어 점수 = " + kor);
				System.out.println("영어 점수 = " + eng);
				System.out.println("총합 = " + (kor + eng));
			} else if(menuChoice == 2) {
				break;
			} else {
				System.out.print("메뉴는 1, 2만 입력하세요.\n");
			}
			
		}
		
		System.out.println("다음에 또 이용해주세요.");

	}

}
