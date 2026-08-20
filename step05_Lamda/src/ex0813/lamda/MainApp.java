package ex0813.lamda;

public class MainApp {

	public static void main(String[] args) {
		/* 1. 기존 방식
		AInterface ai = new Test();
		ai. aa();
		*/
		
		/* 2. 익명의 이너클래스 타입으로 작성
		AInterface ai = new AInterface() {
			
			@Override
			public void aa() {
				System.out.println("익명의 이너클래스 aa호출");
				
			}
			
		};
		
		ai.aa();
		*/
		
		/**
		 * 3. 람다식
		 * 	  : 반드시 interface 안에 메소드 한개 있을 경우에 사용할 수 있다.
		 *      FunctionalInterface라고 한다.
		 *      
		 * 문법
		 * 
		 * 1) 인수가 없는 경우
		 * () -> {}
		 * 
		 * 2) 인수가 있는 경우
		 * (변수 이름, ..) -> {}
		 * 
		 * 3) 기능이 한 문장인 경우
		 * () -> 기능
		 * 
		 */
		
		/*
		AInterface ai = () -> {
			System.out.println("인수 없는 람다식..");
		};
		*/
		
		AInterface ai = () -> System.out.println("인수 없는 람다식");
		ai.aa();
		
		BInterface bi = (a) -> System.out.println(a + "가 전달된 인수 있는 람다식");
		bi.bb(7);
		
		/*
		CInterface ci = (a, b) -> {
			return a + b;
		};
		*/
		
		CInterface ci = (a, b) -> a + b;
		
		int re = ci.cc(5, 8);
		System.out.println("re = " + re);
		
	}

}

class Test implements AInterface {
	
	@Override
	public void aa() {
		System.out.println("Test의 aa메소드입니다.");
	}
	
}