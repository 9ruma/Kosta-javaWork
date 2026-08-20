package ex0806.enumex;

public class EnumTest {

	public static void main(String[] args) {
		Grade grade = Grade.BRONZE;
		
		switch(grade) {
			case BRONZE : System.out.println("일반 고객"); break;
			case SILVER : System.out.println("우수 고객"); break;
			case GOLD : System.out.println("최우수 고객"); break;
		}
		
		System.out.println(grade.getGrade());
		System.out.println(grade.getPoint());
		System.out.println(grade.getPermission());

	}

}
