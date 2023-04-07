package vending;

import java.util.Scanner;

// 자판기 객체 및 상품 객체를 생성하여
// 코드를 진행하는 클래스
// 사용자 입력에 따라서 출력한다.

public class Main {
	public static void main(String[] args) {
		
		Machine mac = new Machine();
		Scanner sc = new Scanner(System.in);
		int money;
		
		
		while(true) {		// 반복 시작
			System.out.print("금액을 입력하세요 : ");		
			money = Integer.parseInt(sc.nextLine());	// 넣을 돈의 금액을 입력
		
			boolean ready = mac.inputMoney(money);		// inpuMoney()메서드를 통해
														// 입력받은 money의 금액을 체크
			if(ready) {									// 메서드에 의해 돈이 충분하면 true 반환
				break;									// 그렇다면 반복 종료
			}											// false라면 계속 반복
		}
										// 구매할 상품의 목록을 출력
		
		while (mac.isEnoughMoney()) {
			
			mac.show();		
			
			System.out.print("음료를 선택하세요 : ");
			int select = Integer.parseInt(sc.nextLine());
			
			Product drink = mac.getProduct(select);
			if(drink == null) {
				
			}
		}
	
		
		
		
	}
}
