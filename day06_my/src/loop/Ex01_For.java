package loop;

import java.util.Arrays;

public class Ex01_For {
	public static void main(String[] args) {
		// 일정한 횟수만큼 반복하고 싶을때 
		
		int cnt = 0;						// 횟수 체크 변수
		
		while(cnt < 5) {					// 반복 조건
			System.out.println("Hello");	//종속문장
			cnt++;							//증감식
		}
		System.out.println("cnt : "+ cnt);
		System.out.println();
		
		// for문으로 변경
		for(int i =0; i<5;i++) {			// (1)변수선언 ; (2)조건; (3)증감식
			System.out.println("Java");		// (4)종속문장
		}
		// 1 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4...2(false)
		// for문에서 변수 선언 및 초기화(1)는 최초 1회만 실행 되며
		// 그 이후에는 조건 체크 -> 종속문장 실행 -> 증감식
		
		
		// while문은 미리 카운트할 변수가 있어서 값이 남아 버리지만
		// for문에서는 증감때 쓴 변수는 for문 사용시에만 살아 있고 끝나면 사라진다.
		
		String str = "Simple is better than complex.";
		char[] arr = str.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		// 배열을 순번(index)을 이용하여, 같은 자료형의 여러 값을 묶어서 관리한다.
		// 이때, 순번은 항상 0부터 시작하며 [길이 -1]까지 접근 할 수 있다.
		
		for(int i=0;i<arr.length;i++) {
			if('a'<= arr[i] && arr[i] <='z') {
				System.out.println((char)(arr[i] - 32));
			} else {
				System.out.println(arr[i]);
			}
			
		}
		
		System.out.println(str.toUpperCase());
	}
}
