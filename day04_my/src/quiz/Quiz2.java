package quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int ea = ran.nextInt(15) +1;
		int eb = ran.nextInt(15) +1;
		int ec = ran.nextInt(15) +1;
		int current;
		
		System.out.printf("ea : %d, eb : %d, ec : %d\n",ea,eb,ec);
		
		
		// 상황 : ea : 1, eb : 8, ec : 3
		// 입력 : 7을 입력 
		// 출력 : eb 엘리베이터가 이동합니다. (가장 가까운 엘리베이터)
		
		int least;
		System.out.print("현재 층수 : ");
		current = Integer.parseInt(sc.nextLine());
		
		ea = ea - current;
		eb = eb - current;
		ec = ec - current;
		
		
		if (ea < 0) { ea = -ea;}
		if (eb < 0) { eb = -eb;}
		if (ec < 0) { ec = -ec;}
		
		least = ea;
		String el = "ea";
		if (least > eb) { 
			least = eb;
			el = "eb";
		}
		if (least > ec) { 
			least = ec;
			el = "ec";
		}
		
		System.out.println(el+" 엘리베이터가 이동합니다.");
		
		sc.close();
	}
}
