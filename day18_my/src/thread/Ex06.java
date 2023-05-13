package thread;

class PrintN extends Object implements Runnable{
	
	@Override
	public void run() {
		for(int i=0; i<=25; i++) {
			System.out.print(i + " ");
		}
	}
}

public class Ex06 {
	public static void main(String[] args) {
		// Thread 는 상속(extends)로 구현된다.
		// 자바는 다중 상속을허용하지 않는다.
		// 만약, 이미 슈퍼클래스를 지정한 서브클래스에 대해 스레드를 구형하고 싶다면?
		// interface Runnable을 사용한다.
		
		// Runnable 인터페이스는 함수형 인터페이스이며
		// 추상메서드 public void run() 을 포함하고 있다.
		
		// Runnable 객체를 Tread의 생성자 매개변수로 전달하면 된다.
		
		PrintN ob = new PrintN();		// Runnable 객체
		Thread th1 = new Thread(ob);	// 생성자 매개변수에 전달
		
		// 익명객체를 써서 1회용 으로 바로 작성도 가능
		Thread th2 = new Thread(()-> {
			for(char ch = 'a' ; ch <= 'z'; ch++) {
				System.out.print(ch + " ");
			}
		});
		
		th1.start();		// 호출은 항상 Thread의 start() 
		th2.start();
		
	}
}
