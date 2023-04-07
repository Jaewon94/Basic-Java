package quiz;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		
		// 놀이기구 이용시간에 따른 이용 요금을 계산하려고 한다.
		// 기본 요금은 3000원이며, 10분마다 500원의 추가 요금이 발생한다.
		// 요금표는 다음과 같다.
		//  0 ~ 30 : 3000
		// 31 ~ 40 : 3500
		// 41 ~ 50 : 4000
		// 51 ~ 60 : 4500
		// ...
		
		Scanner sc = new Scanner(System.in);
		
		int basic = 3000;
		int minuet, pay;
	
		int min =30;
		
		
		System.out.print("이용시간 : ");
		minuet = Integer.parseInt(sc.nextLine());
		
		int basicTime = minuet - min;
		int overTime = basicTime/10;

		if (basicTime < 0) {
			pay = basic;
		
		} else if (basicTime % 10 == 0) {
			pay = basic + (overTime * 500);
			
		} else {
			pay = basic + ((overTime + 1) * 500);
			
		}
		System.out.printf("이용요금 : %d원",pay);
		sc.close();
		
	}
}
