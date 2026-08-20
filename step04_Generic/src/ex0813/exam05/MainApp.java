package ex0813.exam05;

public class MainApp {

	public static void main(String[] args) {
		Course course = new Course();
		
		System.out.println("-- 1. <?> 모든 타입 허용 ----");
		/*
		Application<Person> app = new Application<Person>();
		app.setKind(new Person());
		*/
		course.register01(new Application<Person>(new Person()));
		course.register01(new Application<Worker>(new Worker()));
		course.register01(new Application<Student>(new Student()));
		course.register01(new Application<HighStudent>(new HighStudent()));
		course.register01(new Application<MiddleStudent>(new MiddleStudent()));
		
		System.out.println("-- 2. <? super Worker> Worker 이상 허용 ----");
		course.register02(new Application<Person>(new Person()));
		course.register02(new Application<Worker>(new Worker()));
		// course.register02(new Application<Student>(new Student()));
		// course.register02(new Application<HighStudent>(new HighStudent()));
		// course.register02(new Application<MiddleStudent>(new MiddleStudent()));
		
		System.out.println("-- 3.<? extends Student> Student 이하 허용 ----");
		// course.register03(new Application<Person>(new Person()));
		// course.register03(new Application<Worker>(new Worker()));
		course.register03(new Application<Student>(new Student()));
		course.register03(new Application<HighStudent>(new HighStudent()));
		course.register03(new Application<MiddleStudent>(new MiddleStudent()));
		
	}

}
