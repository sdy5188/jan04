package what;
//혹시 이거 될까요?
//인스턴스를 하나만 만들기 가능?
//ctrl + shift + L : 이클립스 전체 단축키
public class What {
	public static void main(String[] args) {
//		static 안 붙은 메소드는 객체 생성 후에 실행해야 합니다.
//		static 붙은 메소드는 객체 없이 클래스명.메소드명으로  실행
		Human h1 = Human.getInsetance();
		Human h2 = Human.getInsetance();
		System.out.println(h1 == h2);
	}
}
//데이터 베이스 연결(p243)
class Human {
	private static Human human = new Human();//변수
	
	private Human() {}//생성자
	
	public static Human getInsetance() {//함수
		return human;
	}
}