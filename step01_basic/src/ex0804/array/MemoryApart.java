package ex0804.array;

class MultiArray{
	
	//정수형 2차원 배열 8*9
	int[][] arr = new int[8][9];
	
	//메소드이름 :array99
	//for loop 를 사용하여 
	//배열에 곱한 (구구단)결과저장
	//배열에 결과를 꺼내출력
	public void array99() {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = (i + 2) * (j + 1);
				
				System.out.print(arr[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
			
	}
				
}

public class MemoryApart {
	public static void main(String[] args) {
		//main 메소드에서
		//MultiArray 객체의 array99 메소드 호출
		
		//new MultiArray().array99(); //호출 -> 일회성
		
		MultiArray ma = new MultiArray();
		ma.array99();
		
	}
	
}

