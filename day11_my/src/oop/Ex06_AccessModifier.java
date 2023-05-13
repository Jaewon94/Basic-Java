package oop;

class Test{
	
	private int n1 = 1;
	int n2 = 2;
	protected int n3 = 3;
	public int n4 = 4;
	
	// 메서드는 클래스 내부에서 수행되므로, private이라도 접근하여 출력할  수 있다.
	void show() {
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		System.out.println("n4 : " + n4);
	}
}

public class Ex06_AccessModifier {
	public static void main(String[] args) {
		// 접근제한자 : 클래스에 작성된 멤버요소의 접근에 대하여 제한을 설정하는 키워드
		
		// private 		: 클래스 내부에서만 접근 가능, 같은 클래스의 서로 다른 객체끼리는 접근 가능
		// package		: 같은 패키지 폴더 내부의 클래스끼리 접근 가능, 기본값
		// protected 	: 패키지 범위를 포함하여, 패키지가 달라고 상속관계라면 접근 가능
		// public 		: 클래스 외부에서도 누구나 접근 가능
		
		Test t1 = new Test();
		
		t1.show();
		// The field Test.n1 is not visible
		// 공개하지 않았기 때문에, 외부에서 볼 수 없다. (존재하지 않는다라고 하지 않고 보이지 않는다 라고 함)
//		System.out.println("n1 : " + t1.n1);
		System.out.println("n2 : " + t1.n2);
		System.out.println("n3 : " + t1.n3);
		System.out.println("n4 : " + t1.n4);

		// private 필드의 값은 직접 참조할 수 없다.
		// 그러나, ob.show()의 형태처럼 [내부 메서드]를 통해서는 접근할 수 있다.
		
		// 특정 필드의 값을 반환하는 메서드를 getter 라고 한다.
		// 특정 필드의 값을 대입하는 메서드를 setter 라고 한다.
		
		// getter 와 setter는 접근 제한자 개념에 의해 만들어진 요소이고
		// 필드는 private, 메서드에는 public을 걸어주는 것이 일반적이다.
		
		// 단, 누구나 참조할 수 있어야 하는 static final 필드는 public을 걸어준다.
		
		
		// java.lang.Integer
		System.out.println(Integer.MIN_VALUE);
	}
}
