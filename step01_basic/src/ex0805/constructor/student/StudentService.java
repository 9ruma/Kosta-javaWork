package ex0805.constructor.student;

// 학생의 정보를 관리 하는 서비스(등록, 수정, 검색,....)
public class StudentService {
	private Student[] stArr = new Student[5];
	
	// 배열방에서 저장된 객체의 개수를 저장하는 변수
	public static int count; //0
	
	// 초기 데이터 3명 정도 세팅하기 (생성자)
	public StudentService(String[][] data) {
		for(int i = 0; i < data.length; i++) {
			stArr[count++] = createObject(data[i]);
			
		}
		
	}
			
	
	// Student 객체를 생성해서 리턴해주는 메소드 작성
	private Student createObject(String[] row) {
		Student st = new Student(row[0], Integer.parseInt(row[1]), row[2]);
		 
		/*
		st.setName(row[0]);
		st.setAge(Integer.parseInt(row[1]));
		st.setAddr(row[2]);
		*/
		
		return st;
		 
	}
	
	/**
	 * 학생의 정보 등록하기 
	 * 학생의 이름이 중복이면 등록할 수 없다.
	 * 배열의 범위를 벗어나면 더이상 추가할 수 없다.
	 * 이외는 추가를 한다.
	 * 
	 * @return : int (0이면 중복, -1이면 등록 불가, 1이면 성공)
	 */
	
	/**
	 * 
	 * @param st
	 * @return
	 */
	public int insert(Student st) {
		
		//배열 범위 벗어나면 추가할 수 없다.
		if(count == stArr.length) return -1;
		
		//학생의 이름이 중복이면 등록할 수 없다.
		Student searchedStudent = this.selectByName(st.getName());
		
		if(searchedStudent != null) return 0;
		
		stArr[count++] = st;
		
		return 1;
		
	}
	 
	
	// 전체 학생의 정보 조회하기
	public Student[] selectAll() {
		
		return stArr;
		
	}
	 
	
	// 이름에 해당하는 학생의 정보 검색하기
	// 이름에 해당하는 학생이 있으면 학생의 이름, 나이, 주소를 리턴하고
	// 없으면 null 리턴
	public Student selectByName(String name) {
		
		// 이름에 해당하는 학생의 정보 검색하기
		for(int i = 0; i < count; i++) {
			if(stArr[i].getName().equals(name)) {
				return stArr[i];
			}
				
		}
		
		// null 리턴
		return null;
		
	}
	
	
	/**
	 * 이름에 해당하는 학생의 주소 변경하기 
	 *  : 이름에 해당하는 학생이 있는지 찾아서 없으면 false
	 *   있으면  setAge() , setAddr() 이용해서 전달된 인수의 값으로 변경하고
	 *   true 출력
	 *   @param : Student
	 *   @return : boolea 형 - true면 수정 성공, false면 수정 실패
	 * */
	public boolean update(Student student) {
		
		Student searchSt = this.selectByName(student.getName());
		
		if(searchSt == null) return false;
		
		searchSt.setAddr(student.getAddr());
		
		return true;
		
	}

}

