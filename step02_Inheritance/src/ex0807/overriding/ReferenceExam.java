package ex0807.overriding;

class ObjectExam{
	
	String str;
	
	public ObjectExam() {}
	public ObjectExam(String str) {
		this.str = str;
	}

	public String toString() {
		return super.toString() + " = " + str;
	}
	
}

class ReferenceExam {
	
	public static void main(String[] args) {
		
		char c = 'a';
			
		String s01 = "차준혁"; 
		String s02 = "Java";
		String s03 = new String("월요일");
		
		ObjectExam oe1 = new ObjectExam("집에 가고 싶다");
		ObjectExam oe2 = new ObjectExam("안녕");
		
		System.out.println(c); // a
		
		System.out.println(s01); // 차준혁
		System.out.println(s02); // Java
		System.out.println(s03); // 월요일
		
		
		System.out.println(oe1.toString()); // 주소값
		System.out.println(oe2.toString()); // 주소값
			
	}
	
}
