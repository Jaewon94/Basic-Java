package abstractClass;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Ex05 {
	public static void main(String[] args) {
		
		// ArrayList를 정렬하는 람다식
		
		Random ran = new Random();
		Integer[] arr = new Integer[10];
		
		for(int i =0; i<arr.length;i++) {
				arr[i] = ran.nextInt(arr.length * 10);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(list);
		
		Comparator<Integer> comp = (Integer a, Integer b) -> a - b;
		
		list.sort(comp);
		
		System.out.println(list);
		
	}
}
