package ex0821;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializableSaveExam {

	public SerializableSaveExam() {
		// 객체 저장
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/ex0821/save.txt"))) {
			Member mem1 = new Member("Cha", 28, "경기");
			Member mem2 = new Member("Kim", 27, "서울");
			Member mem3 = new Member("Lee", 23, "부산");
			
			List<Member> list = new ArrayList<Member>();
			list.add(mem1);
			list.add(mem2);
			list.add(mem3);
			
			/*
			oos.writeObject(mem1);
			oos.writeObject(mem2);
			oos.writeObject(mem3);
			*/
			
			oos.writeObject(list);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("*** 저장완료 ***");
		
	}
	
	
	public static void main(String[] args) {
		new SerializableSaveExam();

	}

}
