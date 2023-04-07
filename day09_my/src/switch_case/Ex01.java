package switch_case;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 제어문 중에서 분기문 switch
		// if와 비슷한 용도로 사용할 수 있으나 범위가 제한된다.
		// if는 크기비교를 다양하게 할 수 있으나
		// switch는 특정 변수, 특정 연산결과의 값만으로 흐름을 분기한다.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("정수 입력 : ");
		num = Integer.parseInt(sc.nextLine());
		
		if (num ==1) {
			System.out.println("1번 선택");
		} else if (num ==2 ) {
			System.out.println("2번 선택");
		} else {
			System.out.println("1번도 2번도 아님");
		}
		System.out.println("===================");
//		double test = 1.2;		// 실수형은 switch에 놓을 수 없다.
//		String test2 = "hello";	// 문자열은 놓을 수 있으며, equals와 동일한 효과를 가진다.
		// switch문 조건에는 정수만 가능
		switch (num) {
		case 1:
			System.out.println("1번 선택!");
			break;
		case 2:
			System.out.println("2번 선택!");	
			break;
		default:
			System.out.println("1번도 2번도 아님!");
			break;
		}
		sc.close();
	}
}
