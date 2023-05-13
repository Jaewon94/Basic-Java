package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3,min;
		boolean isTrue = false;
		
		System.out.print("1) 정수 입력 >> ");
		num1 = Integer.parseInt(sc.nextLine());
	
		// 1) 정수를 입력 받아서 절대값을 출력하기
		if (num1 < 0) {num1 = -(num1);}
	
		
		System.out.println("1) num1 : "+num1);
		System.out.println();
		
		// 2) 두 정수를 입력 받아서 작은 값을 출력하기
		System.out.print("2) 첫번째 정수 입력 >> ");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("2) 두번째 정수 입력 >> ");
		num2 = Integer.parseInt(sc.nextLine());
		
		if (num1 > num2) {
			System.out.println("2) 둘 중 더 작은 수 : " + num2);
		} else {
			System.out.println("2) 둘 중 더 작은 수 : " + num1);
		}
		System.out.println();
		
		// 3) 세 정수를 입력 받아서 가장 작은 값을 출력하기
		System.out.print("3) 첫번째 정수 입력 >> ");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("3) 두번째 정수 입력 >> ");
		num2 = Integer.parseInt(sc.nextLine());
		
		System.out.print("3) 세번째 정수 입력 >> ");
		num3 = Integer.parseInt(sc.nextLine());
		min = num1;
		if (min > num2) { min = num2;}
		if (min > num3) { min = num3;}
		System.out.println("3) 가장 작은 수 :" +min);
		System.out.println();
		
		// 4) 정수의 범위가 1에서 20사이에 포함되면 true, 아니면 false출력
		System.out.print("4) 정수 입력 >> ");
		num1 = Integer.parseInt(sc.nextLine());
		
		if (num1 >0 && num1 <= 20) {
			isTrue = true;
		}
		System.out.println("4) 정수가 1~ 20 사이에 있나? : "+ isTrue);
	
		sc.close();
	}
}
