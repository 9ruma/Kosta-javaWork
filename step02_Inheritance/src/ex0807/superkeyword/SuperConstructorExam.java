package ex0807.superkeyword;

class Parent {
	
	/*
	Parent() {
		System.out.println(1);
	}
	*/
	Parent(int i) {
		System.out.println(2);
	}
	
	Parent(String s) {
		System.out.println(3);
		
	}
	
}

class Child extends Parent {
	
	Child() {
		// super();
		this(2);
		System.out.println(4);
	}
	
	Child(int i) {
		// super();
		super(i);
		System.out.println(5);
	}
	
	Child(boolean b) {
		// super();
		super("Hi");
		System.out.println(6);
		
	}
	
}

public class SuperConstructorExam {

	public static void main(String[] args) {
		
		// new Child(); // 1 4
		// new Child(10); // 1 5

		// 결론 : 자식 생성자 구현부 첫번째 줄에 super()가 생략되어 있다.
		
		// 만약 부모의 생성자가 하나도 없다면
		// new Child(); // 4
		// new Child(10); // 5
		// new Child(true); // 6
		
		// 결론 : 생성자를 한개도 작성하지 않으면 기본 생성자가 자동으로 삽입됨.
		
		// 부모의 기본 생성자는 없고, 인수가 있는 생성자만 있는 경우
		// => 자식 생성자 구현부 첫번째 줄에서 모두 에러 발생
		// => 반드시 자식 생성자 구현부 첫번째 줄에서 super()가 아닌 다른 생성자를 인위적으로 호출해야 한다.
		
		new Child(); // 2 5 4
		
	}

}
