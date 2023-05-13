package function;

public class Ex07 {
	
	static double getCircleSize(int radius) {
		// 인자를 int로 전달받으면 double로 바꾼 다음 같은 내용을 수행하도록 한다.
		return getCircleSize((double)radius);
	}
	static double getCircleSize(double radius) {
		double pi = 3.14;
		double answer = 0;
		answer =  radius * radius * pi;
		return answer;
	}
	
	public static void main(String[] args) {
		// 원의 반지름을 전달받아서 원의 넓이를 구하는 함수
		
		System.out.println(getCircleSize(3));
		
		System.out.println(getCircleSize(3.5));
	}
}
