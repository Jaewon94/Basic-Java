package array;

import java.util.Arrays;

public class Quiz3 {
	public static void main(String[] args) {
		
		// 정수형 배열 arr1을 생성하고 12, 91, 52, 34, 76, 29, 82 를 넣어주세요
		
		int[] arr1 = {12, 91, 52, 34, 76, 29, 82};
		System.out.println("초기 arr1 : " + Arrays.toString(arr1));
		// arr1의 홀수번째 index에 들어간 숫자의 합을 구하여 출력하세요
		int oddSum=0;
		
		for(int i=0; i<arr1.length; i++) {
			if (i %2 !=0) {
//				System.out.print("oddSum : "+ oddSum);
//				System.out.printf("arr1[%d] : %d\n",i,arr1[i]);
				oddSum += arr1[i];
			}
		}
		
		System.out.println("홀수번째 인덱스 들의 합 : "+ oddSum);
		// arr1의 짝수번째 index에 들어간 숫자에 10을 더하세요
		for(int i=0; i<arr1.length;i++) {
			if (i% 2== 0) {
				arr1[i] += 10;
			}
		}
		
		
		// arr1과 길이가 같은 배열 arr2를 새로 생성하세요
		int length = arr1.length;
		int[] arr2 = new int[length];
		
		// arr1에 담긴 값들을 역순으로 arr2에 담아주세요
		int j=0;
		for(int i= length-1; i >= 0;i--) {
			arr2[i] = arr1[j];
			j++;
		}
		
		
		// arr1과 arr2를 각각 한줄에 출력하세요
		System.out.println("arr1 : "+ Arrays.toString(arr1));
		System.out.println("arr2 : "+ Arrays.toString(arr2));
	}
}
