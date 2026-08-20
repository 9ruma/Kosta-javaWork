package chapter04;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//잔액, 예금액, 출금액 변수 선언 및 초기화
		int balance = 0;
		int deposit = 0;
		int withdraw = 0;
		
		outer:
		while(true) {
			//예금, 출금, 조회, 종료 선택
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------------");
			System.out.println();
			System.out.print("선택> ");
			int menuChoice = sc.nextInt();
			
			switch(menuChoice) { 
				//예금
				case 1 -> {
					System.out.print("예금액> ");
					deposit = sc.nextInt();
					balance += deposit;
					System.out.println();
				}
				//출금
				case 2 -> {
					System.out.print("출금액> ");
					withdraw = sc.nextInt();
					balance -= withdraw;
					System.out.println();
				}
				//잔액 조회
				case 3 -> {
					System.out.println("잔액> " + balance);
					System.out.println();
				}
				//종료
				case 4 -> { 
					System.out.println();
					System.out.println("프로그램 종료");
					break outer;
				}

			}
			
		}

	}

}
