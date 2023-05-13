package object;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 처음보는 클래스나 메서드를 사용하거나 궁금하다면 
		// Java API 문서에서 찾아보는 습관을 가져야 한다.
		
		Scanner sc = new Scanner(System.in);
		
		String scannerClassName = sc.getClass().getName();
		String superName =  sc.getClass().getSuperclass().getName();
	
		
		System.out.println("scanner : "+ scannerClassName);
		System.out.println("scanner의 슈퍼클래스의 이름 : " + superName);
		
		sc.close();
		
		// 다른 클래스의 슈퍼클래스 정보를 찾아보자
		
		Integer num = new Integer(150);
		System.out.println();
		System.out.println("Integer");
		System.out.println(num.getClass().getClass().getName());
		
		System.out.println("Integer의 슈퍼클래스는 " + num.getClass().getSuperclass().getName());
		
		System.out.println("Integer의 슈퍼의 슈퍼클래스는 " + Integer.class.getSuperclass().getSuperclass().getName());
		
		System.out.println("Double의 슈퍼클래스 "+ Double.class.getSuperclass().getName());
		System.out.println("String의 슈퍼클래스 "+ String.class.getSuperclass().getName());
	}
}
