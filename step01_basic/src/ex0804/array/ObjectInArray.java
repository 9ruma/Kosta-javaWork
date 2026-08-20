package ex0804.array;

//ObjectInArray.java
class ObjectOne{
	public int a;
}

public class ObjectInArray{
	public static void main(String[] args) {
		//메인 메소드에서 ObjectOne 타입을 5개 까지 저장하는 배열 선언
		ObjectOne[] arr = new ObjectOne[5];
		
		//생성 전 배열 데이터 기본값 출력
		for(ObjectOne obj : arr) System.out.print(obj + " ");
		
		System.out.println();
		
		//5개의 ObjectOne객체를 생성하세요.
		for(int i = 0; i < arr.length; i++) arr[i] = new ObjectOne();
		
		//각 객체가 갖고있는 전역 변수 출력
		for(ObjectOne obj : arr) System.out.print(obj.a + " ");
		
		System.out.println();
		
		//각 객체의 주소값 출력
		for(ObjectOne obj : arr) System.out.print(obj + " ");
		
		//각각의 ObjectOne객체가 서로 다른 a의 값을 갖도록 a의 값을 변경하세요.
		for(ObjectOne obj : arr) obj.a = (int)(Math.random() * 10 + 1);
		
		System.out.println();
		
		//각 ObjectOne 객체의 a를 출력하세요
		for(ObjectOne obj : arr) System.out.print(obj.a + " ");
		
	}	
	
}
