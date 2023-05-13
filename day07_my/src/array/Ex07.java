package array;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		// 자바 배열의 특징
		
		// 1) 배열은  Reference Type이며, 배열을 생성하는 방식이 몇개 있다.
		// 값을 지정하여 생성하기
		int[] arr1 = { 3, 4, 5,6,1};
		
		// 길이를 지정하여 빈칸으로 생성하기
		// 이때, 빈칸은 자료형에서 0에 해당하는 값으로 자동으로  지정된다.
		int[] arr2 = new int[5];
		
		// 값을 지정하거나, 길이를 지정하거나 둘 중 하나만 해야한다.
//		int[] arr3 = new int[5] { 3, 4, 5,6,1};  (X)
		
		System.out.println();
		
		// 2) 배열은 참조 변수이기 때문에, 직접 출력하면 정상적으로 나타나지 않는다.
		System.out.println(arr1);
		
		// 2-1) 반복문으로 출력
		System.out.print("arr1 : [");
		for(int i =0; i< arr1.length;i++) {
			System.out.print(arr1[i] + " ");
			System.out.print(i == arr1.length -1 ? "]\n" : ", ");
		} 
		System.out.println();
		
		// 2-2) Arrays.toString(arr) 으로 출력하기
		
		System.out.println("arr2 : "+Arrays.toString(arr2));
		
		
		// 3) 배열의 원소는 초기화하지 않으면 자료형에 맞는 0값으로 초기화된다.
		boolean[] arr3 = new boolean[5];
		// 배열을 가리킬수 있는(boolean[]) 변수 (arr3) 가 배열을 가리키고 있다.(new boolean[5])
		System.out.println("arr3 : "+ Arrays.toString(arr3));
		
		double[] arr4 = new double[5];
		System.out.println("arr4 : "+ Arrays.toString(arr4));
		
		String[] arr5 = new String[5];
		System.out.println("arr5 : "+ Arrays.toString(arr5));
		
		// 4) 만약, 배열의 원소가 null이라면 .연산을 수행할 수 없다.
		// NullPointerException
		
		arr5[0] = "짱구";
		arr5[1] = "유리";
		arr5[2] = "수지";
		
		System.out.println("arr5 : "+ Arrays.toString(arr5));
		// 이때 arr5배열의 각 글자와 길이 수를 출력하세요
		for(int i=0; i< arr5.length;i++) {
			System.out.printf("%s, %d\n",arr5[i],arr5[i].length());
		}
		// 값이 없는데 길이값을 가져오라 해서 에러가 남
		
	}
}
