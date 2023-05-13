package abstractClass;

abstract class Test1{
	
	int num1 = 10;
	int num2 = 20;
	
	// 이 메서드는 오버라이딩을 할지 말지에 대한 자유가 있다.
	public void method1() {
		System.out.println("method1");
	}
	
	// 추상 메서드는 오버라이딩을 무조건 해야 한다.
	public abstract void method2();	// { } 추상 메서드는 함수 내용을 가질 수 없다. 물려주는 용도
	
}

class Test2 extends Test1 {

	@Override
	public void method2() {
		System.out.println("Test2의 method2");
	}


	// The type Test2 must implement the inherited abstract method Test1.method2()
	
	
	// 추상클래스를 상속받는 서브클래스의 입장에서는 
	// 메서드를 상속받았으나, 내용이 정의 되지 않은 함수라서 객체화 할 수 없다.
	// 1) 추상메서드를 포함하기 위해서 스스로 추상클래스가 되는 방법
	// 2) 추상메서드를 상속받았으나, 오버라이딩하여 내용을 구체적으로 작성하는 방법
	// 두가지 중에 하나를 선택해야 한다.
	
	// 추상클래스는 스스로는 객체를 생성할 수 없다.
	// 이유는, 내부의 추상화 된 메서드는 완전한 설계도가 아니기 때문에 객체 생성 불가
	
	// 추상화된 메서드는 상속 받은 클래스에서 오버라이딩해서 쓴다.
	// 추상적인 메서드를 구체적인 메서드로 만들어 주는 것
}

public class Ex01 {
	public static void main(String[] args) {
		// Cannot instantiate the type Test1
		// 추상클래스는 생성자를 통하여 객체를 생성할 수 없다.
		// Test1 ob1 = new Test1();
		
		// 추상클래스를 상속 받았으나, 오버라이딩하여 내용이 구체화되었기 때문에
		// 객체를 생서할 수 있다.(추상적인 요소를 포함하지 않는다. -> 객체화, 구체화할 수 있다.)
		Test2 ob2 = new Test2();
		ob2.method1();		// 상속받은 그대로, 오버라이딩하지 않았음
		ob2.method2();		// 추상메서드를 상속받아서, 오버라이딩하여 내용을 새로 작성했음
		
		// 하나의 추상클래스 A를 상속받은 서로 다른 클래스 B, C는
		// 같은 형식의 메서드를 가지고 있지만, 내용은 전혀 다를 수 있다.
		// 오버라이딩 이므로, A타입으로 참조하고 있어도 여전히 실행할 수 있다.
		
		
	}
}
