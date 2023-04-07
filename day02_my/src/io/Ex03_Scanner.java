package io;

import java.util.Scanner;

public class Ex03_Scanner {
	public static void main(String[] args) {
		// Scanner : 자바에서 입력을 처리하기 위해 사용하는 클래스
		// java.util.Scanner
		
		// 시스템 표준 입력을 통해 데이터를 입력받는 Scanner 클래스(타입, 자료형)의 객체 
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.print("문자열 입력 : ");
		str = sc.nextLine();	// 엔터키를 입력할때 까지 입력받아서 저장한다.
		System.out.println("입력받은 문자열은 [" + str+"] 입니다.");
		
		System.out.println("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("입력한 정수 : " + num + "\n");
		
		System.out.println("실수 입력 : ");
		double db = Double.parseDouble(sc.nextLine());
		System.out.println("입력한 실수 : " + db);
		
		
		sc.close(); 			// 열어두었던 입력 통로를 닫아준다.
								// 계속 열어두면 메모리 누수가 발생
		
	}
}
