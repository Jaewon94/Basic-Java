package loop;

public class Ex01_while {
	public static void main(String[] args) {
		
		// if가 조건에 따라 종속문장을 1회 실행한다면
		// while은 조건에 따라 종속문장을 여러번 반복하여 실행한다.
		
		int num = 10;
		
		if(num <20) {
			num+=1;
			System.out.println("if) num : "+num);
		}
		
		while(num <20) {	// 조건이 참인 동안, 종속문장을 실행한다.
			num+=1;
			System.out.println("while) num : "+num);
		}
		// 무한반복 : 조건이 항상 참인 반복문
		while(true) {	// 조건이 참인 동안, 종속문장을 실행한다.
			num+=1;
			System.out.println("infinite loop) num : "+num);
			
			// break : 현재 속한 반복문 범위를 아래로 벗어난다.
			if(num==10000) {
				break;
			}
		}
		System.out.println("끝");
		
		// do ~ while : 일단 한번 실행하고, 이후 반복여부를 결졍한다.
		int cnt = 0;
		do {
			System.out.println("Hello");
			cnt++;
		} while(cnt != 5);
	}
}
