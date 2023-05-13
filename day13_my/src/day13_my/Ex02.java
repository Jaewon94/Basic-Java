package day13_my;

class Human {					// 사람
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
		// 0) 서브클래스의 생성자는 슈퍼클래스의 생성자를 반드시 호출해야한다.
		// 1) 생성자를 직접 작성하지 않으면, 기본생성자를 만들어준다.
		// 2) 매개변수를 받는 생성자를 작성하면 기본 생성자가 사라진다.
		// 3) 슈퍼 클래스의 생성자 모양에 맞데 서브클래스에서 직접 호출하도록 설정해야 한다.
	}
	
	public void show() {
		System.out.printf("이름은 %s이고, 나이는 %d살입니다.\n",name, age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

class Doctor extends Human{
	private String major;
	public Doctor(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	public void show() {
		System.out.printf("%s 의사 %s이고, 나이는 %d살입니다.\n",major,getName(), getAge());
	}
	
	public void heal(Human target) {
		System.out.println(target.getName() + "환자를 치료합니다.");
	}
}
class Student extends Human{
	private int score;
	public Student(String name, int age, int score) {
		super(name, age);
		this.score =score;
	}
	
	public void show() {
		System.out.printf("학생 %s이고, 나이는 %d살, 점수는 %d점입니다.\n",getName(), getAge(),score);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		// 상속관계를 나타내기 위한 두 클래스는 개념적으로 포함관계에 있어야 한다.
		// 구조적인 포함관계가 아님을 주의
		// 1) 의사는 사람이다.(O)	의사는 사람 카테고리에 포함된다.
		// 2) 타이어는 자동차다.(X) 타이어는 구조적으로 자동차 부품에 포함되나, 그 자체가 자동차는 아니다.
		
		// 서브 클래스의 객체는 슈퍼클래스의 다른 서브클래스로 대체될 수 있어야 한다.
		// 의사는 사람에 해당하는 다른 클래스의 인스턴스로 대체될 수 있어야 한다.
		
		// 옆집 의사선생님 -> 옆집 학생
		// 우리집 자동차를 타고 이동한다. -> 우리집 타이어를 타고 이동한다(?)
		
		// 의사도 사람이고, 학생도 사람이므로, 의사 객체와 학생객체는 사람 클래스로 처리할 수 있다.
		// 서브 클래스의 객체를 슈퍼클래스 타입으로 형 변환 할 수 있다.
		// 슈퍼클래스의 변수로 서브클래스의 객체를 저장할 수 있다.
		
		// 만약, 각 서브 클래스에서 오버라이딩된 메서드가 있다면
		// 타입을 슈퍼클래스로 참조하고 있더라도, 서브클래스의 오버라이딩 메서드가 호출된다.
		
		Doctor p1 = new Doctor("김사부", 42, "흉부외과");
		p1.show();	// 슈퍼 클래스의 메서드를 상속받은 후, 형식을 유지하면서 내용을 재정의한 오버라이딩 메서드
		
		Student p2 = new Student("김학생", 15, 85);
		p2.show(); // 물려받은 내용을 덮어쓴 타입으로 참조할 수 있다.
		
		// 서브 클래스 객체는 슈퍼 클래스 타입으로 참조할 수 있다.
		
		Human ref1 = p1;	// 의사는 사람이다.
		Human ref2 = p2;	// 학생은 사람이다.
		
		p1.heal(p2);
//		ref1.heal();	// 의사 행세를 하고 있을때만 치료행위를 할 수 있다.
		ref1.show();    // 사람은 자기소개가 가능하고, 의사가 평소 하던 식 대로 자기소개를 한다.
						// 오버라이딩을 했다면 덮어씌워졌기에 서브클래스의 메서드 내용이 나온다.
	}
}
