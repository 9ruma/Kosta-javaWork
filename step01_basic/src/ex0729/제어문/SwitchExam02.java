package ex0729.제어문;

public class SwitchExam02 {

	public static void main(String[] args) {
		//1~12 사이 난수 생성
		int month = (int)(Math.random() * 12 + 1);
		System.out.println("생성된 난수는 " + month + "입니다.");

		int endDay = 31;
		
		/*
		switch(month) {
			case 2 : endDay = 28; break;
			case 4, 6, 9, 11 : endDay = 30; break; //version 14 이후만 가능
			default : endDay = 31;
		}
		*/
		
		/*
		switch(month) {
			case 2 -> endDay = 28;
			case 4, 6, 9, 11 -> endDay = 30; //version 14 이후만 가능
			default -> endDay = 31;
		}	
		*/
		
		/*
		endDay = switch(month) {
			case 2 -> 28;
			case 4, 6, 9, 11 -> 30; //version 14 이후만 가능
			default -> 31;
		};
		*/
		
		//위 문제를 if 문으로 변경
		if(month==2) endDay = 28;
		else if(month==4 || month==6 || month==9 || month==11) endDay = 30;
		else endDay = 31;
		
		//출력
		System.out.println(month + "월은 " + endDay + "일 입니다.");
		
	}

}
