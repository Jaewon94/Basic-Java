package operator;

import java.util.Scanner;

public class Ex04_Calculator {
	public static void main(String[] args) {
		// if를 사용하지 않고, 삼항연산으로만 두 정수의 사칙연산 계산기를 만들어 보자
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, answer;
		char oper;
		
		System.out.println("첫번째 정수 입력 >> ");
		n1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("연산자 입력  >> ");
		oper = sc.nextLine().charAt(0); // 입력받은 문자열의 0번째 글자만 저장한다.
		
		System.out.println("두번째 정수 >> ");
		n2 = Integer.parseInt(sc.nextLine());
		
		
		answer = oper == '+' ? n1 + n2:
				 oper == '-' ? n1 - n2:
				 oper == '*' ? n1 * n2:
				 oper == '/' ? n1 / n2: 0;
		// 이렇게 까지 삼항연산을 사용하지는 않음
		// 되도록이면 한줄로 끝나는 방법으로 사용
		System.out.printf("%d %c %d = %d \n", n1, oper,n2,answer);
		sc.close();
	}
}
