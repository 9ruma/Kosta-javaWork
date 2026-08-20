package ex0803;

public class LottoNumSort {

	//숫자 6개를 배열방에 저장하는 메소드
	public int[] randomSelect(int[] arr) {
		int arrLength = arr.length;
		
		int[] randomSelectArray = new int[6];
		
		System.out.println("6개 랜덤 숫자");
		
		for(int i = 0; i < 6; i++) {
			randomSelectArray[i] = arr[(int)(Math.random() * arrLength)];
			System.out.print(randomSelectArray[i] + " ");
			
		}
		
		return randomSelectArray;
		
	}
	
	//중복 체크 메소드
	private boolean checkDuplicate(int[] arr) {
		
		int arrLength = arr.length;
		
		//중복 검사
		for(int i = 0; i < arrLength - 1; i++) {
			for(int j = i + 1; j < arrLength; j++) {
				//중복 시 새로운 값 넣기
				if(arr[i] == arr[j]) {
					arr[j] = (int)(Math.random() * arrLength + 1);
					return true;
				}
			}
		}
		
		return false;
		
	}
	
	//내림차순 정렬 메소드 - 선택 정렬
    public int[] descendingSort(int[] arr) {
    	
    	int arrLength = arr.length;
    	
        for (int i = 0; i < arrLength - 1; i++) {

            int max = i;

            for (int j = i + 1; j < arr.length; j++) if (arr[j] > arr[max]) max = j;

            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            
        }
        
        return arr;
        
    }
    
    public void printResult(int[] arr) {
    	
    	int arrLength = arr.length;
    	
    	System.out.println("내림차순 정렬");
    	
    	for(int i = 0; i < arrLength; i++) System.out.print(arr[i] + " ");
    	
    }
	
	public static void main(String[] args) {
		LottoNumSort lo = new LottoNumSort();
		
		int[] num = new int[45];
		int arrLength = num.length;
		
		for(int i = 0; i < arrLength; i++) num[i] = i+1;
		
		//랜덤 6개수 메소드 호출
        int[] lotto = lo.randomSelect(num);

        System.out.println();

        //중복 없어질 때까지 중복체크 메소드 호출
        while(lo.checkDuplicate(lotto));
        
        //내림차순 정렬 메소드 호출
        int[] lottoDescendingSort = lo.descendingSort(lotto);

        System.out.println();
        
        //결과 출력 메소드 호출
        lo.printResult(lottoDescendingSort);
		
	}

}
