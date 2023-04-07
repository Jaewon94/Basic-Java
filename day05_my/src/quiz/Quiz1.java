package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// while을 활용하여 다음 문제를 풀어주세요
		
		// 1) Hello, World를 3번만 출력하세요
		int i =1;
		while (i <= 3) {
			System.out.println("Hello, World!");
			i++;
		}
		// 2) 1부터, 20까지 한줄에 띄어쓰기로 구분하여 출력하세요
		i=1;
		while(i <=20) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		// 3) A부터 Z까지 한줄에  콤마로 구분하여 출력하세요
		// 단, 마지막에는 콤마가 없어야 합니다.
		char ch = 'A';
		
		while (ch <='Z') {
			if (ch == 'Z') {
				System.out.println(ch);
			} else {
				System.out.print(ch + ", ");
			}
			ch++;
		}
		
		// 4) 1부터 100 사이의 정수 중 홀수의 합과 짝수의 합을 각각 계산하여 출력하세요
		// 연산을 하려면 값이 지정이 되어 있어야 해서 항등원 값을 미리 넣어둔다.
		// 항등원 : 어떤 수에 대하여 연산을 한 결과가 처음의 수와 같도록 만들어 주는 수
		int odd=0, even=0, total =0;
		i=1;
		while (i <=100) {
			if (i %2 == 0) {
				even += i;
			} else {
				odd += i;
			}
			total +=i;
			i++;
		}
		System.out.println("1 ~ 100 까지의 합 : "+ total);
		System.out.println("1 ~ 100 중 짝수들의 합 : "+ even);
		System.out.println("1 ~ 100 중 홀수들의 합 : "+ odd);
		
		// 5) 입력받은 정수를 거꾸로 출력하세요
		
		int num, rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		num = Integer.parseInt(sc.nextLine());
		while (num != 0) {
			rev *= 10;
			rev = rev +(num%10);
			num /= 10;
		}
		System.out.println("reverse : " + rev);
		sc.close();
	}
}
