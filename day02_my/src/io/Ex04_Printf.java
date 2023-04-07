package io;

public class Ex04_Printf {
	public static void main(String[] args) {
		
		// format을 이용하여 내용을 print 하는 함수
		// 서식을 지정하여 값을 출력한다.
		// System.out.printf(서식, 값...)
		// 첫번째는 문자열로 서식을 지정하고, 그 다음에는 여러값을 콤마로 구분 하여 작성한다.
		
		// printf에서 서식은 %기호로 표시한다.
		// 자주 사용하는 서식문자는 다음과 같다.
		
		// %d : decimal, 정수를 10진수 형태로 표현한다. int를 주로 사용한다.
		// %f : floating, 실수를 표현한다. float 혹은 double 사용가능
		// %c : character, 단일 문자를 표현한다. char에 대해 사용한다.
		// %s : string, 문자열을 표현한다. String에 대해 주로 사용한다.
		//		(모든 자바 객체는 문자열로 나타낼 수 있다.)
		
		String name = "김재원";
		int score = 99;
		char grade = 'A';
		double avg = 4.4;
		
		System.out.printf("%s의 시험성적 : %d\n",name,score);
		System.out.printf("%s의 등급 : %c\n",name, grade);
		System.out.printf("%s의 평균 : %.1f\n",name, avg);
		
		// %f는 주로 소수점 이하자리를 제한하기 위해 %.2f 형식으로 사용한다.(기본값은 6자리)
		// %d는 칸을 맞추거나, 0으로 채우기 위해 %2d, %02d 형식으로 사용한다.
		// %s는 칸을 맞추기도 하지만, 보통 그냥 쓴다.
		
		String res1 = String.format("%s의 시험성적 : %d",name,score);
		String res2 = String.format("%s의 등급 : %c",name, grade);
		String res3 = String.format("%s의 평균 : %.1f",name, avg);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
	}
}
