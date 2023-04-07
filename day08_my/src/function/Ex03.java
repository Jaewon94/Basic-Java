package function;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		// 1) 전달받은 정수가 primeNumber인지 아닌지 판별하는 함수를 작성하세요
		boolean t1 = isPrime(10);
		boolean t2 = isPrime(7);
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		
		// 2) 두 정수를 전달받아서, 두 정수 사이의 primeNumber로 구성된 배열을 반환하는 함수를 작성
		int[] arr = interPrime(1, 15);
		System.out.println("arr : "+ Arrays.toString(arr));
		// 3) 1부터 1000사이의 소수로 구성된 정수 배열을 출력
		int first = 1;
		int last =1500;
		int[] count = interPrime(first, last);
		
		System.out.printf("%d ~ %d 까지 소수들의 배열: ",first,last);
		System.out.println(Arrays.toString(count));
		// 4) 3번의 배열의 소수 갯수는 몇개인가?
		System.out.printf("%d ~ %d 까지 소수들의 갯수는 %d개 입니다. \n" ,first,last,count.length);
		
		// 5) 배열의 내용을 문자열로 변환하여 한 줄당 10개씩 문자열을 만들어서 반환하는 함수
		// 배열을 전달, 문자열을 반환
	

		
		System.out.println(getStringFromArray(count));
	}
	
	static boolean isPrime(int n) {
		int count =0;
		boolean answer = false;
		if (n != 1) {
			for (int i=1; i<=n; i++) {
				if (n%i == 0) {
					count++;
				}
			}
		}
		if (count == 2) {
			answer = true;
		}
		return answer;
	}

	static int[] interPrime(int n1, int n2) {
		int length = 0;
		int j = n1;
		for (; n1 <= n2; n1++) {
			if (isPrime(n1)) {
				length++;

			}
		}
		
		int[] arr = new int[length];
		
		for(int i=0; j <= n2;j++) {
			if (isPrime(j)) {
				arr[i] = j;
				i++;
			}
		}
	
		return arr;
	}

	static String getStringFromArray(int[] arr) {
		String str ="";
		for (int i=0; i<arr.length;i++) {
			str += String.format("%4d", arr[i]);
			str += i % 10 ==9 ? "\n" : ", ";
		}
		str = str.substring(0, str.length()-2);
		return str;
	}
	
}
