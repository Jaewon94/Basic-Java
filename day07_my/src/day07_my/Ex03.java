package day07_my;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		
		int num;
		int length =50;
		
		System.out.print("정수 입력 (%) : ");
		num = Integer.parseInt(sc.nextLine());
		
		
		for (int i =0; i <=num; i++) {				// 여러 줄을 출력한다.

			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");	// 눈속임용
			System.out.print("[");
			for(int j =0; j<length; j++) {			// 한줄당 출력내용은 다음과 같다.
				if (j == length /2) {				// 가운데에는 퍼센트 수치를 출력한다.
					System.out.printf(" %3d ", i);
				}
				else if (j < i/2) {					// 입력받은 수보다 작은 구간은 #를 출력한다.
					System.out.print("#");
				}
				else {								// 입력받은 수보다 크거나 같으면 공백을 츨력
					System.out.print(" ");
				}
			}
		System.out.println("]");
		Thread.sleep(100);

//		Runtime.getRuntime().exec("cmd /c cls");	// 운영체제에게 직접 명령을 전달한다.(자바에서 실행 안됨)
		
		}
		sc.close();
	}
}
