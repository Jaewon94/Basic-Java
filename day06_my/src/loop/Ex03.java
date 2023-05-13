package loop;

public class Ex03 {
	public static void main(String[] args) {
		
		// 1) 1 부터 100 사이의 홀수의 합과 짝수의 합을 각각 구하여 출력하시오
		int oddSum=0, evenSum=0, total=0;
		
		for(int i=1; i<=100; i++) {		// 값이 변하는 변수에 대한 반복문
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
			total += i;
		}
		System.out.println("total : " + total);
		System.out.println("oddSum : " + oddSum);
		System.out.println("evenSum : " + evenSum);
		
		// 2) 1부터 1000 사이의 7의 배수의 합만 구하여 출력하세요
		total =0;
		for (int i=1; i<=1000; i++) {
			if (i %7 ==0) {
//				System.out.printf("%d + %d = %d\n",total, i,total +i);
				total += i;
			}
		}
		System.out.println("1~1000사이 7의 배수들의 합 : " + total);
			
		// 3) 11부터 20 사이의 합을 출력하세요 (for문의 범위를 지정할 수 있는가?)
		total =0;
		for(int i =11; i<=20; i++) {
//			System.out.printf("%d + %d = %d\n",total, i,total +i);
			total += i;
		}
		System.out.println("11 ~ 20 사이의 합 : "+ total);
		
			
		// 4) 5부터 0까지 카운트한 이후 "완료" 라고 출력
		// 반복하고 싶은 내용은 반복문 안에 넣고
		// 반복하지 않는 내용은 반복문 바깥으로 빼면 된다.
		// 아니면 if처리
		for (int i=5; i>=0; i--) {
			System.out.println(i);
			if (i == 0) {
				System.out.println("완료");
			}
		}
		
	}
}
