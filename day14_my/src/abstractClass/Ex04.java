package abstractClass;


class PC {
	// PC 는 USB타입의 장치를 연결할 수 있다.
	void connect(USB device) {
		device.onConnect();	 // 연결된 장치마다, 연결되었을 때 수행하는 동작이 있다.
	}
	
	// 만약 인터페이스를 사용하지 않았다면... 연결하고 싶은 장치의 개수만큼 함수 오버로딩을 수행해야 한다.
	// void connect(Keyboard device) { ... }
	// void connect(DataCable device) { ... }
	// void connect(ElectricFan device) { ... }
}

interface USB {
	/*public abstract*/void onConnect();
}

class KeyBoard implements USB {

	@Override
	public void onConnect() {
		System.out.println("키보드가 연결되었습니다.");
		
	}
	
}

class DataCable implements USB {

	@Override
	public void onConnect() {
		System.out.println("데이터를 전송할 준비가 되었습니다.");
		
	}
	
}

class ElectricFan implements USB {

	@Override
	public void onConnect() {
		System.out.println("선풍기 충전 중 ...27%");
		
	}
	
}


public class Ex04 {
	public static void main(String[] args) {
		PC pc = new PC();
		
		KeyBoard d1 = new KeyBoard();
		DataCable d2 = new DataCable();
		ElectricFan d3 = new ElectricFan();
		
		USB[] arr = { d1, d2, d3};	// 다형성 
		
		for(int i=0; i<arr.length;i++) {
			pc.connect(arr[i]);
		}
		// 서로 다른 타입의 객체를 하나의 타입으로 묶어줄 수 있다.
		// USB 타입이 되기 위해서는 반드시 추상 메서드를 오버라이딩 해야한다.
		// USB타입이면, onConnect() 함수가 있어서, PC에 connect 했을 때 저마다의 동작이 수행된다.
		
		// 인터페이스가 가지는 추상메서드가 하나만 있다면, 함수형 인터페이스로 분류한다.
		// 함수형 인터페이스는 람다식으로 객체를 생성할 수 있다.
		// 내부 구조는 익명 클래스와 다르다 (사용은 비슷하게 할 수 있다.)
		
		USB mouse = () -> {System.out.println("마우스 연결됨..."); };
		pc.connect(mouse);
		
		// 람다식 : () -> {}
		// () 에는 함수의 매개변수를 넣어준다.
		// -> 는 고정으로 사용한다.
		// {} 에는 함수의 내용을 작성한다.
		// 함수가 하나밖에 없으니, 함수의 이름을 지정할 필요가 없다.
		
		// 만약, 매개변수가 하나라면 ()를 생략할 수 있다.
		// 만약, 함수의 실행내용이 한줄이라면 {}를 생략할 수 있다.
		// 만약, 함수가 특정 타입을 반환하고, 실행내용이 한줄이라면 return을 생략할 수 있다.
		
		// 인터페이스도 넓은 범주에서 보면 추상클래스이므로, 익명클래스 문법을 사용할 수 있다.
		USB mic = new USB() {

			@Override
			public void onConnect() {
				System.out.println("마이크 연결됨...");
			}
		
		};
		pc.connect(mic);
		
	}
}
