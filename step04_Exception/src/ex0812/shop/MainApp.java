package ex0812.shop;

public class MainApp {
	
	public static void main(String[] args) {
		ShoppingMallService s = new ShoppingMallService();
		
		for(int i = 0; i < 10; i++) {
			try {
				s.checkAge((int)(Math.random() * 55 +1));
				
			} catch(NoKidsException e) {
				System.out.println(e.getMessage());
				
			}
			
		}
		
		System.out.println();
		System.out.println("총 발생한 예외의 개수 = " + NoKidsException.getCount());
		
	}

}
