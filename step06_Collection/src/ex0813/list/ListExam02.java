package ex0813.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExam02 {
	
	List<Integer> list = new ArrayList<Integer>(5);

	public ListExam02() {
		
		// 데이터 추가
		list.add(5);
		list.add(10);
		list.add(20);
		list.add(52);
		list.add(25);
		list.add(45);
		list.add(79);
		list.add(63);
		list.add(85);
		
		// 몇 개 저장됐는지 확인
		System.out.println("저장된 객체의 개수 = " + list.size());
		
		// 요소 꺼내기
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
		// 개선된 for
		System.out.println("-- 개선된 for --");
		for(Integer i : list) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("list = " + list);
		
		// 제거
		list.remove(1);
		System.out.println("제거 후 list = " + list);
		
		// 정렬			
		Collections.sort(list); // 올림차순
		System.out.println("올림차순 정렬 후 list = " + list);
		
		Collections.sort(list, Collections.reverseOrder()); // 내림차순
		System.out.println("내림차순 정렬 후 list = " + list);
		
	}
	
	public static void main(String[] args) {
		new ListExam02();

	}

}
