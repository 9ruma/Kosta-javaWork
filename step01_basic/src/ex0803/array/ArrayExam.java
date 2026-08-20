package ex0803.array;

class ArrayExam{
	
	//각 int, double, char, boolean, String type 별 총 5개씩 저장하는 배열 생성
	int[] arrInt = new int[5]; //0
	double[] arrDouble = new double[5]; //0.0
	char[] arrChar = new char[5]; //\u0000 -> 공백
	boolean[] arrBoolean = new boolean[5]; //false
	String[] arrString = new String[5]; //null

	//메소드 : printArrayValue01	
	//위의 배열들에 자동으로 초기화 된 값 출력
	public void printArrayValue01() {
		
		//배열 길이 변수 선언
		int lengArrInt = arrInt.length;
		int lengArrDouble = arrDouble.length;
		int lengArrChar = arrChar.length;
		int lengArrBoolean = arrBoolean.length;
		int lengArrString = arrString.length;
		
		System.out.println("배열들에 자동으로 초기화 된 값 출력");
		System.out.println();
		
		//int 타입 배열 내 데이터 출력
		for(int i = 0; i < lengArrInt; i++) {
			System.out.printf("Int 배열 [%d] => %d %n", i+1, arrInt[i]);
			
		}
		
		System.out.println();
		
		//double 타입 배열 내 데이터 출력
		for(int i = 0; i < lengArrDouble; i++) {
			System.out.printf("Double 배열 [%d] => %.2f %n", i+1, arrDouble[i]);
			
		}
		
		System.out.println();
		
		//char 타입 배열 내 데이터 출력
		for(int i = 0; i < lengArrChar; i++) {
			System.out.printf("Char 배열 [%d] => %c %n", i+1, arrChar[i]);
			
		}
		
		System.out.println();
		
		//boolean 타입 배열 내 데이터 출력
		for(int i = 0; i < lengArrBoolean; i++) {
			System.out.printf("Boolean 배열 [%d] => %b %n", i+1, arrBoolean[i]);
			
		}
		
		System.out.println();
		
		//String 타입 배열 내 데이터 출력
		for(int i = 0; i < lengArrString; i++) {
			System.out.printf("String 배열 [%d] => %S %n", i+1, arrString[i]);
			
		}
		
	}

	//메소드 : printArrayValue02	
	//위의 5개의 배열에서 각각 적당한 값으로 data 할당
	public void printArrayValue02() {
		
		//배열 길이 변수 선언
		int lengArrInt = arrInt.length;
		int lengArrDouble = arrDouble.length;
		int lengArrChar = arrChar.length;
		int lengArrBoolean = arrBoolean.length;
		int lengArrString = arrString.length;
		
		//int 타입 배열에 랜덤한 값(1~100 사이 정수)으로 Data 할당
		for(int i = 0; i < lengArrInt; i++) arrInt[i] = (int)(Math.random() * 100 + 1);
		
		//double 타입 배열에 랜덤한 값(1~100 사이 실수)으로 Data 할당
		for(int i = 0; i < lengArrDouble; i++) arrDouble[i] = (double)(Math.random() * 100 + 1);
		
		//char 타입 배열에 랜덤한 값(a~z)으로 Data 할당
		for(int i = 0; i< lengArrChar; i++) arrChar[i] = (char)('a' + (int)(Math.random() * 26));
		
		//boolean 타입 배열에 랜덤한 값(true or false)으로 Data 할당
		for(int i = 0; i < lengArrBoolean; i++) {
			int a = (int)(Math.random() * 2 + 1);
			
			switch(a) {
				case 1 -> arrBoolean[i] = true;
				case 2 -> arrBoolean[i] = false;
			}
			
		}
		
		//String 타입 배열에 정의한 문자열 배열 데이터 중 랜덤한 값으로 Data 할당
		for(int i = 0; i < lengArrString; i++) {
			String[] arr = { "문자열 a","문자열 b", "문자열 c", "문자열 d", "문자열 e" };
			int a = (int)(Math.random() * 5);
			arrString[i] = arr[a];
			
		}
		
	}
	
	//메소드 : printArrayValue03	
	//새롭게 할당된 값 출력
	public void printArrayValue03() {
		int lengArrInt = arrInt.length;
		int lengArrDouble = arrDouble.length;
		int lengArrChar = arrChar.length;
		int lengArrBoolean = arrBoolean.length;
		int lengArrString = arrString.length;
		
		System.out.println("새롭게 할당된 값 출력");
		System.out.println();
		
		/*
		//int 타입 배열 내 데이터 출력
		for(int i = 0; i < lengArrInt; i++) {
			System.out.printf("Int 배열 [%d] => %d %n", i+1, arrInt[i]);
			
		}
		
		System.out.println();
		
		//double 타입 배열 내 데이터 출력
		for(int i = 0; i < lengArrDouble; i++) {
			System.out.printf("Double 배열 [%d] => %.2f %n", i+1, arrDouble[i]);
			
		}
		
		System.out.println();
		
		//char 타입 배열 내 데이터 출력
		for(int i = 0; i < lengArrChar; i++) {
			System.out.printf("Char 배열 [%d] => %c %n", i+1, arrChar[i]);
			
		}
		
		System.out.println();
		
		//boolean 타입 배열 내 데이터 출력
		for(int i = 0; i < lengArrBoolean; i++) {
			System.out.printf("Boolean 배열 [%d] => %b %n", i+1, arrBoolean[i]);
			
		}
		
		System.out.println();
		
		//String 타입 배열 내 데이터 출력
		for(int i = 0; i < lengArrString; i++) {
			System.out.printf("String 배열 [%d] => %S %n", i+1, arrString[i]);
			
		}
		*/
		printArrayValue01();
		
	}
	
	//메인메소드에서
	//ArrayExam의 메소드들을 순서대로 호출
	public static void main(String[] args) {
		ArrayExam ar = new ArrayExam();
		ar.printArrayValue01();
		System.out.println();
		System.out.println();
		ar.printArrayValue02();
		ar.printArrayValue03();
	}
	
}