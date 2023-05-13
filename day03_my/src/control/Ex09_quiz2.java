package control;

import java.util.Scanner;

public class Ex09_quiz2 {
	public static void main(String[] args) {
		
		// 세 정수를 입력 받아서 그중 가장 큰 수를 화면에 출력하기
		
		int n1, n2, n3, big;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 >> ");
		n1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 정수 입력 >> ");
		n2 = Integer.parseInt(sc.nextLine());
		System.out.print("세번째 정수 입력 >> ");
		n3 = Integer.parseInt(sc.nextLine());
		
		big = n1;
		
		if (n2 >= big) {
			big = n2;
		} 
		if (n3 >= big) {
			big = n3;
		}
		
		System.out.printf("가장 큰 수 : %d", big);
		sc.close();
	}
}
