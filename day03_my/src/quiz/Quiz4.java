package quiz;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 생년월일 6자리를 정수로 입력 받아서, 년, 월, 일로 구분하고
		// 현재 연도를 이용하여 나이를 구하세요
		// 그런다음, 출생년도는 4자리로 만들어서 연월일과 현재나이를 출력해 주세요
		// 나이가 20이상이면 성인, 아니면 미성년자로 만들어서 함께 출력합니다.
		
		// 입력 : 930516
		// 출력 : 1993년 5월 16일 출생, 31세, 성인입니다.
		
		// 입력 : 110203
		// 출력 : 2011년 2월 3일 출생, 13세, 미성년자 입니다.
		
		int birth, day, month, year, age;
		String s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생년월일을 입력하세요 >> ");
		birth = Integer.parseInt(sc.nextLine());
		day = birth %100;
		birth /= 100;
		
		month = birth % 100;
		birth /= 100;
		
		if (birth > 50) {
			year = birth + 1900;
		} else {
			year = birth + 2000;
		}
		
		age = 2023 - year + 1;
		
		if (age > 20) {
			s = String.format("성인입니다.");
		} else {
			s = String.format("미성년자입니다.");
		}
		
		System.out.printf("%d년 %d월 %d일 출생, %d세, %s",year, month, day, age, s);
		sc.close();
	}
}
