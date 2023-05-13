package array;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		// 자료형이 다르지만 길이가 같은 배열을 만들어서 데이터 입력 및 출력하기
		
		int length = 5;
		String[] names = new String[length];
		int[] ages = new int[length];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<names.length; i++) {
			System.out.print("이름 입력 >> ");
			names[i] = sc.nextLine();
			
			System.out.print("나이 입력 >> ");
			ages[i] = Integer.parseInt(sc.nextLine());
		}
		
		for(int i=0;i<ages.length;i++) {
			System.out.printf("%s는 %d살입니다.\n",names[i],ages[i]);
		}
		System.out.println("끝");
		sc.close();
	}
}
