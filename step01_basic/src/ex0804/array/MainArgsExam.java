package ex0804.array;

public class MainArgsExam {

	public static void main(String[] args) {
		System.out.println("args = " + args); //[Ljava.lang.String;@659e0bfd
		System.out.println("args.length = " + args.length);
		
		//args 배열방에 있는 값 모두 출력
		for(int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("--- 개선된 for 문 ---");
		for(String s : args) {
			System.out.print(s);
		}

	}

}