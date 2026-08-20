package ex0807.overriding.goods;

/**
 * 각 요청에 대한 로직(기능)을 담당할 클래스
 * (등록, 전체검색, 부분검색, 수정, 삭제 등등.....)
 * */
public class GoodsService{

	//상품을 관리할 배열 선언
	private Goods[] goodsArr = new Goods[10];
	public static int count; // 0 배열방에 저장 객체의 개수 
	
	
	/**
	 * 초기치 데이터를 세팅하는 메소드
	 * */
	public GoodsService(String[][] data){
		for(int i = 0; i < data.length; i++) {
			goodsArr[count++] = create(data[i]);
		}
		
		/*
		 * 	for(Goods g : goodsArr) {
		 * 		System.out.println(g);
		 * 	}
		 */
		
	} // 메소드 끝
	
	
	/**
	 * Goods를 생성해서 값을 설정하고 생성된 Goods를 리턴하는 메소드
	 * */
	private Goods create(String[] row) { // { "A01" , "새우깡" , "2500" , "짜고 맛나다." } 
		Goods goods = new Goods(row[0], row[1], Integer.parseInt(row[2]), row[3]);
		
		return goods;
	}
	
	
	/**
	 * 등록 (등록실패 - 중복인경우, 배열의 길이 벗어난경우)
	 * @return : 
	 * INSERT_DUPLICATE 상품코드 중복 ,
	 * INSERT_SUCCESS 등록 성공, 
	 * INSERT_OUTINDEX 배열의 길이 벗어남
	 * */
	public InsertResult insert(Goods goods){
		// 배열의 길이 체크
		if(count == goodsArr.length) return InsertResult.INSERT_OUTINDEX;
		
		//중복체크
		Goods g = selectByCode(goods.getCode());
		
		if(g != null) return InsertResult.INSERT_DUPLICATE;
		
		goodsArr[count++] = goods;
		return InsertResult.INSERT_SUCCESS;
		
	}
	
	public InsertResult2 insert2(Goods goods){
		// 배열의 길이 체크
		if(count == goodsArr.length) return InsertResult2.INSERT_OUTINDEX;
		
		//중복체크
		Goods g = selectByCode(goods.getCode());
		
		if(g != null) return InsertResult2.INSERT_DUPLICATE;
		
		goodsArr[count++] = goods;
		return InsertResult2.INSERT_SUCCESS;
		
	}
	
	/**
	 * 전체검색
	 * */
	public Goods[] selectAll() {
		
		return goodsArr; // 주소값
	}
	
	
	/**
	 * 상품코드에 해당하는 상품 검색
	 * @return : 만약 code에 해당하는 값이 있으면 Goods를 리턴하고
	 * 없으면 null 리턴
	 * */
	public Goods selectByCode(String code){
		for(int i = 0; i < count; i++) {
			String s = goodsArr[i].getCode();
			String converUpper = s.toUpperCase();
			
			if(converUpper.equals(code.toUpperCase())) {
				
				return goodsArr[i];
				
			}
			
		}
		
		return null;
		
	}
	
	
	/**
	 * 상품코드에 해당하는 가격, 설명 수정하기 
	 * @return : true이면 수정 완료, false이면 수정 실패
	 * */
	public boolean update(Goods goods) { //수정하려는 코드, 변경값 - 가격, 설명
		Goods g = this.selectByCode(goods.getName());
		
		if(g == null) return false;
		
		g.setPrice(goods.getPrice());
		g.setExplain(goods.getExplain());
		
		return true;
		
	}
	
}

