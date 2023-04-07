package switch_case;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// switch에서 break를 의도적으로 생략하는 예시
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("정수 입력 : ");
		num = Integer.parseInt(sc.nextLine());
		
		switch (num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println("홀수");
			break;
		case 2: case 4: case 6: case 8: case 10:
			System.out.println("짝수");
			break;
		default:
			System.out.println("홀수도 짝수도 아님");
		}
		System.out.println("================");
		// switch는 연산식도 사용가능하다.
		
		switch(num % 2) {
		case 0:		// if (num % 2 == 0)
			System.out.println("짝수");
			break;
		case 1:		// if (num % 2 != 0)
			System.out.println("홀수");
			break;
		}
		// default는 반드시 작성해야 하는 필수 사항이 아니다.
		sc.close();
	}
}
