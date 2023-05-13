package array;

public class Ex06 {
	public static void main(String[] args) {
		// 같은 자료형의 여러 데이터를 연속된 메모리 공간에 배치한다.
		// 인덱스는 항상 0부터 시작하여 [길이-1] 까지 접근할 수 있다.
		
		// index          0     1     2     3     4
		String[] arr = {"짱구","유리","훈이","철수","맹구"};
		
		// 배열은 항상 같은 자료형들만 넣을 수 있다.

		// arr은 여러 String을 묶어둔 배열이다.
		// arr의 원소의 개수는 몇개인가 == 배열의 길이가 얼마인가?
		System.out.println("arr의 길이 : " + arr.length);
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		arr[4] = "수지";	// 일반 변수와 동일하게 취급하면 된다.
		
		System.out.println();
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		// 배열의 범위를 넘어갈 시 에러
		
		// 배열 : 순번(index)과 값(value)을 1:1 맵핑하여 저장하는 구조
		
		// Map(dict) : (index대신) key와 value를 1:1 맵핑하여 저장하는 구조
	}
}
