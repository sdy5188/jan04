package zoo;
//동물원의 동물
public class Animal {
	String name;
	public void setName(String name) {
		this.name = name;
	}
}
/* getter / setter
 * 
 * private로 잠겨잇는 변수를 외부에서 사용하기 위한 
 * 우회접속 메소드
 * set은 데이터 저장, get은 데이터 출력 용도입니다.
 */