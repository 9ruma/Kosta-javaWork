package ex0729.제어문;

public class SwitchExam01 {

	public static void main(String[] args) {
		//1~12 사이 난수 생성
		int num = (int)(Math.random() * 12 + 1);
		System.out.println("생성된 난수는 " + num + "입니다.");
				
		//요일 문자열 생성
		String day = "Sat";
		
		//Switch 구문
		switch(num) {
			//발생한 난수가 1이면 일요일
			case 1 : day = "Sun"; break;
			//발생한 난수가 2이면 월요일
			case 2 : day = "Mon"; break;
			//발생한 난수가 3이면 화요일
			case 3 : day = "Tue"; break;
			//발생한 난수가 4이면 수요일
			case 4 : day = "Wed"; break;
			//발생한 난수가 5이면 목요일
			case 5 : day = "Thu"; break;
			//발생한 난수가 6이면 금요일
			case 6 : day = "Fri"; break;
			//발생한 난수가 7~12이면 토요일
			//day 기본값이 "Sat"이므로 생략 가능
			//default : day = "Sat";
		}

		//출력
		System.out.println(day);
		
	}

}
