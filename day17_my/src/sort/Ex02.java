package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Coffee implements Comparable<Coffee>{
	String name;
	int price;
	
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {

		return String.format("%s : %,d", name, price);
	}

	@Override
	public int compareTo(Coffee o) {
		
		return this.price - o.price;
	}
	
	
	
}

public class Ex02 {
	public static void main(String[] args) {
		Coffee ob1 = new Coffee("아메리카노", 2000);
		Coffee ob2 = new Coffee("디카페인 아메리카노", 2300);
		Coffee ob3 = new Coffee("헤이즐넛 아메리카노", 2500);
		Coffee ob4 = new Coffee("콜드브루 라떼", 4000);
		Coffee ob5 = new Coffee("콜드브루 돌체라떼", 4500);

		Coffee[] arr = {ob4, ob1, ob3, ob5,ob2};
		
		ArrayList<Coffee> list = new ArrayList<Coffee>(Arrays.asList(arr));
		
		list.forEach(c -> System.out.println(c));
		System.out.println();
		
		list.sort(null);	// Comparator는 전달하지 않았음
							// compareTo를 오버라이딩 했기 때문에
		
		list.forEach(c -> System.out.println(c));
		System.out.println();
		
		// Comparable에서 지정한 방식이 아닌, 다른 형태로 정렬을 수행하려면 Comparator를 쓴다.
		// 1) 익명객체 사용
		Comparator<Coffee> comp = new Comparator<Coffee>() {
			@Override
			public int compare(Coffee o1, Coffee o2) {
				
				return o1.name.compareTo(o2.name);
			}
		};
		
		list.sort(comp);	// comp는 이름 기준으로 오름차순 정렬의 규칙이다.
		list.forEach(c -> System.out.println(c));
		System.out.println();
		
		// 2) 람다식
		Comparator<Coffee> comp2 = (o1, o2) -> o2.name.compareTo(o1.name);
		list.sort(comp2);	// comp는 이름 기준으로 내림차순 정렬의 규칙이다.
		list.forEach(c -> System.out.println(c));
		System.out.println();
		
		// 더 짧게 쓰는 방법
		// 가격기준 내림차순 정렬 (람다식으로 작성)
		// 3) 변수를 안쓰고 바로 람다식
		list.sort((o1,o2) -> o2.price -o1.price);
		list.forEach(c -> System.out.println(c));
		System.out.println();
		
	}
}
