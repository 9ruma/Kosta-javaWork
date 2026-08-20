package ex0812.exam01;

public class MainApp {

	public static void main(String[] args) {
		/* 제너릭이 없는 경우
		Box box = new Box();
		box.setContent("상품 1"); // 저장
		
		if(box.getContent() instanceof String) {
			String content = (String)box.getContent();
			System.out.println(content);
			
		}
		
		box.setContent(new Board());
		
		if(box.getContent() instanceof Board) {
			Board content = (Board)box.getContent();
			System.out.println(content.getBno());
			
		} */
		
		Box<String> box = new Box<String>();
		
		box.setContent("상품 1");
		String content = box.getContent();
		
		System.out.println("content = " + content);
		
		Box<Board> box2 = new Box<Board>();
		
		box2.setContent(new Board());
		Board board = box2.getContent();
		
		System.out.println(board.getBno());

	}
		

}
