package dog;

import java.util.HashSet;
import java.util.Set;

import animal.Animal;
import animal.Human;

public class Dog extends Animal {
	
//	1~45숫자 6개를 뽑아주는 개
	public Set<Integer> lotto(){
		Set<Integer> lotto = new HashSet<Integer>();//중복제거
		while (lotto.size() < 6) {
			lotto.add((int)(Math.random() * 45) + 1);
			lotto.add((int)Math.random() * 45 + 1);
//			System.out.println(lotto.size());
		}
		return lotto;
	}
	
	@Override
	public void sound() {
//		super.sound();
		System.out.println("멍멍...");
	}
	
	public static void main(String[] args) {
		
//		Animal ani = new Animal();
//		ani.sound();
		
		Dog dog = new Dog();
		dog.age = 10;
		
		Human human = new Human();
		human.setSsn("950213-");//저장
		System.out.println(human.getSsn());//출력
		
		Set<Integer> lotto = dog.lotto();
		System.out.println(lotto);
//		System.out.println(dog.lotto());//출력문에 바로 출력
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	
}
