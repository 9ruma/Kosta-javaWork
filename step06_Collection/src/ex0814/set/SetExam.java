package ex0814.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
	//Set<String> set = new HashSet<String>();
	Set<String> set = new TreeSet<String>(Collections.reverseOrder());
	
	public SetExam(String[] data) {
		for(String s : data) {
			//데이터 추가
			boolean re = set.add(s);
			System.out.println(s + " add 후 결과 = " + re);
		}
		
		System.out.println("최종 결과 = " + set);
		System.out.println("저장된 개수 = " + set.size());
		
		//요소 하나씩 꺼내기
		System.out.println("--- 요소를 하나씩 꺼내보자 ---");
		
		//Iterator는 자료구조안에 있는 데이터를 꺼낼 수 있는 메소드 제공
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		
		}
		
		System.out.println("--- 개선된 for 변경 ---");
		for(String s : set) { //while(it.hasNext()) 역할을 해줌
			System.out.println(s);
		}
		
		System.out.println("--- 요소 제거하기 ---");
		boolean re = set.remove("미미");
		
		System.out.println("re = " + re);
		System.out.println("제거 후 = " + set);
		
		re = set.contains("희정");
		
		System.out.println("re = " + re);
		
	}
	
	public static void main(String[] args) {
		new SetExam(args);
		
	}

}
