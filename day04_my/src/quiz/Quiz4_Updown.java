package quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz4_Updown {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int cnt=0;
		int answer = ran.nextInt(100000) +1;
		int user, min=1, max=100000;
		
		
		while(true) {
			System.out.printf("%d ~ %d >> ", min, max);
//			user = Integer.parseInt(sc.nextLine());
			
			user = (min+max) /2;
			System.out.println("컴퓨터가 계산한 값 : " +user);
			
			cnt++;
			if (answer > user) {
				System.out.println("up!");
				min = user +1;
			}
			else if (answer < user) {
				System.out.println("down!");
				max = user -1;
			}
			else {
				System.out.printf("정답은 %d입니다. %d회만에 정답을 맞췄습니다.",answer,cnt);
				sc.close();
				break;
			}
		}
	}
}
