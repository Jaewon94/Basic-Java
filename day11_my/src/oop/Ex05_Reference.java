package oop;

class Ball {
	// 아무 내용도 작성하지 않음 (그래도 기본 생성자는 만들어 진다.)
	// 그냥 공
}

class Kid {
	String name;
	Ball ball;	// Ball 타입의 객체를 저장할 수 있는 변수 Ball
	
	Kid(String name){		// Kid 타입의 객체를 생성하기 위해서는 문자열 이름이 필요하다.
		this.name = name;	
	}
	
	void setBall(Ball ball) {		// 외부에서 공을 받아서, 내가 가지게 한다.
		this.ball = ball;
	}
	
	
	void throwBall(Kid other) {		// other에게 내 공을 넘기고, 내 손을 비운다.
		other.ball = this.ball;
		this.ball = null;			// 자바에서 대입은 복사연산이므로, 직접 비워야 한다.
	}
	
	boolean hasBall() {				// 객체가 공을 소유하고 있는지 반환한다.
		return ball != null;
	}
}

public class Ex05_Reference {
	public static void main(String[] args) {
		Kid p1 = new Kid("짱구");
		Kid p2 = new Kid("단비");
		
		Ball ball = new Ball();
		
		// 짱구가 공을 하나 주웠습니다.
		p1.setBall(ball);
		System.out.println(p1.name + "가 공을 가지고 있는가? : "+ p1.hasBall());
		System.out.println(p2.name + "가 공을 가지고 있는가? : "+ p2.hasBall());
		System.out.println();
		
		// 짱구가 단비에게 공을 던집니다.
		p1.throwBall(p2);
		System.out.println(p1.name + "가 공을 가지고 있는가? : "+ p1.hasBall());
		System.out.println(p2.name + "가 공을 가지고 있는가? : "+ p2.hasBall());
		System.out.println();
		
		// 단비가 짱구에게 공을 던집니다.
		p2.throwBall(p1);
		System.out.println(p1.name + "가 공을 가지고 있는가? : "+ p1.hasBall());
		System.out.println(p2.name + "가 공을 가지고 있는가? : "+ p2.hasBall());
		System.out.println();
	}
}
