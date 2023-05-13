package quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 지하철 한 구간당 약 3분의 시간이 소요된다고 가정한다. 
		// 이동한 지하철 구간 수를 입력받아서
		// 걸린 시간을 출력하세요
		// 단, 시간이 60분을 초과하면, 시간과 분으로 나눠서 출력하고
		// 60분 이하이면, 분으로만 출력하세요
		// 문자열의 형식을 지정하기 위해서, String.format(format, args...)함수를 사용
		
//		String test1 = String.format("%d시간 %d분", 1, 12);
//		String test2 = String.format("%d분", 36);
//		System.out.println("test1 : " + test1);
//		System.out.println("test2 : " + test2);
		
		
		Scanner sc = new Scanner(System.in);
		
		int station, time;
		String s;
		
		System.out.print("지하철 구간 수 : ");
		station = Integer.parseInt(sc.nextLine());
		
		time = station * 3;
		
		if (time > 60) {
			s = String.format("%d시간 %d분", time/60, time%60);
		} else {
			s = String.format("%d분", time);
		}
		
		System.out.println("지하철 이동시간 :"+s);
		sc.close();
	}
}
