package ex0811.exam;

public class Audio extends Elec implements ElecFunction {
	StringBuilder sb = new StringBuilder();
	
	private int volumn;
	
	public Audio() {}
	
	public Audio(int volumn) {
		this.volumn = volumn;
	}
	
	public Audio(String code, int cost, int volumn) {
		super(code, cost);
		this.volumn = volumn;
	}
	
	@Override
	public void start() {
		sb.append(super.toString());
		sb.append("의 ");
		sb.append(getClass().getSimpleName());
		sb.append("를 ");
		sb.append(this.volumn);
		sb.append("으로 듣는다.");
		
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
		sb.append("의 ");
		sb.append(getClass().getSimpleName());
		sb.append("를 ");
		sb.append(this.volumn);
		sb.append("으로 듣는다.");
		
		return sb.toString();
	}
	
}
