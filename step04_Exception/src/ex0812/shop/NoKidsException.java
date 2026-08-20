package ex0812.shop;

public class NoKidsException extends Exception {
	
	private static int count = 0;
	
	public NoKidsException() {}
	
	public NoKidsException(String message) {
		super(message);
		count++;
	}

	public static int getCount() {
		return count;
	}
	
}
