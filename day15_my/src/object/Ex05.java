package object;

class Student {
	String name;
	int kor, eng, mat;
	int total;
	double avg;
	char grade;
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		total = kor + eng + mat;
		avg = total / 3.0;
		// 생성자에서도 if나 스위치 문 같은 것들을 쓸 수 있음
		switch ((int) avg /10 ) {
			case 10:
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;

			default: grade = 'F'; break;
		}
	}
	
	@Override
	public String toString() {
		
		return String.format("%s (%c 등급)", name, grade);
	}
	
//	정석 방법
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student == false) {
			return false;
		}
		Student target = (Student) obj;
		return this.grade == target.grade;
	}
	
// by 한승록
//	@Override
//	public boolean equals(Object obj) {	// 내가 오버라이딩한 equals
//		
//		return obj.equals(this.grade);	// Object에 정의된 오리지널 equals
	
	//    this  obj					
	// 1) st1   st2					// main에서 호출할 때
	// 2) st2   'A' (st1.grade)		// 오버라이딩에서 좌우를 바꾸면서 한쪽을 점수로 변경
	// 3) 'A'   st2.grade			// 오리지널에서 좌우를 바꾸면서 반대쪽을 점수로 변경
//	}
	
}

public class Ex05 {
	public static void main(String[] args) {
		Student st1 = new Student("이지은", 100, 99, 87);
		Student st2 = new Student("김태연", 95, 89, 94);
		Student st3 = new Student("배수지", 85, 92, 97);
		Student st4 = new Student("유지민", 85, 82, 87);
		
		// 객체를 출력하면 학생의 이름과 등급 (A ~ F)만 출력되도록 toString()을 오버라이딩 하세요
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		
		// 학생과 학생을 equals 메서드로 비교할 때, 등급이 일치하면, true가 반환되도록
		// equals()를 오버라이딩하세요
		System.out.println(st1.equals(st2));
		System.out.println(st2.equals(st3));
		System.out.println(st3.equals(st4));
		
		
	}
}
