package ex0803.staticex;

class Test {
	int a; //0
	static int b; //0
	
	//non-static 메소드 안에서는 non-static, static, this 모두 가능하다.
	public void aa() {
		System.out.println(a); //0
		System.out.println(this.a); //0
		
		System.out.println(b); //0
		System.out.println(this.b);  //0
		System.out.println(Test.b);  //0
		
		//메소드 호출
		this.bb();
		bb();
		
		dd();
		this.dd();
		Test.dd();
		
	}
	
	public void bb() {
		
	}
	
	//static 메소드 안에서는 static만 접근 가능, this 사용 불가
	public static void cc() {
		// System.out.println(a); //0 -> Static만 접근 가능
		// System.out.println(this.a); //0 -> this 사용 불가
		
		System.out.println(b); //0
		// System.out.println(this.b);  //0 -> this 사용 불가
		System.out.println(Test.b);  //0
		
		//메소드 호출
		// this.bb(); // this 사용 불가
		// bb(); // Static만 접근 가능
		
		dd();
		// this.dd(); // this 사용 불가
		Test.dd();
		
	}
	
	public static void dd() {
		
	}
	
}

public class StaticVariableExam {
	
	public static void main(String[] args) {
		System.out.println("*** static 변수 알아보자 ***");
		
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);
		
		System.out.println("*** non-static 변수 ***");
		System.out.println("t1.a = " + t1.a);
		System.out.println("t2.a = " + t2.a);
		System.out.println("t3.a = " + t3.a);
		
		//값 변경
		t2.a = 100;
		
		System.out.println("*** non-static 변수(변경 후) ***");
		System.out.println("t1.a = " + t1.a);
		System.out.println("t2.a = " + t2.a);
		System.out.println("t3.a = " + t3.a);
		
		System.out.println("*** static 변수 ***");
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " + t2.b);
		System.out.println("t3.b = " + t3.b);
		System.out.println("Test.b = " + Test.b);
		
		//값 변경
		//t2.b = 50;
		Test.b = 70;
		
		System.out.println("*** static 변수(변경 후) ***");
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " + t2.b);
		System.out.println("t3.b = " + t3.b);
		System.out.println("Test.b = " + Test.b);

	} //Main End

	/**
	 * 프로젝트가 배포될 때 main method보다 먼저 실행되는 영역으로
	 * 주로, DB 연결, 네트워크 점검, 초기치 데이터 로딩 등..
	 * 프로젝트 전반에 해당하는 configuration 설정 및 세팅하는 과정.
	 */
	static {
		System.out.println("static 블록은 main method보다 먼저 실행됩니다.");
	}
	
} //Class End
