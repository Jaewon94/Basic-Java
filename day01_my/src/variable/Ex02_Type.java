package variable;

public class Ex02_Type {
	public static void main(String[] args) {
		
		// 데이터의 형태에 따라 수행할 수 있는 내용이 달라진다.
		
		// = (대입 연산자) : 우변의 값을 좌변의 공간에 복사하여 저장한다.
		// 대입 연산을 수행할 때, 좌변과 우변의 자료형은 같아야 한다.
		int a = 10;			// 정수값을 정수형 변수에 저장(O)
		long b = 20;		// 정수값을 정수형 변수에 저장(O)
		byte c = 30;		// 정수값을 정수형 변수에 저장(O)
//		short d = 40000;		// 정수값을 정수형 변수에 저장, 변수가 수용할 수 있는 범위 초과 (X)
		char e = (char)1.2;		// 실수값을 정수형 변수에 저장, 데이터의 일부 손실이 발생함(x)
		double f = 3;		// 정수값을 실수형 변수에 저장, 크기초과도 없고, 손실도 없음(O)
		
		// + : 덧셈 연산자, 좌변과 우변의 값을 더해서 새로운 값을 만든다.
		//		양쪽 중 하나라도 문자열이 있으면, 문자열을 이어붙인다.
		//		양쪽이 모두 숫자라면, 덧셈 연산을 수행하여 계산한다.
		
		System.out.println(1 + "2");
		System.out.println("1" + 2);
		System.out.println(1 + 2);
		System.out.println();
		
		// wrapper class : primitive Type을 Class Type으로 처리하기 위한 자료형
		// 기존의 primitive를 Class Type으로 감싸는(wrap) 클래스
		
		String s1 = "1234";
		System.out.println(s1+1);
		
		// 강제 형변환은 아니지만, 데이터의 형태를 변경하는 기능이 있다.
		int n1 = Integer.parseInt(s1);	
		System.out.println(n1+1);
		int n2 =2222;
		Integer n3 = n2;
//		n2.		// 값만 있고 기능이 없는 비 객체형 데이터
//		n3.		// 값도 저장하고, 관련된 기능과 추가 변수가 포함된 객체형 데이터
		
	}
}
