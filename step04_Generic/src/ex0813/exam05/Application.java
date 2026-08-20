package ex0813.exam05;

/**
 * 신청 -> 누가 신청하는가?
 */
public class Application<T> {
	private T kind; // 사람, 직장인, 학생, 고등, 중등 ...
	
	public Application(T kind) {
		this.kind = kind;
	}

	public T getKind() {
		return kind;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}
	
}
