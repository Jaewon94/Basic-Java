package abstractClass;

class Button {
	String text;
	OnClickListener listener;
	
	public Button(String text) {
		this.text = text;
	}
	
	void click() {					// 클릭하면
		if(listener != null) {		// 클릭했을때 리스너가 있으면
			listener.onClick();		// onClick 메서드 실행
		}
		else {
			System.err.printf("%s : 클릭에 연결된 동작(기능, 함수)이 없습니다.\n",text);
		}
	}
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public String toString() {
		return String.format("[%s]", text);
	}
}

abstract class OnClickListener {
	abstract void onClick();
}


// 1) 추상 클래슬를 상속받아서 추상 메서드를 오버라이딩하는 새로운 클래스를 작성한다.
class HelloWorld extends OnClickListener{
	
	@Override
	void onClick() {
		System.out.println("Hello, world !!");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		// 추상클래스를 활용하여 객체를 생성하려면 추상메서드의 미구현 내용을 구현해야 한다.
		// 매번 클래스를 만들어서 상속처리하기에는 번거로울 수 있기 때문에
		// 이름없는 클래스를 즉석에서 만들어서 객체를 생성한다.
		// 이런 형식을 익명 내부 클래스(Anonymous Inner Class/Type) 이라고 한다.
		
		Button btn1 = new Button("Hello");
		
		// 2) 1)에서 만든 클래스를 활용하여 객체를 생성한다.
		HelloWorld listener1 = new HelloWorld();
		
		// 3) 2)에서 생성한 객체를 버튼에 전달한다.(1번만 쓰고 더이상 사용되지 않는 클래스)
		btn1.setOnClickListener(listener1);
		System.out.println(btn1);
		btn1.click();
		
		Button btn2 = new Button("그냥 버튼");
		btn2.click();
		
		// Hello world가 아닌 다른 텍스트를 출력하거나, 다른 기능을 구현하려면
		// 매번 새로운 클래스를 작성하여, OnClickListener를 상속받고, 메서드를 오버라이딩한 이후
		// 객체를 생성하여 버튼에 연결시켜주어야 한다.
		
		
		// btn3, btn4는 즉석에서 바로 클래스를 만듬
		Button btn3 = new Button("JAVA");
		OnClickListener listener3 = new OnClickListener() {
			// 객체를 생성하면서, 즉석에서 함수내용만 지정하면 미구현 내용이 사라지므로, 객체를 생성할 수 있다.
			@Override
			void onClick() {
				System.out.println("자바는 수다스럽다.");
			}
		};
		btn3.setOnClickListener(listener3);
		btn3.click();
		
		
		Button btn4 = new Button("Python");
		btn4.setOnClickListener(new OnClickListener() {
			
			@Override
			void onClick() {
				System.out.println("Life is too short, you need python");
				
			}
		});
		btn4.click();
		
		// 함수의 객체화
		// 자바의 기본단위는 클래스이다. 그래서 자바에서 함수는 변수에 저장할 수 없다.
		// (자바에서 함수는 일급 객체가 아니다.)
		// 함수를 전달하려면 함수를 포함하는 객체를 생성해서 전달해야만 한다.
		// 함수의 내용을 자유롭게 작성하려면, 추상 메서드로 형식을 지정해두어야 한다.
		// 추상메서드로 형식이 지정된 함수를 오버라이딩하여 내용을 작성하고, 그 함수를 포함하는 객체를 전달한다.
	}
}
