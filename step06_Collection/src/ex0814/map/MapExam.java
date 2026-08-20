package ex0814.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
	Map<String, Integer> map = new HashMap<String, Integer>();
	
	public MapExam() {
		// 추가
		map.put("준혁", 10);
		map.put("미미", 20);
		map.put("동혁", 10);
		map.put("가현", 30);
		map.put("미미", 40); // key가 중복되면 수정
		
		System.out.println("저장된 개수 = " + map.size());
		System.out.println("map = " + map);
		
		System.out.println("--- key와 value 분리 ---");
		// 먼저 key의 정보들을 추출
		Set<String> keys = map.keySet();
		/*
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			
			System.out.println(key + " = " + value);
			
		}
		*/
		System.out.println("--- 개선된 for ---");
		for(String key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println(key + " = " + value);
			
		}
		
		System.out.println("--- Entry 형태로 조회하기 ---");
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		
		for(Map.Entry<String, Integer> e : set) {
			String key = e.getKey();
			Integer i = e.getValue();
			System.out.println(key + " ==> " + i);
			
		}
		
		// 삭제
		Integer re = map.remove("준혁"); // 리턴한 값은 삭제된 객체를 리턴
		System.out.println("re = " + re);
		System.out.println("map = " + map);
		
	}
	
	
	public static void main(String[] args) {
		new MapExam();

	}

}
