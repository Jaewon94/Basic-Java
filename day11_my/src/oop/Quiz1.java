package oop;

class Student2{
	// 학생의 이름과 
	// 국어, 영어, 수학 성적
	// 합계점수와 평균점수를 저장하기 위한 필드를 작성합니다.
	String name;
	int kor, eng, mat, sum;
	double avg;

	// 학생 객체를 생성하기 위한 생성자를 작성합니다.
	// 단, 학생 객체는 이름과 세 과목의 점수를 반드시 입력해야만 생성할 수 있으며
	// 합계와 평규은 전달받지 않고, 생성자에서 계산하여 필드의 값을 채워야 합니다.
	Student2(String name, int kor, int eng, int mat){
		// 멤버필드와 지역변수의 이름이 겹칠때
		// 그냥 쓰면 지역변수 (가까운 것부터 참조하기 때문)
		// this.을 붙이면 멤버필드 (this는 객체 자신을 가리키기 때문)
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum = kor + eng + mat;	// 멤버필드임을 강조하고 싶다면, this를 붙여도 된다.
		avg = sum / 3.0;
	}
	
	
	// 이름과 합계, 평균을 출력하는 메서드를 작성합니다.
	void show() {
		
		System.out.printf("%s 학생 (합계 : %d, 평균 : %.2f)\n",name, sum, avg);
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		// 서로 다른 두 학생 객체를 만들어서 성적을 출력하세요
		
		Student2 s1 = new Student2("홍길동", 30, 45, 70);
		Student2 s2 = new Student2("김또깡", 80, 76, 39);
		
		s1.show();
		s2.show();
	}
}
