package loop;

public class Ex02 {
	public static void main(String[] args) {
		// 1) 1부터 10까지의 합계를 구하는 예시
		
		int sum =0;
		
		for(int i=0; i<=10; i++) {		
			sum +=i;
		}
		System.out.println("sum : "+sum);
		
		// 2) 1부터 15 사이의 3의 배수만 출력하기
		for (int i=1; i <=15 ; i++) {
			if(i % 3 ==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 3) 1씩 감소하는 코드
		for (int i=5; i != -1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 4) 증감식에 복합대입 연산자 사용 (+, -, *, %, / 사용가능)
		for (int i=0; i<= 25; i+=5) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 5) char 배열에 대해서 작업을 수행할 때
		String str ="Readability counts";
		char[] arr =str.toCharArray();
		for(int i =0; i<arr.length; i++) {
			char ch = arr[i];	// 반복이 수행될때 마다 새로 만들어지는 지역 변수 ch
			System.out.printf("%c : %d\n",ch,(int)ch);
		}
		System.out.println();
		
		// 6) 배열 혹은 iterable 한 컬렉션에 대하여 index를 생략할 때
		// 향상된 for문, 하지만 기본 for문을 잘써야 됨
		// 향상된 for문은 쉽게 사용 가능해진 대신 사용 못하는 기능이 몇가지 있음
		for(char ch : arr) {
			System.out.printf("%c : %d\n",ch,(int)ch);
		}
		System.out.println();
	}
}
