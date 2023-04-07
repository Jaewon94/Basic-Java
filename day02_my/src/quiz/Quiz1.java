package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 *  두 정수를 입력 받아서 합계를 구하고,
		 *  a + b = c 의 형식으로 정답을 포함한 수식을 화면에 출력
		 *  1) 코드를 진행하기 위해 필요한 변수가 무엇이고, 몇개인지 파악
		 *  2) 고정값은 변수에 초기값으로 넣는다. 입력값을 받아서 변수에 저장한다.
		 *  3) 연산이 필요한 값은 입력 이후 처리한다.
		 *  4) 필요한 값을 추력한다. (추가로 서식을 지정해도 좋다.)
		 *  5) 코드가 종료되기 전 마무리 작업을 수행한다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a 입력 : ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("b 입력 : ");
		int b = Integer.parseInt(sc.nextLine());
		
		int c = a+b;
		System.out.printf("%d + %d = %d\n", a, b, c);
		
		sc.close();
	}
}
