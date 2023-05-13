package day07_my;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int length = 50;
		int num;
		
		System.out.print("정수를 50이하로 입력하세요 >> ");
		num = Integer.parseInt(sc.nextLine());
		System.out.print("[");
		for (int j=0; j<num;j++) {
			System.out.print("#");
		}
		for (int j=0; j<length-num;j++) {
			System.out.print("_");
		}
		System.out.print("]");
		sc.close();
	}
}
