package chapter11;

// 다음 코드가 실행되었을 때 춫력 결과를 작성해 보세요.

/*
 * 출력 결과
 * 
 * 10
 * 숫자로 변환할 수 없음
 * 10
 * 인덱스를 초과했음
 * 10
 * 
 */

public class Quiz06 {
	
	public static void main(String[] args) {
		String[] strArray = { "10", "2a" };
		int value = 0;
		
		for(int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
				
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
				
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
				
			} finally {
				System.out.println(value);
				
			}
			
		}
		
	}

}
