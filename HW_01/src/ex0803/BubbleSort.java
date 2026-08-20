package ex0803;

public class BubbleSort {
	
	public void bubbleSort(int[] arr) {
		int temp = 0;
		int arrLength = arr.length;
		
		for (int i = 0; i < arrLength; i++) {
			for(int j = 1; j < arrLength; j++) {
				if(arr[j] < arr[j-1]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		
		int[] arr = { 5, 7, 1, 2, 4, 3, 8, 9, 6, 10 };
		
		bs.bubbleSort(arr);
		
		int arrLength = arr.length;
		
		for(int i = 0; i < arrLength; i++) System.out.print(arr[i] + " ");

	}

}
