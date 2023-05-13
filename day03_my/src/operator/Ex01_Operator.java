package operator;

public class Ex01_Operator {
	public static void main(String[] args) {
		// 단한 증감 연산자 : 1개의 변수에 대해 작동하며 값을 1증가 시키거나 감소시킨다.
		// 연산자의 위치에 따라 선처리되거나 후처리 될 수 있다.
		
		int num = 10;
		System.out.println(++num);	// 전치(전위) 증가 연산 	(먼저 증가, 이후 출력)
		System.out.println(num++);	// 후치(후위) 증가 연산	(먼저 출력, 이후 증가)
		System.out.println(num--);	// 후위 감소 연산		(먼저 출력, 이후 감소)
		System.out.println(--num);	// 전위 감소 연산		(먼저 감소, 이후 출력)
		
		// 복합 대입 연산자는 2항 연산이고, 증감연산은 1항 연산이다.
		if((num += 1) < 10) {
			
		}
		if(++num <10) {
			
		}
		
		// 단항 부호 연산자
		System.out.println(num);
		System.out.println(-num);
		
		
	}
}
