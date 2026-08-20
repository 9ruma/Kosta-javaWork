package ex0803;

public class SelectionSort {
	
	public void selectionSort(int[] arr) {
		int arrLength = arr.length;
		
		for (int i = 0; i < arrLength; i++) {
			int min = i;
			
			for(int j = i+1; j < arrLength; j++) {
				if (arr[j] < arr[min]) min = j;
				
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
		}

	}

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		
		int[] arr = { 5, 7, 1, 2, 4, 3, 8, 9, 6, 10 };
		
		ss.selectionSort(arr);
		
		int arrLength = arr.length;
		
		for(int i = 0; i < arrLength; i++) System.out.print(arr[i] + " ");
		
	}

}
