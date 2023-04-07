package control;

import java.util.Scanner;

public class Ex08_quiz {
	public static void main(String[] args) {
		// 두 정수를 입력 받아서, 첫번째 정수와 두번째 정수의 크기를 비교하여
		// 크다, 같다, 작다로 구분하여 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.printf("첫번째 정수 입력 >> ");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.printf("두번째 정수 입력 >> ");
		num2 = Integer.parseInt(sc.nextLine());
		
		if (num1 > num2) {
			System.out.printf("%d은(는) %d보다 크다.\n",num1, num2);
		} else if (num1 == num2) {
			System.out.printf("%d은(는) %d와(과) 같다.\n",num1, num2);
		} else {
			System.out.printf("%d은(는) %d보다 작다.\n",num1, num2);
		}
		
		sc.close();
	}
}
