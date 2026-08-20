package ex0807.inheritance;

class Car {
	public String carname;
	public int cost;
	
	protected void printAttributes() {
		System.out.println("carname="+carname+"\tcost="+cost);
	
	}
	
}

// Car를 상속받는 EfSonata, Excel, Carnival 3개 클래스 작성	
// 각 클래스에 인수를 받지않는 생성자 작성
// 각 클래스의 생성자의 구현부에서 carname과 cost에 적당한 값 할당

class EfSonata extends Car {
	int i = 10;
	
	public EfSonata () {
		// super();
		carname = "sonata";
		cost = 9999;
		
	}
	
}

class Excel extends Car {
	
	public Excel () {
		// super();
		carname = "excel";
		cost = 8888;
		
	}
	
}

class Carnival extends Car {
	
	public Carnival () {
		// super();
		carname = "carnival";
		cost = 7777;
		
	}
	
}


public class InheritanceExam {
	// 메인메소드에서 
	// Car, EfSonata, Excel, Carnival 네개의 객체를 생성
	// 각 클래스에서 Car calss에있는 printAttributes()메소드를 호출할수있다.
	public static void main(String[] args) {
		Car car = new Car();
		EfSonata ef = new EfSonata();
		Excel ex = new Excel();
		Carnival cn = new Carnival();
		
		System.out.println("-----------------");
		System.out.println("car = " + car);
		System.out.println("ef = " + ef);
		System.out.println("ex = " + ex);
		System.out.println("cn = " + cn);
		
		car.printAttributes();
		ef.printAttributes();
		ex.printAttributes();
		cn.printAttributes();
		
	}
	
}

