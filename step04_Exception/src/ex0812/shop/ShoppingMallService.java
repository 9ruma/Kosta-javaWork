package ex0812.shop;

public class ShoppingMallService {
	
	public void checkAge(int age) throws NoKidsException {
		if(age < 18) throw new NoKidsException("애들은 가라");
		else System.out.println("입장하신걸 환영합니다.");
		
	}
	
}
