package ex0820;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Profile {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		File file;
		String path;
		
		String name;
		int weight;
		String password;
		
		while (true) {
			System.out.println("1. 프로필 저장  2. 프로필 불러오기  3. 종료");
			System.out.print("메뉴 > ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1 : 
				System.out.print("이름 > ");
				name = sc.nextLine();
				
				path = "src/ex0820/";
				file = new File(path + name + ".txt");
				
				if(file.exists()) {
					System.out.println("이미 존재하므로 다시 입력하세요.");
					
				} else {
					
					System.out.print("몸무게 > ");
					weight = Integer.parseInt(sc.nextLine());

					System.out.print("비밀번호 > ");
					password = sc.nextLine();
					
					FileOutputStream fos = null;
					
					try {
						file.createNewFile();
						
						fos = new FileOutputStream(file);
						
						String str = weight + " : " + password;
						byte[] bytes = str.getBytes();
						
						fos.write(bytes);
						System.out.println("프로필 저장완료");
						
					} catch (Exception e) {
						e.printStackTrace();
						
					} finally {
						try {
							if(fos != null) fos.close();
							
						} catch(Exception e) {
							e.printStackTrace();
							
						}
						
					}
					
				}
				
				break;
		            
			case 2 :
				System.out.print("이름> ");
				name = sc.nextLine();
				
				path = "src/ex0820/";
				file = new File(path + name + ".txt");
				
				if (!file.exists()) {
					System.out.println(name + "에 해당하는 정보가 없습니다.");
					
				} else {
					FileInputStream fis = null;
					
					try {
						fis = new FileInputStream(file);
						String str = "";
						
						while(true) {
							int i = fis.read();
							if(i == -1) break;
							
							str = str + (char)i;
							
						}
						
						String[] info = str.split(" : ");
						
						weight = Integer.parseInt(info[0]);
						password = info[1];
						
						System.out.println(name + "님 몸무게는 " + weight + "kg 이고 비번은 " + password + " 입니다.");
						
					} catch (Exception e) {
						e.printStackTrace();
						
					} finally {
						try {
							if(fis != null) fis.close();
							
						} catch(Exception e) {
							e.printStackTrace();
							
						}
						
					}
					
				}
				
				break;
				
		    case 3:
		        System.out.println("프로그램을 종료합니다.");
		        System.exit(0);

		    default: System.out.println("잘못 입력했습니다.");
		        
		    }
			
		}
	    
	}
		
}
