package operator;

import java.util.Scanner;

public class EX05_Equals {

	public static void main(String[] args) {
		// 참조의 대상이 같은 경우와 값이 다른 경우
		
		Scanner sc = new Scanner(System.in);
		System.out.print("apple이라고 입력 하세요! >> ");
		
		String s1 = "apple";
		String s2 = "apple";
		String s3 = new String("apple");
		String s4 = sc.nextLine();
		String s5 = "apple";
		
		String s6 = new String("banana");
		String s7 = "banana";
		// new 때문에 s6, s7이 같지 않음
		String s8 = new String("banana");
		// 비원시 자료형이라 실제로는 주소값이 변수에 저장되어 가리키는 중
		// 그래서 연산자로 비교하면 주소값이 같은지 아닌지 보는것

		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s1 == s4 : " + (s1 == s4));
		System.out.println("s1 == s5 : " + (s1 == s5));
		
		System.out.println("s6 == s7 : " + (s6 == s7));
		System.out.println("s6 == s8 : " + (s6 == s8));
		System.out.println();
		
		// 주소값이 아닌 실제 값을 비교하려면 메서드 사용해서 비교
		// 참조값을 비교하지 않고, 값의 일치여부를 비교하려면 A.equals(B)를 사용
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s1.equals(s3) : " + s1.equals(s3));
		System.out.println("s1.equals(s4) : " + s1.equals(s4));
		System.out.println("s1.equals(s5) : " + s1.equals(s5));
		
		System.out.println("s6.equals(s7) : " + s6.equals(s7));
		System.out.println("s6.equals(s8) : " + s6.equals(s8));

	}
}
