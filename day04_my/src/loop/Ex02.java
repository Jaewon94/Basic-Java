package loop;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		// 1) 1부터 5까지 한줄에 출력하세요
		int i=1;
		while(i <= 5) {
			System.out.print(i+" ");	// 줄을 바꾸지 않고 띄워쓰기로 구분
			i++;
		}
		System.out.println();
		
		// 2) 1부터 100까지의 정수 중 7의 배수만 한줄에  
		i=1;
		while(i <= 100) {
			if(i %7 == 0) {
				System.out.print(i+" ");	
			}
			i++;
		}
		System.out.println();
		
		// 3) 점수를 입력받기위해 변수를 만들고,
		// 변수의 값이 0 ~ 100 사이에 포함될 때까지 반복하여 입력받고 이후 출력
		int num= -1;
		Scanner sc = new Scanner(System.in);
		while (num < 0 || num >100) {
			System.out.print("정수 입력 >> ");
			num = Integer.parseInt(sc.nextLine());
		}
		sc.close();
	}
}
