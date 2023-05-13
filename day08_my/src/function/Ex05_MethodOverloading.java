package function;

import java.io.File;
import java.util.Scanner;

public class Ex05_MethodOverloading {
	public static void main(String[] args) throws Exception{
		// 메서드 오버로딩
		// 자바는 클래스가 기본 단위이다.
		// 자바의 모든 함수(function)는 클래스에 속해있다.
		// 클래스 내부의 함수는 메서드(method)라고 부른다.
		
		// overload : 과적, 과부화
		// 하나의 함수의 이름에 여러 함수가 연결되어 있는 상태
		
		String str = "James Arthur Gosling";
		String s1 = str.substring(str.indexOf("G"));
		String s2 = str.substring(0, str.indexOf(" "));
		
		System.out.println(s2);
		System.out.println(s1);
		
		// 함수 이름이 같아도, 매개변수의 타입이나 개수가 다르다면
		// 서로 다른 함수로 인정해서 각각 정의할 수 있는 특성
		
		// 표준 입력(키보드)으로부터 내용을 읽어내는 Scanner 객체
		Scanner sc1 = new Scanner(System.in);
		
		// 문자열의 내용을 읽어내는 Scanner 객체
		Scanner sc2 = new Scanner(str);
		
		// 지정한 경로의 파일 내용을 읽어내는 Scanner 객체
		String file = "C:\\windows\\system32\\drivers\\etc\\hosts";
		Scanner sc3 = new Scanner(new File(file));
		
		System.out.print("아무 글자나 입력 : ");
		String t1 = sc1.nextLine();
		System.out.println(t1);
		
		while(sc2.hasNext()) {
			System.out.println(sc2.next());
			Thread.sleep(200);
		}
		
		while(sc3.hasNextLine()) {
			System.out.println(sc3.nextLine());
			Thread.sleep(100);
		}
		
		sc1.close();
		sc2.close();
		sc3.close();
		
		
	}
}
