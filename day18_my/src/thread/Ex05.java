package thread;

// 별도로 작성하지 않아도, 기본으로 포함된다.
import java.lang.*;		// *은 모든 것이라는 뜻

class PrintNumber extends Thread {

	// 저장 - 우클릭 - source - override/implement methods
	
	@Override
	public void run() {
		for(int i=1; i<=25;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
}

class PrintAlphabet extends Thread {


	@Override
	public void run() {
		for(char i='A'; i<='Z';i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
}
public class Ex05 {
	public static void main(String[] args) {
		// 여러 작업을 동시에 수행하기 위해서 처리하는 클래스 java.lang.Thread
		// 1) 수행할 내용을 public void run() 오버라이딩해서 작성한다.
		// 2) 동시 실행을 위해서는 객체의 start() 메서드로 호출하여 수행한다.
		
		// Super ob = new Sub();
		// Human th2 = new Doctor();
		
		Thread th1 = new PrintNumber();
		Thread th2 = new PrintAlphabet();
		
		th1.run(); // 내용을 작성해도, run() 으로 호출하면 다중 스레드 형식으로 수행되지 않는다.
		th2.run();
		
		th1.start();	// start() 메서드를 쓰면 동시에 작업을 수행한다.
		th2.start();
	}
}
