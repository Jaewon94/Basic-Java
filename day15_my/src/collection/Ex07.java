package collection;

import java.util.ArrayList;

public class Ex07 {
	public static void main(String[] args) {

		ArrayList t1 = new ArrayList();
		// Collection에는 모든 타입의 객체(=Object)를 저장하여 관리할 수 있다.

		// 제네릭 안했을 경우 경고 메세지
		// ArrayList is a raw type. References to generic type ArrayList<E> should be
		// parameterized
		// = ArrayList<Object> t1 = new ArrayList<Object>();

		Product p1 = new Product("아이스 아메리카노", 2000);
		Product p2 = new Product("디카페인 아메리카노", 2500);
		Product p3 = new Product("헤이즐넛 아메리카노", 2500);
		Product p4 = new Product("콜드브루 라떼", 4000);
		Product p5 = new Product("콜드브루 돌체라떼", 4500);

		t1.add(p1); // Object로 업캐스팅이 된 상태
		t1.add(p2);
		t1.add(p3);
		t1.add(p4);
		t1.add(p5);

		for (int i = 0; i < t1.size(); i++) {
			Product p = (Product) t1.get(i); // Object를 Product로 다운캐스팅
			System.out.printf("%s : %,d원\n", p.getName(), p.getPrice());
		}
		System.out.println();

		// Product타입의 객체만 저장할 수 있는 ArrayList t2
		ArrayList<Product> t2 = new ArrayList<Product>();

		t2.add(p1);
		t2.add(p2);
		t2.add(p3);
		t2.add(p4);
		t2.add(p5);
		// t2.add("hello");
		// 제네릭 타입을 지정하면, 해당 타입의 객체만 추가할 수 있다.
		// The method add(Product) in the type ArrayList<Product> is not applicable for the arguments (String)

		for (int i = 0; i < t2.size(); i++) {
			Product p = t2.get(i); // Object를 Product로 다운캐스팅
			System.out.printf("%s : %,d원\n", p.getName(), p.getPrice());
		}
		System.out.println();
		for (Product p : t2) { // t2안에있는 각각의 객체를 p에 담아서, 반복문을 실행한다.
			System.out.printf("%s : %,d원\n", p.getName(), p.getPrice());
		}
		System.out.println();
		
		Product[] arr = {p1, p2, p3, p4, p5};
		for (Product p : arr) { // arr안에있는 각각의 객체를 p에 담아서, 반복문을 실행한다.
			System.out.printf("%s : %,d원\n", p.getName(), p.getPrice());
		}
		System.out.println();
	}

}
