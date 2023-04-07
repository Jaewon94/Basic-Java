package summary1;

public class Main {
	// 다음 메인함수의 내용이 잘 작동하도록 클래스를 구성하세요
	// 상속을 사용하지 않고, 자바의 메서드 오버로딩(중복정의)을 활용하여 코드를 작성하세요
	public static void main(String[] args) {
		
		Human man = new Human("원빈");
		Cat cat = new Cat("야옹이");
		Dog dog = new Dog("멍멍이");
		
		man.give(cat);	// 원빈이 야옹이에게 먹이를 준다.
		man.give(dog);	// 원빈이 멍멍이에게 먹이를 준다.
	}
}
