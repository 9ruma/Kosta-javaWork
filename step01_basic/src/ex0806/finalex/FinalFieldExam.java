package ex0806.finalex;

/**
 * final 필드는 반드시 초기화 필수
 * -> 초기화를 하는 방법
 * 	1) 직접 명시적 초기화
 * 	2) 생성자 안에서 초기화
 * 
 * static final 필드는 상수이다.
 * 	1) 직접 명시적 초기화, 생성자 안에서 초기화 못함
 * 	2) static 블럭에서 초기화 가능
 */
public class FinalFieldExam {

	int i;
	final int j = 100; // 직접 명시적 초기화
	final int k;
	// static final int PRODUCT_PRICE = 300;
	static final int PRODUCT_PRICE;
	
	static {
		PRODUCT_PRICE = 200;
	}
	
	public FinalFieldExam() {
		this.k = 50; // 생성자 안에서 초기화 
	}

	public FinalFieldExam(int a) {
		this.k = a; // 생성자 안에서 초기화
	}
	
	public static void main(String[] args) {
		FinalFieldExam fe1 = new FinalFieldExam();
		FinalFieldExam fe2 = new FinalFieldExam(150);
		
		fe1.i = 5;
		// fe.j = 5; // final은 값 변경 불가인 고정값이 된다.
		
		System.out.println(fe1.k + " " + fe2.k);
		
	}

}
