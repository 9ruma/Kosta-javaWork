package ex0813.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExam03 {
	
	List<Emp> list = new ArrayList<Emp>();
	
	public ListExam03() {
		list.add(new Emp(20, "준혁", 20, "서울"));
		list.add(new Emp(10, "지우", 25, "대구"));
		list.add(new Emp(30, "미미", 22, "대전"));
		list.add(new Emp(50, "삼순", 28, "서울"));
		list.add(new Emp(40, "순돌", 26, "부산"));
		
	}
	
	/**
	 * 저장된 모든 사원의 정보 검색
	 */
	public List<Emp> selectAll() {
		
		return list;
	}
	
	
	/**
	 * 사원의 사원번호에 해당하는 사원정보 검색
	 * @return : 있으면 Emp 객체, 없으면 null
	 */
	public Emp selectByEmpno(int empno) {
		
		for(Emp e : list) {
			if(empno == e.getEmpno()) return e;
		}
		
		return null;
	}
	
	/**
	 * 주소를 인수로 전달받아 동일한 주소에 해당하는 사원정보 검색
	 */
	public List<Emp> selectByAddr(String addr) {
		List<Emp> selectedList = new ArrayList<Emp>();
		
		for(Emp e : list) {
			if(e.getAddr().equals(addr)) selectedList.add(e);
		}
		
		return selectedList;
		
	}
	
	/**
	 * 사원번호를 기준으로 사원정보 정렬하기
	 */
	public List<Emp> sortByEmpno() {
		
		/*
		 * All elements in the list must implement the Comparable interface.
		 * 
		 * sort를 하기 위한 객체는 반드시 Comparable을 구현한 객체여야 한다.
		 * => Integer는 이미 Comparable을 구현한 객체이다.
		 * 
		 */
		// Collections.sort(list); // 원본이 정렬이 되어서 등록된 순서를 이후에 알 수 없다.
		
		// 정렬을 할 새로운 List를 만들고 그 List를 정렬해서 리턴한다.
		List<Emp> shallowCopy = new ArrayList<Emp>(list);
		
		Collections.sort(shallowCopy);
		
		return shallowCopy;
	}
	
	/**
	 * 나이를 기준으로 사원정보 정렬하기
	 */
	public List<Emp> sortByAge() {
		List<Emp> shallowCopy = new ArrayList<Emp>(list);
		
		// Collections.sort(shallowCopy, new Test());
		
		/* 익명 이너클래스 타입으로 선언하기
		Collections.sort(shallowCopy, new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				return o2.getAge() - o1.getAge(); // 내림차순
			}
			
		});
		*/
		
		Collections.sort(shallowCopy, (o1, o2) -> o2.getAge() - o1.getAge());
		
		return shallowCopy;
	}
	
	public static void main(String[] args) {
		ListExam03 ex = new ListExam03();
		
		for(Emp e : ex.selectAll()) {
			System.out.println(e);
		}
		
		System.out.println(ex.selectAll());
		
		System.out.println("\n2. 사원번호에 해당하는 사원정보 검색 --");
		System.out.println(ex.selectByEmpno(10));
		System.out.println(ex.selectByEmpno(140));
		
		System.out.println("\n3. 주소를 인수로 전달받아 동일한 주소에 해당하는 사원정보 검색 --");
		System.out.println(ex.selectByAddr("서울"));
		System.out.println(ex.selectByAddr("미국"));
		
		System.out.println("\n4. 사원번호를 기준으로 사원정보 정렬하기 --");
		for(Emp e : ex.sortByEmpno()) {
			System.out.println(e);
		}
		
		System.out.println("\n5. 정렬 후 전체 검색 --");
		System.out.println(ex.selectAll());
		
		System.out.println("\n6. 나이를 기준으로 사원정보 정렬하기 --");
		for(Emp e : ex.sortByAge()) {
			System.out.println(e);
		}
		
		System.out.println("\n7. 정렬 후 전체 검색 --");
		System.out.println(ex.selectAll());

	}

}

/*
class Test implements Comparator<Emp> {
	
	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getAge() - o2.getAge();
	}
	
}
*/