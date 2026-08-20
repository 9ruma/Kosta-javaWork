package sample02;

public class PartTime extends Employee {
	private int timePay;
	
	public PartTime() {}
	
	public PartTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int timePay) {
		super(empNo, eName, job, mgr, hiredate, deptName);
		this.timePay = timePay;
		
	}
	
	public int getTimePay() {
		return timePay;
	}

	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}

	public void message() {
		System.out.printf("%s 사원은 비정규직입니다.%n", geteName());
		
	}
	
	public String toString() {
		return getEmpNo() + " | " + geteName() +  " | " + getJob() + " | "  + getMgr() + " | " 
	+ getHiredate() + " | " + getDeptName() + " | " + timePay;
		
	}
	
}
