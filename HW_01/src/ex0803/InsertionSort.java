package ex0803;

public class InsertionSort {

	public void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			
			arr[j + 1] = key;
			
		}
		
	}
	
	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		
		int[] arr = { 5, 7, 1, 2, 4, 3, 8, 9, 6, 10 };
		
		is.insertionSort(arr);
		
		int arrLength = arr.length;
		
		for(int i = 0; i < arrLength; i++) System.out.print(arr[i] + " ");

	}

}
