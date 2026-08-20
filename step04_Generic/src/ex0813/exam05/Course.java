package ex0813.exam05;

/**
 * 강좌를 등록하는 객체
 */
public class Course {
	
	/**
	 * 모든 사람을 허용(등록)
	 */
	public void register01(Application<?> app) {
		System.out.println(app.getKind().getClass().getSimpleName() + " 신청 완료 - register01");
	}
	
	/**
	 * 직장인만 허용(등록)
	 */
	public void register02(Application<? super Worker> app) {
		System.out.println(app.getKind().getClass().getSimpleName() + " 신청 완료 - register02");
	}
	
	/**
	 * 학생만 허용(등록)
	 */
	public void register03(Application<? extends Student> app) {
		System.out.println(app.getKind().getClass().getSimpleName() + " 신청 완료 - register03");
	}
	
}
