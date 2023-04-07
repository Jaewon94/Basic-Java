package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ex08 {
	public static void main(String[] args) {
		
		Integer[] arr = {4, 8, 2, 7, 6};
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		
		Comparator<Integer> comp = (a, b) ->{return a-b;};
		
		list.sort(comp);
		
		System.out.println(list);
		
		// comp1 과 comp2는 같은 결과를 내는 코드
		Comparator<Integer> comp2 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		};
		list.sort(comp2);
		System.out.println(list);
	}
}
