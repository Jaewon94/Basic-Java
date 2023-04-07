package day07_my;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		// 정수를 입력받아서 일정 칸 만큼 거리를 둔 후에 도형 출력하기
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("빈 칸의 개수 입력 : ");
		num = Integer.parseInt(sc.nextLine());
		
		System.out.print("[");
		for(int i =0; i<num; i++) {
			System.out.print(" ");
		}
		System.out.print("]");
		sc.close();
				
	}
}
