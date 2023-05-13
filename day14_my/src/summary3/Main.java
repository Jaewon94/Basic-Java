package summary3;

public class Main {
	// 다음 메인함수의 내용이 잘 작동하도록 클래스를 구성하세요
	// give메서드에서 Animal타입의 객체를 전달받았을때
	// 만약 그 객체가 Cat의 인스턴스라면 츄르를 주게하고,
	// 만약 그 객체가 Dog 인스턴스라면 육포를 준다.
	// (instanceof)
	public static void main(String[] args) {
		
		Human man = new Human("원빈");
		Cat cat = new Cat("야옹이");
		Dog dog = new Dog("멍멍이");
		
		man.give(cat);	// 원빈이 야옹이에게 츄르를 준다.
		man.give(dog);	// 원빈이 멍멍이에게 육포를 준다.
	}
}
