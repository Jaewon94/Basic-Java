package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		// Set : 리스트와 달리, 순번이 없고 값의 중복을 허용하지 않는다.
		
		// List나 Set의 생성자에 컬렉션을 전달하여, 기존 구성요소로 새로운 컬렉션을 만들 수 있다.
		
		// 1) 배열을 생성하여 리스트
		Integer[] arr = {4,8,2,7,6,5,7,3,8};
		List<Integer> list = Arrays.asList(arr);
		
//		list.add(10);	// ArrayList가 아닌, java.util.List는 add가 정상적으로 구현되어 있지 않다.
		System.out.println(list);
		
		// 2) List -> ArrayList
		// 기존 list를 ArrayList의 생성자에 전달하면, 기존 숫자를 이용하여 새로운 ArrayList를 구성한다.
		ArrayList<Integer> al = new ArrayList<Integer>(list);
		al.add(10);
		System.out.println(al);
		
		// 3) ArrayList -> Set (HashSet)
		HashSet<Integer> hs = new HashSet<Integer>(al);
		System.out.println(hs);
		
		// list에서는 순번(index)이 있기 때문에 get함수에서 i를 지정하여 특정 값만 불러올 수 있다.
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		// set에서는 순번(index)이 없기 때문에, get함수를 호출할 수 없다.
		// set은 순서대로 저장하는 것이 아니라, 집합처럼 포함되어 있다. 없다로만 저장
//		System.out.println(hs.get(0));
//		System.out.println(hs.get(1));
		hs.add(2);
		hs.add(3);
		hs.add(10);
		hs.add(10);
		System.out.println(hs);
		// set은 중복이 있으면 안들어감
		
		// index가 있으면, 반복문에서 index에 따라서 값을 출력할 수 있다.
		// index가 없다면?
		for(Integer num : hs) {		// index를 사용하지 않는 향상된 for문으로 접근하여 출력
			System.out.println(num + " ");
		}
		System.out.println();
		// index가 없어 get이 안될 뿐 add()나 size() 메소드는 사용가능
		System.out.println("hs의 크기 : "+hs.size());
	}
}
