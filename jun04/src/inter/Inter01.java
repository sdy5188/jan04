package inter;
//인터페이스(p334)
/* 
 * 인터페이스 : 다른 언어에서 찾아보기 힘든 고급 기능
 * 왜? 어떻게 쓰지?
 * 
 * 인터페이스란?
 * 추상 클래스 입니다. = 추상화
 * 추상 클래스는 추상 메소드를 가지고 있습니다.
 * 				 일반 메소드를 가지고 있습니다.
 * 인터페이스는 오직 추상 메소드만 가지고 있습니다.
 * 
 * 인터페이스 내에 존재하는 메소드는 무조건 추상 메소드
 * 인터페이스 내에 존재하는 변수는 무조건 상수
 * 
 * 인터페이스 속 메소드는 public abstract 메소드명으로 선언
 * 				 변수는 static final로 선언
 * 
 * 인터페이스 다중상속이 가능합니다.
 * 
 * interface AAA{ 클래스 자리에 선언
 * 		static final int NUMBER = 100;
 * 		public abstract void print();
 * }
 * 					인터페이스
 * class Cat implements AAA{
 * 		//AAA에 미구현된 내용을 구현합니다.
 * 		@override
 * 		public void print(){
 * 		//구현해줍니다.
 * 		}
 * }
 * 
 * 특징 : 인터페이스는 객체로 만들 수 있나요?
 * 기능전달이 목적이라 new로 객체생성이 안됨
 * 주의할점
 * 		클래스에 인터페이스 상속시 인터페이스 내
 * 		모든 추상 메소드를 구현해야 합니다.
 * 
 * 그럼, 상속하고 인터페이스하고 차이점은?
 * 
 * 		상속  : class A extends B{} 
 * 				B라는 클래스를 상속받아 A에 더한다.
 * 				순수 상속 : 부모로부터 모든 권한/능력을 가져오기
 * 
 * 
 * 인터페이스 : class A implements B{}
 * 				B라는 인터페이스의 기능을 A에 구현한다.
 * 				권한 상속 : 인터페이스만 가져오기
 * 							비어있는 것을 가져와서 그 속을 만들기
 * 
 */

interface SayHi{
//	추상 메소드, 인터페이스는 이미 추상이라 abstract추가안해도됨
//	public abstract void sayHi();
	public void sayHi();
	public void sayBye();
}

//		extends Object생략가능
class Start implements SayHi{//이제 인터페이스와 연결합니다.

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Inter01 {

}
