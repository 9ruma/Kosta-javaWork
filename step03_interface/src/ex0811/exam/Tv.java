package ex0811.exam;

public class Tv extends Elec implements ElecFunction {
	StringBuilder sb = new StringBuilder();
	
	private int chnnel;
	
	Tv() {}
	
	Tv(int chnnel) {
		this.chnnel = chnnel;
	}
	
	Tv(String code, int cost, int chnnel) {
		super(code, cost);
		this.chnnel = chnnel;
	}
	
	@Override
	public void start() {
		sb.append(super.toString());
		sb.append(" 제품 ");
		sb.append(getClass().getSimpleName());
		sb.append("를 ");
		sb.append(this.chnnel);
		sb.append("로 본다.");
		
		System.out.println(sb.toString());
		
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		sb.append(super.toString());
		sb.append(" 제품 ");
		sb.append(getClass().getSimpleName());
		sb.append("를 ");
		sb.append(this.chnnel);
		sb.append("로 본다.");
		
		return sb.toString();
	}
	
}
