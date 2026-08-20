package ex0804.array.student;

public class StudentTest {
	public static void main(String[] args) {
		
		String[][] data = {
				{ "준혁", "20", "오리" },
				{ "지우", "24", "서울" },
				{ "나영", "22", "제주도" }
		
		}; 
		
		System.out.println("*** 학생 관리 프로그램 시작합니다. ***");
		StudentService service = new StudentService(); // StudentService의 전역변수들이 초기화
		service.init(data); // 초기 데이터 세팅
		
		// 전체 학생정보 출력
		Student[] stArr = service.selectAll();
		StudentEndView.printSelectAll(stArr);
		
		
		// 등록하기
		System.out.println("--- 1. 등록하기 ---");
		Student student = new Student();
		student.setName("미미");
		student.setAge(25);
		student.setAddr("오리역");
		
		int re = service.insert(student);
		
		if(re == -1) StudentEndView.printMessage("더이상 등록할 수 없어요.");
		else if (re == 0) StudentEndView.printMessage("이름이 중복입니다.");
		else StudentEndView.printMessage("등록되었습니다");
		
		System.out.println("--- 2. 전체검색 ---");
		StudentEndView.printSelectAll(service.selectAll());
		
		// 이름으로 검색하기
		System.out.println("--- 3. 이름으로 검색 ---");
		Student st = service.selectByName("준혁");
		if (st != null) StudentEndView.printSelectByName(st);
		else StudentEndView.printMessage("이름에 해당하는 정보가 없습니다.");
		
		
		System.out.println("--이름이 없는경우----");
		st = service.selectByName("삼순이");
		if (st != null) StudentEndView.printSelectByName(st);
		else StudentEndView.printMessage("이름에 해당하는 정보가 없습니다.");
		
		// 수정하기 
		System.out.println("--4. 수정하기 -----");
		Student st2 = new Student();
		
		st2.setName("나영"); //조건
		st2.setAge(23);
		st2.setAddr("대전");
		
		if(service.update(st2)) StudentEndView.printMessage("수정되었습니다.");
		else StudentEndView.printMessage("수정되지 않았습니다.");
		
		System.out.println("---변경후 ---");
		service.selectAll();
		StudentEndView.printSelectAll(stArr);
		
	}
	
}


