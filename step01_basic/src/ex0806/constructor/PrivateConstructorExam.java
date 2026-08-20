package ex0806.constructor;

/*
 * 싱글톤 클래스 작성
 * 1) private 생성자 만든다.
 * 2) 객체를 static 멤버 필드로 선언한다.
 * 3) 객체를 직접 생성해서 반환해주는 메서드를 작성한다.
 * 
 */
class Test {
	
	static Test instance = new Test();
	private Test() {}
	
	public static Test getInstance() {
		//instance = new Test();
		return instance;
	
	}

}

public class PrivateConstructorExam {

	public static void main(String[] args) {
		//new Test(); // private 생성자이므로 외부에서 객체 생성 X
		
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		
		System.out.println(t1);
		System.out.println(t2);

	}

}
