package ex0810.abstract_final;

//Error 를 수정하고 이유를 주석으로 처리하세요.

final class FinalClassExam { // 상속 불가, 생성 가능
	final int i = -999999; // 값 변경 불가

}


abstract class AbstractClassExam { // 상속 가능, 생성 불가
	abstract String abstractMethodExam(int i, String s); // body 없다. 재정의를 위해서 만든다.
	final int finalMethodExam(int i, int j) { // 재정의 불가
        return i + j;
        
    }
	
}


class Sample01 extends AbstractClassExam {
	String abstractMethodExam(int i,String s) {
		System.out.println("return "+s+i);
		
		return s + i;
		
	}
	
	/*
	int finalMethodExam(int i, int j) { // 부모 클래스에서 final로 선언된 메소드로 재정의 불가능
		return i * j;
		
	}
	*/
	
}

class Sample02 /* extends FinalClassExam */ {} // FinalClassExam이 final 클래스로 상속 불가
 
 abstract class Sample03 extends AbstractClassExam { // abstract 메소드를 하나라도 갖고 있으면 abstract 클래스여야 한다.
	 String abstractMethodExam(int i, String s) {
		 return s + i;
		
	 }
	 
	 abstract String abstractMethodExam(int i); // 위의 메소드(오버라이딩)과 중복되므로 오버로딩으로 인수 변
	 
	 void sampleMethod03() {
		 System.out.println("void sampleMethod03() 호출 됨");
		
	}
	
}

class AbstractFinalClassTest {
	public static void main(String args[]){
		AbstractClassExam ace /* = new AbstractClassExam() */; // abstract클래스는 생성 불가
		FinalClassExam fce = new FinalClassExam();
		
		// fce.i=100000; // final 필드는 값을 변경할 수 없다.
		
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		
		aceS01.abstractMethodExam(700,"_999");
		
	}
	
}
