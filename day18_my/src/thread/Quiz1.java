package thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Timer implements Runnable {
	public boolean isOver;

	@Override
	public void run() {		// Override는 메서드 형식을 변경할 수 없어서, throws를 사용할 수 없다.
		for (int i = 10; i >= 0; i--) {
			System.err.printf("[%d초]\n", i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			} 
			
		}
		isOver = true;
	}

	public boolean isOver() {
		return isOver;
	}

}

public class Quiz1 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		// 실행 후 10초간 타이머를 진행하면서, 10초동안 입력받은 문자열을 모두 list에 저장합니다.
		// 개수에는 제한이 없습니다.
		// 10초가 끝나면, list에 담아둔 문자열을 차례대로 출력하면 됩니다.
		// 시간을 체크하면서, 입력도 받아야 한다.

		Timer timer = new Timer();

		Thread t1 = new Thread(timer);


		t1.start();
//		내가 만든 코드
//		이러면 시간 차이가 조금 나버림
//		int time = 10;
//		String st;
//		while (true) {
//			try {
//				Thread.sleep(1000);
//				System.out.print("문자열 입력 : ");
//				st = sc.nextLine();
//				list.add(st);
//				time--;
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			if (time == 0) {
//				break;
//			}
//		}

		
//      모범 답안 여기서 isOver()은 직접 만든 것, 할 줄 알아야 함
//		while (timer.isOver() == false) { // 타이머가 끝나지 않았다면 반복을 수행한다.
//			System.out.println("문자열 입력 : ");
//			list.add(sc.nextLine()); // 문자열을 입력받아서, 리스트에 추가한다.
//		}
		
//      isAlive()메서드는 기본적으로 제공하는 메서드
		while(t1.isAlive()) {
			System.out.println("문자열 입력 : ");
			list.add(sc.nextLine());
		}

		if (list != null) {
			System.out.println(list);
		}

//		System.out.print("단어 입력 : ");
//		st = sc.nextLine();
//		
//		list.add(st);
//		

		sc.close();
	}
}
