package function;

public class Ex04 {
	public static void main(String[] args) {
		
		// 기존에 예제로 활용되었던 코드들을 함수화 해보자
		// 내가 알고 있는 내용을 함수로 만들기
		
		// sample) 정수를 거꾸로 뒤집는 코드
		// 정수하나를 전달 받아서, 정수를 뒤집는 값을 반환하는 함수
		
		int t1 = reverseNumber(1234);
		System.out.println(t1);
		
		// 1) 세 정수를 전달받아서 가장 큰 수를 반환하는 함수
		int t2 = bigger(10, 40, 30);
		System.out.println("가장 큰수 : " +t2);
		
		// 2) 놀이기구 이용시간에 따른 요금을 반환하는 함수 
		// 1 ~ 29 : 3000원
		// 30 ~ 39 : 3500원
		// ...
		int t3 = timeToFee(41);
		System.out.println("놀이기구 지불 요금 : " + t3);
		
		
		// 3) 지하철 구간 당 3분, 구간 수를 전달 받아서 걸린 시간을 반환하는 함수
		// 단, 60분을 초과하면 시간과 분을 각각 출력한다.(문자열 반환)
		
		String t4 = perStation(25);
		System.out.println("걸린 시간 : " + t4);
	}
	
	// 매개변수도 넓은 범주에서 보면 지역변수이다.
	static int reverseNumber(int n) {
		int result =0;
		while(n != 0) {
			result *= 10;
			result += n % 10;
			n /= 10;
		}
		
		return result;
	}

	static int bigger(int n1, int n2, int n3) {
		int big = n1;
		if(n2 > big) {
			big = n2;
		} 
		if(n3 > big) {
			big = n3;
		}
		return big;
	}

	static int timeToFee(int time) {
		int fee = 3000;
		if (time > 30) {
			fee += 500 * (((time -21) / 10));
		}
		return fee;
	}
	
	static String perStation(int station) {
		int per = 3;
		int minuet =0;
		minuet = per * station;
		String str="";
		if (minuet/60 > 0) {
			str = String.format("%d시간 %d분", minuet/60, minuet%60);
		} else {
			str = String.format("%d분", minuet%60);
		}
		
		return str;
	}
	
	
}
