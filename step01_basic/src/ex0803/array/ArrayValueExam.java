package ex0803.array;

class ArrayValue{
	//정수형 10개 저장하는 배열선언(선언과 동시에 임의값 지정)
	//int[] arr; // Null
	//int[] arr = new int[10]
	//int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } 
	int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	
	/*printArrayValue 메소드작성
      => 메소드 안에서 위에 선언된 배열방의 값을 출력한다.
	*/
	public void printArrayValue() {
		int leng = arr.length;
		
		for(int i = 0; i < leng; i++) {
			System.out.printf("배열 [%d] => %d %n", (i+1), arr[i]);
		}
	}
	
}

/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args []){
		// ArrayValue에 있는 printArrayvalue메소드 호출
		ArrayValue av = new ArrayValue();
		
		av.printArrayValue();

	}
}