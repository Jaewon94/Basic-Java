package function;

public class Ex01 {
	public static void main(String[] args) {
		
		// 함수는 무엇인가?
		
		// 계산식, y = f(x)
		// 코드 
		// 일정한 코드를 특정한 이름으로 묶어둔 내용
		// 일정한 코드에 의해서 값을 계산하는 내용
		// 변수, 상수와 마찬가지로 어떤 값을 만들어내는 개체, 함수
		// void 형태의 함수는 값을 만들어내지 않는다.
		// produces(생산), consume(소비)
		// [연료를 소비]하면서 엔진을 이용하여 [동력을 생산]한다.
		
		// 자바에서 코드의 기본 단위는 클래스 입니다.
		// 따라서, 모든 함수는 클래스 내부에 만들어진다.
		// main 함수에서 호출(실행)하고 싶은 함수는 반드시 static을 붙여서 작성해야 한다.
		
		int t1 = add(10,20);		// 함수의 호출 : 이름을 부르면서 재료가 되는 값(인자)를 전달
		int t2 = pow(2,10);			// 호출되면 정의된 내용을 수행하고 값을 돌려준다.(반환)
		
		System.out.println("t1 : "+t1);
		System.out.println("t2 : "+t2);
	}
	
	
	// 어떤 내용을 수행할지 결정하여 일정한 크기의 코드로 만들어두고, 이름을 붙인다.
	// 함수도 값을 만들어내는 요소이므로, 값의 자료형이 필요하다.
	// 함수의 자료형은 반환값의 자료형과 일치한다.
	// add함수는 두 정수 n1과 n2를 전달받아서 두 값을 더하고, 더한 결과를 정수형으로 반환한다.
	static int add(int n1, int n2) {	// 매개변수 : 외부에서 넘어오는 값을 받는 변수
		int answer = n1+n2;				//         넘어온 변수는 전부 사용해야함
		return answer;
	}
	
	
	// y = f(x)
	// 반환자료형 함수이름(매개변수 선언)
	static int pow(int n1, int n2) {	
		int answer = 1;					// 곱셈연산에 대한 항등원
		for(int i=0; i<n2; i++) {		// 제어문을 사용할 수 도 있다.
			answer *= n1;
		}
		return answer;					// return : 함수를 종료하면서, 하나의 값을 호출위치로 넘겨준다.
										//         이때 반환할 값을 맞춰야함
	}
	
	// 몇몇 함수는 값의 반환이 필요하지 않고, 특정코드를 수행하는 목적으로 사용하기도 한다.
	static void sayHello() {			// 값을 전달받을 필요도 없다
		System.out.println("Hello!!");	// 항상 정해진 값만 처리하기 때문
	}
	static void saySomething(String str) {	// 전달받은 내용을
		// 만약 특정 조건에서 함수를 강제로 종ㄹ료하고 싶다면 return; 을 사용할 수 있다.
		if(str==null || "".equals(str)) {
			return;	// 현재 줄에서 함수를 즉시 종료하면, 이후 출력문은 실행되지 않는다.
		}
		System.out.println(str);			// 출력한다.
											// 반환할 값이 없으므로, return을 작성하지 않아도 된다.
		
	}
}
