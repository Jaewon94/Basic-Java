package quiz2;

import java.util.Random;
import java.util.Scanner;

public class Question implements Runnable{	// 입력받아서 정답인지 확인한다.
											// 타이머를 참조하여, 타이머가 끝났으면 무조건 오답이다.
	
	private int input;
	private int answer ;
	private Scanner sc;
	private QuizTimer timer;
	private boolean complete;
	private Random ran;
	private int n1, n2;
	
	public Question() {
		ran = new Random();
		n1 = ran.nextInt(10) +1;
		n2 = ran.nextInt(10) +1;
		answer = n1 + n2;
	}
	
	public boolean isComplete() {
		return complete;
	}
	
	// run안에다가 main함수 쓴다고 생각하고 내가 원하는 것을 작성
	// 참조할 변수를 메서드를 통해 참조하고 결과를 사용한다.
	@Override
	public void run() {
		sc =new Scanner(System.in);
		System.out.println("다음 수식의 정답을 맞춰보세요");
		System.out.printf("%d + %d = ?\n",n1, n2);
		System.out.print("정답 입력 : ");
		input = Integer.parseInt(sc.nextLine());
		complete = true;
		if (timer.isOver()) {
			System.out.println("오답 (시간 초과)");
		}
		else if(input != answer) {
			System.out.println("오답 (정답 틀림)");
		} else {
			System.out.println("정답");
		}
		sc.close();
	}

	public void setTimer(QuizTimer timer) {
		this.timer = timer;
	}
	
}
