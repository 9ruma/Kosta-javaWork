package ex0729.제어문;

public class IfExam01 {

	public static void main(String[] args) {
		//난수 생성
		int num = (int)(Math.random()*10+1);
		System.out.println("생성된 난수는 "+num+"입니다.");
		
		//1~45 사이 난수 생성
		int num2 = (int)(Math.random()*45+1);
		System.out.println("생성된 1 ~ 45 사이 난수는 "+num2+"입니다.");
		
		//홀수, 짝수 구분
		if(num%2==0) {
			System.out.println(num+"는 짝수입니다.");
		}
		else {
			System.out.println(num+"는 홀수입니다.");
		}
		
		//7의 배수 구분
		if(num%7==0) {
			System.out.println(num+"는 7의 배수입니다.");
		}
		else {
			System.out.println(num+"는 7의 배수가 아닙니다.");
		}

	}

}
