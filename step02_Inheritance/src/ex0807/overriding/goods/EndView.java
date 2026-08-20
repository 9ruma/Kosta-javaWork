package ex0807.overriding.goods;

/**
 * 요청 결과를 출력할 view
 * */
public class EndView {
	
	/**
	 * 성공여부 메시지를 출력하는 메소드
	 * */
	public static void printMessage(String message) {
		System.out.println(message+"\n");
	}
	
	
	/**
	 * 전체검색 결과를 출력하는 메소드
	 * */
	public static void printSelectAll(Goods[] arr) {
		System.out.printf("******* List (%d)개 *******%n", GoodsService.count);
		
		// 정보 출력
		for(int i = 0; i < GoodsService.count; i++) {
			System.out.println(arr[i]);
		}
	}

   /**
     상품코드에 해당하는 상세정보 출력하는 메소드 
   */
   public static void printSelectByCode(Goods goods){
	   System.out.printf("****** %s의 상세보기 ******%n", goods.getCode());
	   System.out.println(goods); // goods.toString() 호출
   }


}