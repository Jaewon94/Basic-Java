package abstractClass;

// 인터페이스 : 추상 클래스의 한 종류
// 일반적인 추상 클래스와 달리, 일반 메서드를 포함할 수 없다.
// 인터페이스의 모든 필드는 public static final 속성을 포함한다.
// 인터페이스의 모든 메서드는 public abstract 속성을 포함한다.
// 인터페이스는 extends 대신 implements로 상속처리한다.
// 인터페이스는 다중상속을 허용한다.

interface Test3 {
	// 필드에서 public static final 은 생략가능
	public static final int NUM1 = 10;
	
	// 메서드에서 public abstract 은 생략가능
	public abstract void method3();
	
}

class Test4 implements Test3 {

	@Override
	public void method3() {
		System.out.println("method3");
	}
	
}
public class Ex02 {
	public static void main(String[] args) {
		Test4 ob = new Test4();
		ob.method3();
		
		// 버튼을 클릭하면 어떤(?) 동작이 발생한다.
		// 여기서 어떤 동작은 추상적인 내용, 다만 클릭했을때 어떤 내용이 실행된다는 사실은 확정
		// 그렇다면 어떤 내용이 실행될 것인가? 에 대하여 함수를 작성하게 된다.
		
		// 1) 버튼을 클릭했을 때, 새로운 창에서 그림이 나타나는 함수
		// 2) 버튼을 클릭했을 때, 휴대폰 번호를 입력받아서 인증절차를 진행하는 함수
		// 3) 버튼을 클릭했을 떄, 이미 입력된 값으로 서버에 연결하여 로그인하는 함수
	}
}
