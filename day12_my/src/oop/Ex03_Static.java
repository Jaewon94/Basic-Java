package oop;

class Test1 {
	String name;
	static int countOfEyes = 2;	// static은 기울임꼴로 표현한다.
	
	public String getName() {
		return name;
	}
	
	public static int getCountOfEyes() {
		return countOfEyes;
	}
	
	static void test2() {
		System.out.println(countOfEyes);
		
		// Cannot make a static reference to the non-static field name
//		System.out.println(name);
		
		
		// Cannot make a static reference to the non-static method test3() from the type Test1
//		test3();
		
		// static은 static끼리, non-static은 non-static끼리 참조하기
	}
	
	void test3() {	// 이후 만들어질 객체에 소속
		System.out.println("이건 static이 아닙니다.");
	}
}

public class Ex03_Static {
	public static void main(String[] args) {
		
		// 일반적인 필드는 객체에 소속되기 때문에
		// 객체마다 서로 다른 값을 저장할 수 있다.
		
		// static 속성의 필드는 클래스에 고정된 형태이기 때문에
		// 서로 다른 객체라도 같은 값을 공유하게 된다.
		
		// static 속성의 메서드는 클래스에 고정된 형태이기 때문에
		// 객체를 생성하지 않고, 클래스에서 바로 메서드를 호출할 수 있게 된다.
		
		// static속성의 요소와 non-static 속성의 요소가 있다면
		// 클래스 로드 시점에서 static 요소가 생성되고
		// 객체를 생성해야 non-static 요소가 생성된다.
		// 따라서 static 요소는 non-static을 참조할 수 있으나
		// non-static은 static을 참조할 수 없다.
		
		System.out.println(Test1.countOfEyes); 		// static field 참조
		System.out.println(Test1.getCountOfEyes()); // static method 참조
		
		// non-static요소는 객체를 통해서 접근해야 참조 및 호출할 수 있다.
		// Cannot make a static reference to the non-static field Test1.name
//		System.out.println(Test1.name);
		
		Test1 ob = new Test1();
		System.out.println(ob.name); 		// 객체의 필드
		ob.name ="이지은";
		System.out.println(ob.getName());	// 객체의 메서드
		
		// 객체가 생성되었다면, 클래스는 이미 로드된 상황이므로 객체를 통해서 static요소에 접근가능
		// 그러나 권장되는 방법은 아니다.(static은 static끼리, non-static은 non-static끼리)
		
		// The static field Test1.countOfEyes should be accessed in a static way
		System.out.println(ob.countOfEyes);		// static인데 객체에서 불러와 노란줄
		System.out.println(Test1.countOfEyes);	// 클래스에서 바로 불러오는게 맞는 static활용방법
		
	}
}
