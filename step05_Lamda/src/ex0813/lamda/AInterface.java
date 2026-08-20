package ex0813.lamda;

/**
 * @FunctionalInterface는
 * 메소드가 한개일 때 선언한다.
 * 단, 기능이 있는 default, static
 * 있는 경우에도 쓸 수 있다.
 * 
 */

@FunctionalInterface
public interface AInterface {
	void aa();
	default void ff() {
		
	}
}
