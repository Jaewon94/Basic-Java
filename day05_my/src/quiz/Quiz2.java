package quiz;

public class Quiz2 {
	public static void main(String[] args) {
		// 첫날에 10원으로 시작하여, 하루가 지날때 마다 2배씩 입금 금액을 늘려나간다.
		// 이런 식으로 30일 동안 입급했을때, 은행에 누적된 금액이 얼마인지 계산하여 출력하세요
		// 10, 20, 40, 80 ...
		
		long seed = 10;
		int day =1;
		long saved=0;
		
		while (day <= 30) {
			saved += seed;
			System.out.printf("%d일 누적된 금액 : %,d\n",day,saved);
			seed = seed * 2;
			day++;
		}
		
		
	}
}
