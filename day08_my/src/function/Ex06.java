package function;

public class Ex06 {
	static int add (int n1, int n2) {
		return n1 + n2;
	}
	
	static double add (double n1, double n2) {
		return n1 + n2;
	}
	static double add (int n1, double n2) {
		return n1 + n2;
	}
	static double add (double n1, int n2) {
		return n1 + n2;
	}
	static int add (int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	// overloading에 영향을 미치는 것은 메소드 이름이 같도 파라미터가 다를떄(갯수, 순서, 타입)
	public static void main(String[] args) {
		System.out.println(add(10, 20));	// add(int, int)
		System.out.println(add(1.5, 20));	// add(double, int)
		System.out.println(add(10, 2.5)); 	// add(int, double)
		System.out.println(add(1.5, 2.4));	// add(double, double)
		System.out.println(add(1, 2, 3));	// add(int, int, int)
	}
}
