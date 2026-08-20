package ex0812;

public class ExceptionReturnExam {
	
	public void aa(int i) {
		try {
			if(i == 0) {
				// return; // finally 실행
				System.exit(0); // 프로그램 강제 종료 -> finally 실행 안함
			}
			
			System.out.println(i + "입니다.");
			
		} finally {
			System.out.println("--- aa 끝 ---");
			
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("*** 메인 시작 ***");
		
		new ExceptionReturnExam().aa(0);
		
		System.out.println("*** 메인 끝 ***");

	}

}
