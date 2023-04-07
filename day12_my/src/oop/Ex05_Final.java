package oop;

final class A{
	int n1 = 10;
	final int n2 = 20;
	static int n3 = 30;
	static final int N4 = 40;
	
	A(){
		n1 +=5;
//		n2 +=5;		// final 필드는 값을 변경할 수 없다.
		n3 +=5;
//		n4 +=5;		// static final 필드도 값을 변경할 수 없다.
	}
}

class B /*extends A*/ {	// The type B cannot subclass the final class A
						// final 클래스 A의 서브클래스가 될 수 없다.
						// final 클래스는 상속 받을 수 없다.
	void test1() {
		System.out.println("test1");
	}
	
	final void test2() {
		System.out.println("test2");
	}
}

class C extends B {
	@Override
	void test1() {
		System.out.println("test3");
	}
	
//	@Override		// Cannot override the final method from B
//	void test2() {
//		
//	}
}

public class Ex05_Final {
	public static void main(String[] args) {
		
		// final은 변경할 수 없다. 마지막 값 or 마지막 내용이다. 라는 뜻으로 사용한다
		
		// final 필드는 값을 변경할 수 없다(따라서, 초기값을 반드시 지정해야만 한다)
		// final 메서드는 오버라이딩 할 수 없다.(내용을 바꿀 수 없고, 정해진 대로만 사용해야 한다.)
		// final 클래스는 상속받을 수 없다(기존 만들어진 클래스를 그대로 활용해야 한다)
		
		int num1 = 10;
		final int num2 = 20;
		
		num1 += 1;
		
		// The final local variable num2 cannot be assigned. 
		// It must be blank and not using a compound assignment
//		num2 += 1;
		
//		final 지역변수 num2는 할당(대입)할 수 없다.
//      대입을 사용하지 않아야 한다.
		
		System.out.println(num2); 	// 값을 변경하지 않는다면 출력에는 전혀 문제 없음
		
		// static 은 기울임으로 표현되고
		// final 은 굵어짐으로 표현된다.
		
		
		
	}
}
