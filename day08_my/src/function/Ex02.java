package function;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		// 함수의 호출형식에 맞춰 함수 정의하기(함수 만들기)
		
		// 1) 두 정수의 덧셈
		int t1 = add(12, 23);
		int t2 = add(1245, 2345);
		
		System.out.println("t1 : " +t1);
		System.out.println("t2 : " +t2);
		
		// 2) 두 정수를 전달받아서 큰 값을 반환하기
		int t3 = bigNumber(12, 23);
		int t4 = bigNumber(1234,-5678);
		System.out.println("t3 : " +t3);
		System.out.println("t4 : " +t4);
		
		// 3) 반지름을 전달받아서, 원의 면적 double로 반환하는 함수
		// 원주율은 3.14로 계산 (원의 넓이 = 반지름 * 반지름 * 3.14)
		double t5 = circleSize(3);
		double t6 = circleSize(3.5);
		System.out.printf("t5 : %.2f\n",t5);
		System.out.printf("t6 : %.2f\n",t6);
		
		// 4) 문자열의 길이를 반환하는 함수
		int t7 = len("안녕하세요");
		int t8 = len("Hello, world!!");
		System.out.println("t7 : " +t7);
		System.out.println("t8 : " +t8);
		
		// 5) 전달받은 정수가 짝수인지 아닌지 판별하는 함수
		boolean t9 = isEvenNumber(9);
		boolean t10 = isEvenNumber(10);
		System.out.println("t9 : " +t9);
		System.out.println("t10 : " +t10);
		
//		"Hello".is
//		판별하는 함수(boolean을 반환하는 함수)는 보통 is 혹은 can, has 등으로 시작
		String text = "Baby, got me looking so crazy\r\n" + 
				"빠져버리는 daydream\r\n" + 
				"Got me feeling you\r\n" + 
				"너도 말해줄래\r\n" + 
				"누가 내게 뭐라든\r\n" + 
				"남들과는 달라 넌\r\n" + 
				"Maybe you could be the one\r\n" + 
				"날 믿어봐 한번\r\n" + 
				"I'm not looking for just fun\r\n" + 
				"Maybe I could be the one";
		Scanner sc = new Scanner(text);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			Thread.sleep(500);
		}
		sc.close();
		
	}
	
	// 자바의 함수는 반드시 지정된 타입의 값을 반환하도록 설계해야 한다.
	static int add(int n1, int n2) {
		int answer = 0;
		answer = n1 + n2;
		return answer;
	}
	
	static int bigNumber(int n1, int n2) {
		int bigger = n1;
		if (n2 > bigger) {
			bigger = n2;
		}
		return bigger;
	}

	static double circleSize(double radius) {	// 매개변수는 호출하는 사람이 알아볼수 있도록
		double answer = 0; 
		answer = radius * radius * Math.PI;
		return answer;
	}

	static int len(String s) {	// 반환값과 파라미터의 값이 같을 필요는 없다.
		return s.length();	 // 만들어진 함수에서도 다른 함수를 호출할 수 있다.
							// 함수간에 연계작업이 가능하다.
		// JVM이 main을 호출하고
		// main이 Ex02.len 호출하고
		// Ex02.len이 String.length를 호출
		// main -> len -> length
	}

	static boolean isEvenNumber(int n) {
		boolean answer = false;
		if (n %2 ==0) {
			answer = true;
		}
		return answer;
	}
}
