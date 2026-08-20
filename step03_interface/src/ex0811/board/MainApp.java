package ex0811.board;

public class MainApp {
	// 필드를 이용한 다형성
	Board board;
	BoardService boardService;
	
	public MainApp() {
		board = new FreeBoard(1, "제목1", "작성자1", "내용 1");
		boardService = new FreeBoardServiceImpl();
		this.test(boardService, board);
		
		board = new QaBoard(2, "제목2", "작성자2", "내용 2", false);
		boardService = new QaBoardServiceImpl();
		this.test(boardService, board);
		
		board = new UploadBoard(3, "제목3", "작성자3", "내용 3", "text.txt");
		boardService = new UploadBoardServiceImpl();
		this.test(boardService, board);
		
	}
	
	// 매개변수를 이용한 다형성
	public void test(BoardService service, Board board) {
		service.insert(board);
		service.update(board);
		service.selectByNo(5);
		
		service.delete(100);
		BoardService.selectAll();
		
		System.out.println("-------------------------------------");
		
	}
	
	public static void main(String[] args) {
		new MainApp();
		
	}

}
