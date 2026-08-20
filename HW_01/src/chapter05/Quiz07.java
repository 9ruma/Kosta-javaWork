package chapter05;

public class Quiz07 {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 8, 2 };
		int arrLength = arr.length;
		
		int max = arr[0];
		
		for(int i = 1; i < arrLength; i++) if (max < arr[i]) max = arr[i];

		System.out.println(max);
		
	}

}
