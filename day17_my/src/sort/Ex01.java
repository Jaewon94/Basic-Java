package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		// 정수의 정렬
		
		Integer[] arr = {4, 8, 2, 7, 6};
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(list);
		
		
		// sort를 ctrl + click 했을 때 소스코드가 나타나지 않는다면
		// attach source : C:\Program files\java\jdk-1.8.0_***\src.zip
		
		// sort는  public void sort(Comparator<? super E> c){...}으로 되어있다.
		list.sort(null);
		System.out.println(list);
		System.out.println();
		
		// list타입의 정렬에 관여하는 두가지 인터페이스
		// 1) Comparable : 제네릭 타입의 클래스가 Comparable하다면 자체적으로 정렬규칙이 있다.
		// 2) Comparator : 제네릭 타입의 클래스가 Comparable하지 않을때 사용하거나, 별도의 규칙을 지정할 수 있다.
		
		
		// 문자열의 정렬 
		
		String[] arr2 = {"python","c","java","php","asp"};
		
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(arr2));
		System.out.println(list2);
		
		list2.sort(null);
		System.out.println(list2);
		System.out.println();
	}
}
