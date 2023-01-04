package animal;
//추상 클래스(p329)
public abstract class Animal {
	protected int age;
	protected String name;
//	추상메소드로 변신
	public abstract void sound();//바디{}가 없어요
	public abstract void add();//강제
	
	public void eat() {
		System.out.println("먹이를 먹습니다.");
	}
}
