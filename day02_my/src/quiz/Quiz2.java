package quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 세 과목의 점수를 정수 형태로 입력받고, 이름은 문자열로 입력 받으세요
		 * 그런 다음, 점수의 합계와 평균을 구합니다.
		 * 이때, 평균은 실수형태로 소수점 둘째자리까지 출력할 수 있도록 준비하세요
		 * 
		 * 모든 준비가 끝나면 이름과 합계와 평균만 출력합니다.
		 * 
		 * 추가내용) boolean 타입의 변수를 선언하여, 평균이 60점 이상인지 아닌지 판별하여
		 * 			결과를 출력하세요
		 */
		// 디버깅 시작 : F11
		// 중단점 설정 : Ctrl + Shift + b
		// 다음 코드 실행 : F5(Step into), F6(Step over)
		// 제어문(반복문)에서 값의 변화를 추적하기 위해서 사용할 수 있음
		String name;
		int mat, kor, eng, total;
		double avg;
		boolean isPass;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 >> ");
		name = sc.nextLine();
		
		System.out.print("수학 점수 입력 >> ");	
		mat = Integer.parseInt(sc.nextLine());	// sc.nextLine은 String 타입으로 받아지기에 Integer.parseInt로 Integer타입으로 변환
		
		System.out.print("국어 점수 입력 >> ");
		kor = Integer.parseInt(sc.nextLine());
		
		System.out.print("영어 점수 입력 >> ");
		eng = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		total = mat + kor + eng;
		avg = total / 3.0;			// 3.0(double)타입으로 나누어야 나머지도 나옴
		isPass = avg >= 60;
		System.out.printf("%s님 (합계 : %d, 평균 : %.2f)\n",name, total, avg);
		System.out.println("합격 여부 : " +isPass);
		
		
	}
}
