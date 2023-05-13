package array;

public class Ex05_Array {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 여러 데이터를 묶어서 연속된 메모리공간에서 관리하는 형식
		// 배열도 자료형으로 취급한다.
		
		// 배열은 Reference Type이다.
		
		// 5개의 변수를 반복문으로 한번에 출력 가능한가 ? (X)
		// 아래 변수들은 메모리상에서 랜덤한 장소에 저장됨
		int n1=20, n2 = 23, n3 =3, n4=17,n5=12;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println();
		
		// index (목차, 순번) : 컴퓨터는 0부터 시작
		//			 0    1  2   3   4
		int[] arr = {20, 23, 3, 17, 12};
		System.out.println(arr[0]);	// 배열에 속한 개별값은 일반 변수와 동일하게 취급
		System.out.println(arr[1]);	// 원소, 요소(element)
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		
		for (int i=0;i<arr.length;i++) {	// 5는 배열의 길이
			System.out.print(arr[i]+" ");	// arr.length는 배열의 길이
		}
		System.out.println();
		
	}
}
