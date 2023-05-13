package day13_my;

import java.util.Random;

class Airplane {	// 비행기
	// 사람을 태울 수 있는 좌석 5개가 있습니다.
	Human[] seat = new Human[5];
	
	public boolean entrance(Human ob) {	// 메인에서 어떤 타입이든,Human의 서브클래스라면 Human으로 취급
										// 의사이든, 학생이든 모두 일반적인 '사람'으로 취급
										// 업캐스팅은 자연스럽게 이루어짐
										// 서로다른 타입의 객체를 같은 타입으로 묶어서 관리하기 위해(편리함)
										// 업캐스팅하면 고유 기능(서브클래스의 메서드)를 사용할 수 없음
											// 오버라이딩 된 메서드는 제외
										// 고유기능을 사용하려면 다운 캐스팅 해야함
		for(int i=0;i<seat.length;i++) {
			if(seat[i] == null) {
				seat[i] = ob;
				System.out.println(ob.getName() +" 탑승했습니다!!");
				return true;
			}
		}
		System.out.println(ob.getName()+" 자리가 없는데 어떻게 타요?!");
		return false;
	}
	
	public void emergency() {
		Random ran = new Random();
		int idx = ran.nextInt(seat.length);
		Human target = seat[idx];
		System.out.println(target.getName() + " : 배가 아파요");
		
//		Doctor doctor = seat[0];		// 모든 사람이 의사는 아니기때문에 안됨
		// 업캐스팅(서브클래스를 슈퍼클래스로 형변환)된 상태에서는 Human으로 취급하고
		// Human에는 heal()메서드가 없다. heal()은 Doctor의 고유기능(메서드)이다.
		
		// 탑승객 중의 각 사람이 의사인지 아닌지 판별하는 과정이 추가로 필요하다.
		Doctor doctor = null;
		for(int i=0; i<seat.length;i++) {
			Human cursor = seat[i];
			if(cursor instanceof Doctor) {	// 현재 바라보는 객체가 Doctor의 인스턴스인가?
				doctor = (Doctor) cursor;	// 다운 캐스팅 (강제 형변환)
				break;
				
			}
		}
		System.out.println("의사의 이름은 "+doctor.getName()+"입니다.");
		doctor.heal(target);
	}
	
	
	// 비행기 탑승객 끼리 자기소개 합니다.
	// 오버라이딩 메서드는 다운 캐스팅을 하지 않아도 호출할 수 있다.
	// 오버라이딩 메서드는 
	public void introduce() {
		for(int i=0;i<seat.length;i++) {
			Human cursor =seat[i];
			cursor.show();
		}
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		
		// jdk8 api 문서
		
		Doctor p1= new Doctor("정경호",42,"흉부외과");
		
		Student p2= new Student("우수한", 18, 92);
		Student p3= new Student("박영재", 19,100);
		
		Human p4 = new Human("원종래",20);
		Human p5 = new Human("톰쿠르즈",60);
		Human p6 = new Human("조세호", 37);
		
		Airplane airplane = new Airplane();
		
		
	
		airplane.entrance(p1);		// 함수를 호출하면서 매개변수의 타입이 Doctor -> Human으로 바뀐다.
		airplane.entrance(p2);		// 함수를 호출하면서 매개변수의 타입이 Student -> Human으로 바뀐다.
		airplane.entrance(p3);
		airplane.entrance(p4);
		airplane.entrance(p5);
		airplane.entrance(p6);
		System.out.println();
		
		airplane.introduce();
		
		airplane.emergency();
		
		// 자바 객체지향의 4가지 특성
		
		// 1) 캡슐화 : 서로다른 변수와 함수를 묶어서 하나의 객체로 나타낼 수 있다.
		// 2) 상속 : 기존 클래스를 활용하여 새로운 클래스를 만들어 낼 수 있다.
		// 3) 추상화 : 코드상의 객체는 실제 사물/개념의 필요한 요소만 뽑아서 만들어낸다.
		// 4) 다형성 : 하나의 객체는 여러가지 타입으로 참조될 수 있다.
		
		// 오버라이딩 : 상속받은 메서드의 내용을 재정의 하는것
		// 상속받았다는 것은, 슈퍼클래스에 이미 정의가 되어있다는 것이다.
		// 따라서, 업캐스팅되어도 호출할 수 있다.
		// 다만, 호출되었을 때 실행되는 내용은 덮어씌운 내용으로 실행된다.
		
		// 이와달리, 서브클래스만의 고유 메서드는 다운캐스팅을 해야 호출할 수 있다.
		
		
	
	}
}
