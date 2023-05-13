package summary5;

public class Main {
	// 다음 메인함수의 내용이 잘 작동하도록 클래스를 구성하세요
	// Human.give메서드를 하나로 통합합니다.
	// 서로 다른 클래스를 하나의 타입으로 처리하기 위해
	// 인터페이스 Companion을 만들어서 처리합니다. (Cat, Dog, Friend)

	
	public static void main(String[] args) {
		
		Human man = new Human("원빈");
		Cat cat = new Cat("야옹이");
		Dog dog = new Dog("멍멍이");
		Friend f = new Friend("이정재");
		
		man.give(cat);	// 원빈이 야옹이에게 츄르(던져) 준다.
		man.give(dog);	// 원빈이 멍멍이에게 육포(던져) 준다.
		man.give(f);	// 원빈이 이정재에게 치즈(건네) 준다.
	}
}
