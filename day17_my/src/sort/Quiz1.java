package sort;

import java.util.ArrayList;
import java.util.Scanner;

class Product implements Comparable<Product>{
	// 상품의 이름, 가격, 별점 3개의 항목으로 구성
	private String name;
	private int price;
	private Double star;
	
	public Product(String name, int price, Double star) {
		this.name = name;
		this.price = price;
		this.star = star;
	}
	
	// 객체를 출력하면 이름, 가격, 별점이 한줄에 출력되도록 toString()을 오버라이딩
	@Override
	public String toString() {

		return String.format("상품명 : %s\n가격 : %,d원\n별점 : %s\n", name, price, star);
	}
	// 상품과 다른 상품을 비교하여 정수를 반환하는 함수를 오버라이딩 

	@Override
	public int compareTo(Product o) {

		return this.price - o.price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Double getStar() {
		return star;
	}

	public void setStar(Double star) {
		this.star = star;
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		// 5개의 샘플데이터를 작성하세요
		// 5개의 상품을 ArrayList에 담으세요
		// Scanner와 while switch-case 를 이용하여 목록추력하는 코드를 작성
		// 번호에따라 이름/가격/별점이 각각 오름차순/내림차순으로 정렬하여 출력해야 합니다.
		Scanner sc= new Scanner(System.in);
		int menu;
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product("에어팟 프로", 249000, 4.5));
		list.add(new Product("갤럭시 S21", 1299000, 4.8));
		list.add(new Product("아이폰 13 ", 1799000, 4.6));
		list.add(new Product("LG 그램 16", 199000, 4.4));
		list.add(new Product("서피스 프로 ", 1599000, 4.7));
		
		// 여기서 LOOP는 do - while에 대해 이름을 붙인것 (라벨링)
		LOOP : do {
			System.out.println("1. 이름 오름차순");
			System.out.println("2. 이름 내림차순");
			System.out.println("3. 가격 오름차순");
			System.out.println("4. 가격 내림차순");
			System.out.println("5. 별점 오름차순");
			System.out.println("6. 별점 내림차순");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 >> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
				System.out.println();
				for(Product p : list) {
					System.out.println(p);
				}
				System.out.println();
				break;
			case 2:
				list.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));
				System.out.println();
				for(Product p : list) {
					System.out.println(p);
				}
				System.out.println();
				break;
			case 3:
				// Comparable에 의한 compare 함수에 의해 정렬
				list.sort(null);
				// 다른 방식
//				list.sort((a,b) -> a.getPrice() > b.getPrice() ? 1 : -1);
				System.out.println();
				for(Product p : list) {
					System.out.println(p);
				}
				System.out.println();
				break;
			case 4:
				// Comparator 객체의 기준에 따른 정렬
				list.sort((o1, o2) -> o2.getPrice()-o1.getPrice());
				// 다른 방식
//				list.sort((a,b) -> b.getPrice() > a.getPrice() ? 1 : -1);
				System.out.println();
				for(Product p : list) {
					System.out.println(p);
				}
				System.out.println();
				break;
			case 5:
				list.sort((o1, o2) ->o1.getStar().compareTo(o2.getStar()));
				// 다른 방식 star의 타입이 double(원시) 일 경우
//				list.sort((a,b) -> a.getStar() > b.getStar() ? 1 : -1);
				System.out.println();
				for(Product p : list) {
					System.out.println(p);
				}
				System.out.println();
				break;
			case 6:
				list.sort((o1, o2) ->o2.getStar().compareTo(o1.getStar()));
				// 다른 방식 star의 타입이 double(원시) 일 경우
//				list.sort((a,b) -> b.getStar() > a.getStar() ? 1 : -1);
				System.out.println();
				for(Product p : list) {
					System.out.println(p);
				}
				System.out.println();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break;		// switch문에 대한 break

			default:
				System.out.println("메뉴를 잘못 입력하셨습니다.");
				break LOOP;	// LOOP (do~while)에 대한 break
							// LOOP 라는 이름으로 라벨링을 한것
			}
			
		}while(menu !=0);
		
		sc.close();
	}
}
