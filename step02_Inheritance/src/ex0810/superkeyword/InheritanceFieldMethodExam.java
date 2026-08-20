package ex0810.superkeyword;

class Animal {
	int age = 5;
	String bodyColor;
	
	public void sound() {
		System.out.println("super의 sound call...");
		
	}
	
	public void eat() {
		System.out.println("super의 eat call...");
		
	}
	
}

class Cat extends Animal { // Cat is a Animal 성립
	int age = 10;
	int weight;
	
	@Override // annotation (annotation은 @를 뜻하고 클래스, 메소드, 필드 위에 선언)
	public void sound() {
		System.out.println("Cat의 sound call...");
		
	}
	
	public void run() {
		System.out.println("Cat의 run call...");
		
	}
	
	public void test() {
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
		
		System.out.println("-------------------------");
		
		System.out.println(bodyColor);
		System.out.println(this.bodyColor);
		System.out.println(super.bodyColor);
		
		System.out.println("-------------------------");

		System.out.println(weight);
		System.out.println(this.weight);
		// System.out.println(super.weight);
		
		System.out.println("===== 메소드 호출 ======");
		
		sound();
		this.sound();
		super.sound();
		
		System.out.println("-------------------------");
		
		eat();
		this.eat();
		super.eat();
		
		System.out.println("-------------------------");
		
		run();
		this.run();
		// super.run();
		
	}
	
}

public class InheritanceFieldMethodExam {
	
	public static void main(String[] args) {
		// Cat c = new Cat();
		// c.test ();
		
		Cat c = new Cat();
		System.out.println("--- 외부에서 객체 생성 ---");
		System.out.println(c.age);
		System.out.println(c.bodyColor);
		System.out.println(c.weight);
		
		c.sound();
		c.eat();
		c.run();
		
		System.out.println("-------------------------");
		
		Animal an = new Cat();
		
		System.out.println(an.age);
		System.out.println(an.bodyColor);
		// System.out.println(an.weight); // 캐스팅 필요
		
		// 재정의된 메소드는 부모 타입이라도 재정의된 메소드가 호출된다.
		an.sound();
		an.eat();
		// an.run(); // 캐스팅 필요
		
		System.out.println("an =  " + an);
		
		/*
		if(an instanceof Cat) {
			Cat cat = (Cat)an; //ObjectDownCasting
			System.out.println("cat =  " + cat);
			
			cat.run();
		}
		*/
		
		if(an instanceof Cat cat) {
			System.out.println("cat =  " + cat);
			
			cat.run();
		}
		
	}
	
}
