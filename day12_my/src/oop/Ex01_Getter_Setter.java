package oop;

import java.util.Arrays;

class Drink {
	private String name;			// 이름은  private이므로 외부에서 접근할 수 없다.
	private int price;
	private String[] nutritions;
	
	public Drink(String name, int price, String[] nutritions) {
		this.name = name;
		this.price = price;
		this.nutritions = nutritions;
	}
	
	
	public String getName() {		// 이름 그대로 필드 값을 반환하는 메서드
		return name;				// 메서드는 클래스 내부에 있어서 접근이 허용된다.
	}								// 메서드는 public이므로 외부에서 호출할 수 있다.
	
	public void setName(String name) {	// 전달받은 이름을 필드에 저장하는 메서드
		this.name = name;				// 메서드는 클래스 내부에 있어서 대입이 허용된다.
	}									// 메서드는 public이므로 외부에서 호출할 수 있다.
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {	// 객체 생성 이후에도 값을 마음대로 바꿀 수 있다.
		this.price = price;
	}
	
	public String[] getNutritions() {
		return nutritions;
	}
	
}

public class Ex01_Getter_Setter {
	public static void main(String[] args) {
		
//		Drink ob1 = new Drink();
//		ob1.name = "코카콜라";
//		ob1.price = 2000;
//		ob1.nutritions = {"열량 : 112kcal","탄수화물 : 28g","당류 : 27g"};
		String[] nutr_coke = {"열량 : 112kcal","탄수화물 : 28g","당류 : 27g"};
		Drink ob1 = new Drink("코카콜라",2000, nutr_coke);
		
		ob1.setName("코카콜라 250ml");
		ob1.setPrice(880);
		
		// setter를 만들지 않았기 때문에, 객체 생성 이후 값을 변경할 수 없게 된다.
//		ob1.setNutritions(nutr_coke);
		
		System.out.println("상품 이름 : "+ ob1.getName());
		System.out.println("상품 가격 : "+ ob1.getPrice());
		System.out.println("상품 영양표 : "+ Arrays.toString(ob1.getNutritions()));
	}
}
