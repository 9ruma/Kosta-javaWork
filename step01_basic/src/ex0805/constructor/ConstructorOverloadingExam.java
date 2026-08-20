package ex0805.constructor;

class Puppy3{
	
	/* String 타입 전역 변수 선언
	 * int 타입 전역 변수 선언
	 */
	String str;
	int a;
	
	/* 인수가 없는 생성자 작성
	 * String 타입 전역변수에 "메리" 할당
	 * "public Puppy3() 호출되었습니다"출력
	 * 전역변수 출력
	 */		
	public Puppy3() {
		this.str = "메리";
		System.out.println("public Puppy3() 호출되었습니다");
		System.out.println(str + " " + a);
	}
	
	/* String 타입의 인수 1개를 받는 생성자 작성
	 * String 타입 전역변수에 인수 할당
	 * "public Puppy3() 호출되었습니다"출력
	 * 전역변수 출력
	 */		
	public Puppy3(String s) {
		this.str = s;
		System.out.println("public Puppy3(String s) 호출되었습니다");
		System.out.println(str + " " + a);
		
	}
	
	
	/* String 타입의 인수 2개를 받는 생성자 작성
	 * 인수 2개를 하나의 String으로 만들어
	 * String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
	 * "public Puppy3() 호출되었습니다"출력
	 */		
	public Puppy3(String s1, String s2) {
		this(s1 + " " + s2);
		System.out.println("public Puppy3(String s1, String s2) 호출되었습니다");
	}
	
	
	/* boolean 타입의 인수 1개를 받는 생성자 작성
	 * 인수를 "쫑"과 붙여 하나의 String으로 만들어
	 * String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
	 * "public Puppy3() 호출되었습니다" 출력
	 */					
	public Puppy3(boolean b) {
		this(b + " " + "쫑");
		System.out.println("public Puppy3(boolean b) 호출되었습니다");
	}
	
	
	/* char 타입의 인수 1개를 받는 생성자 작성
	 * 인수가 없는 생성자를 호출하고
	 * 인수로 받은 data를 int 타입 전역변수에 할당	
	 * "public Puppy3()호출되었습니다"출력
	 * int 형 전역변수출력
	 */			
	public Puppy3(char c) {
		this();
		this.a = c;
		System.out.println("public Puppy3(char c) 호출되었습니다");
		System.out.println(a);
	}
	
	
	/* 메소드 printMemberVariable
	 * 리턴 없음
	 * 전역변수를 출력
	 */	
	public void printMemberVariable() {
		System.out.println(str + " " + a);
	}

	
}

public class ConstructorOverloadingExam{
		//메인메소드에서
		public static void main(String [] args){
			//Puppy3 클래스의 각 생성자를 한번씩 이용해 객체 5개 생성
			
			System.out.println("===== 1 ======================");
			Puppy3 pp1 = new Puppy3();
			System.out.println("===== 2 ======================");
			Puppy3 pp2 = new Puppy3("준혁");
			System.out.println("===== 3 ======================");
			Puppy3 pp3 = new Puppy3("Java", "Hi");
			System.out.println("===== 4 ======================");
			Puppy3 pp4 = new Puppy3(true);
			System.out.println("===== 5 ======================");
			Puppy3 pp5 = new Puppy3('b');
			
			System.out.println("pp1 = " + pp1);
			System.out.println("pp2 = " + pp2);
			System.out.println("pp3 = " + pp3);
			System.out.println("pp4 = " + pp4);
			System.out.println("pp5 = " + pp5);
			
			
			//각 객체의 printMemberVariable메소드를 한번씩 호출
			System.out.println("===== 1 ======================");
			pp1.printMemberVariable();
			System.out.println("===== 2 ======================");
			pp2.printMemberVariable();
			System.out.println("===== 3 ======================");
			pp3.printMemberVariable();
			System.out.println("===== 4 ======================");
			pp4.printMemberVariable();
			System.out.println("===== 5 ======================");
			pp5.printMemberVariable();
			
	}
		
}