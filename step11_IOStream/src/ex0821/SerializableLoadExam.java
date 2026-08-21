package ex0821;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class SerializableLoadExam {
	
	public SerializableLoadExam() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/ex0821/save.txt"))) {
			/*
			Member mem1 = (Member)ois.readObject();
			Member mem2 = (Member)ois.readObject();
			Member mem3 = (Member)ois.readObject();
			
			System.out.println("mem 1 = " + mem1);
			System.out.println("mem 2 = " + mem2);
			System.out.println("mem 3 = " + mem3);
			*/
			List<Member> list = (List<Member>)ois.readObject();
			
			Member mem1 = list.get(0);
			Member mem2 = list.get(1);
			Member mem3 = list.get(2);

			System.out.println("mem 1 = " + mem1);
			System.out.println("mem 2 = " + mem2);
			System.out.println("mem 3 = " + mem3);
			
			System.out.println("list.size() = " + list.size());
			System.out.println("list = " + list);
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new SerializableLoadExam();

	}

}
