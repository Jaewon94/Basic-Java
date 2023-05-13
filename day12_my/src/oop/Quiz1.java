package oop;

class Human{
	// 이름을 저장할 필드가 필요하다(객체마다 다른 값이므로, non-static)
	private String name;

	// 생성된 객체의 개수를 공유 할 수 있는 필드가 필요하다.(클래스에 소속시키기위해 static)
	private static int cnt =0;
	
	// 생성자에서 이름을 전달받아서 필드에 저장해야 한다.
	public Human(String name) {
		this.name = name;
		// 객체를 생성할때 마다, cnt의 값을 1 증가시킨다.
		cnt++;
	}
	
	// private 필드 name의 getter를 작성한다.
	public String getName() {
		return name;
	}
	
	// private 필드 name의 setter를 작성한다.
	public void setName(String name) {
		this.name = name;
	}

	// private 필드인 cnt의 값을 불러오기 위한 getter
	public static int getCnt() {
		return cnt;
	}

	
	
}

public class Quiz1 {
	public static void main(String[] args) {
		
		// 다음 메인함수 코드가 실행될 수 있도록 클래스를 구성하세요
		
		System.out.println("전체 Human 객체의 개수 "+Human.getCnt()); 	// 전체 Human 객체의 개수가 출력되도록 해주세요(0)
		Human ob1 = new Human("김용민");
		Human ob2 = new Human("한승록");
		
		System.out.println("전체 Human 객체의 개수 "+Human.getCnt());   // 전체 Human 객체의 개수가 출력되도록 해주세요(2)
		
		Human ob3 = new Human("유정형");
		
		System.out.println("전체 Human 객체의 개수 "+Human.getCnt());   // 전체 Human 객체의 개수가 출력되도록 해주세요(3)
		
		
		// ob1, ob2, ob3 에서 전체 인원수에 접근하여 출력해보세요
		System.out.println(ob1.getCnt());
		System.out.println(ob2.getCnt());
		System.out.println(ob3.getCnt());
	}
}
