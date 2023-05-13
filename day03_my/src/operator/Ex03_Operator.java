package operator;

import java.util.Scanner;

public class Ex03_Operator {
	// 삼항 연산자 : 
	// 1항에서는 조건, 2항에는 조건이 참일때 사용할 값, 3항에는 조건이 거짓일때 사용할 값
	// 1항 ? 2항 : 3항
	// 삼항 연산자는 값을 정하기 위해 사용한다.
	// (서로다른 코드를 수행하는 if와는 용도가 다르다)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		String adult;
		
		System.out.print("나이 입력 >> ");
		age = Integer.parseInt(sc.nextLine());
		
		adult = age >= 20 ? "성인" : "미성년자";
		System.out.printf("당신은 %d살이고, %s입니다.\n",age, adult);
		System.out.printf("당신은 %d살이고, %s입니다.\n",age, age >= 20 ? "성인" : "미성년자");
	
// 		삼항 연산자 잘못된 사용 예시 
//		age >=20 ? System.out.println("성인") : System.out.println("미성년자");
		sc.close();
	}
	
}
