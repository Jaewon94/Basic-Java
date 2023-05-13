package array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		// 배열 생성 시 변수를 사용할 수 있다(C언어는 안됨)
		int length =5;
		
		
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[length];
		
		for(int i=0; i<arr.length;i++) {
			System.out.print("추가할 이름 입력 : ");
			String name = sc.nextLine();
			arr[i] = name;
		}
		
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
