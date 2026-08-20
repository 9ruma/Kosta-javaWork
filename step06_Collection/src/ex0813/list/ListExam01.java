package ex0813.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExam01 extends ArrayList<Integer> {

	public ListExam01() {
		super(5);
		
		// 데이터 추가
		super.add(5);
		this.add(10);
		add(20);
		add(52);
		add(25);
		add(45);
		add(79);
		add(63);
		add(85);
		
		// 몇 개 저장됐는지 확인
		System.out.println("저장된 객체의 개수 = " + super.size());
		
		// 요소 꺼내기
		for(int i = 0; i < super.size(); i++) {
			System.out.print(super.get(i) + " ");
		}
		
		System.out.println();
		
		// 개선된 for
		System.out.println("-- 개선된 for --");
		for(Integer i : this) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("this = " + this);
		
		// 제거
		super.remove(1);
		System.out.println("제거 후 this = " + this);
		
		// 정렬			
		Collections.sort(this); // 올림차순
		System.out.println("올림차순 정렬 후 this = " + this);
		
		Collections.sort(this, Collections.reverseOrder()); // 내림차순
		System.out.println("내림차순 정렬 후 this = " + this);
		
	}
	
	public static void main(String[] args) {
		new ListExam01();

	}

}
