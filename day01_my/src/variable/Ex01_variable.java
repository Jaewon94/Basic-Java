package variable;

public class Ex01_variable {
	// 이클립스에서 자동완성 : ctrl + space
	public static void main(String[] args) {
		System.out.println("변수와 자료형");
		
		// 변수 : 프로그램에서 사용할 데이터를 저장하는 메모리 공간
		// 변수마다 크기가 다르고 유형도 다르다
		
		// 1) primitive Type : 데이터를 직접 저장하는 기본 자료형
		//		byte, boolean, char, short, int, long, float, double
		//		별도의 형태 정의가 없어도 단순한 형태로 표현할 수 있는 데이터들
		
		// 변수 선언(변수 새로 만들기), 변수 이름은 중복될 수 없다.
		// 자료형 변수이름;
		// 자료형 변수이름 = 값;
		
		boolean bo =true;		// 논리값, 1바이트, true 혹은 false만 저장가능
		
		byte by = 127;			// 정수, 1바이트, -128 ~ +127
		short sh = 32767;		// 정수, 2바이트, -32768 ~ +32767
		char ch = 44032;		// 정수, 2바이트(글자), 0 ~ 65535
		int num = 1234;			// 정수, 4바이트(기본), 약 -21억 ~ 약 +21억
		long ln = 3000000000l;	// 정수, 8바이트, 약 -922경 ~ 약 +922경
		
		float fl = 1.2f;		// 실수, 4바이트
		double db = 3.14;		// 실수, 8바이트(기본)
		
		
		System.out.println("bo : " + bo);
		System.out.println("by : " + by);
		System.out.println("sh : " + sh);
		System.out.println("ch : " + ch);
		System.out.println("num : " + num);
		System.out.println("ln : " + ln);
		System.out.println("fl : " + fl);
		System.out.println("db : " + db);
		
		System.out.println();
		
		// 표시형식은 글자이지만, 내부 저장형식은 정수이므로, 덧셈연산이 가능하다
		// 자바에서 홑따옴표는 단일 글자를 나타내고, 쌍따옴표는 여러글자(문자열)을 나타낸다.
		for(char ch2 = '가' ; ch2 <= '힣'; ch2++) {
			System.out.printf("%c : %d\n", ch2,(int)ch2);
		}
		// 2) Reference Type : 다른 곳에 데이터를 생성하고 대상을 참조하는 자료형
		//		array, object...
		//		자신만의 고유한 특정 형식을 가지고 있는 복합적인 데이터들
	}
}
