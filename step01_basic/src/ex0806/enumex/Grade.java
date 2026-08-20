package ex0806.enumex;

/*
 * enum은 열거형으로 안에 정의된 정보는 무조건 static final이다.
 */

/*
public enum Grade {
	BRONZE, SILVER, GOLD;
	
}
*/

public enum Grade {
	BRONZE("일반", 100, 5), 
	SILVER("우수", 200, 10), 
	GOLD("최우수", 300, 30);
	
	private final String grade;
	private final int point;
	private final int permission;
	
	// enum 타입 안에 있는 생성자는 무조건 private이다.
	Grade(String grade, int point, int permission) {
		this.grade = grade;
		this.point = point;
		this.permission = permission;
	}

	public String getGrade() {
		return grade;
	}

	public int getPoint() {
		return point;
	}

	public int getPermission() {
		return permission;
	}
	
}
