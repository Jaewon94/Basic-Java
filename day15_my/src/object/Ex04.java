package object;

class Kid /* extends Object*/ {
	String name;
	int age;
	
	public Kid(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	
	// Object에 있는 메서드 이름 쓰고 Ctrl + space bar 누르면 
	// 자동완성으로 오버라이딩 할 수 있는게 나옴
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s : %d살", name, age);
	}
	

}

public class Ex04 {
	public static void main(String[] args) {
		Kid ob1 = new Kid("짱구",5);
		Kid ob2 = new Kid("유리",6);
		
		System.out.println(ob1);
		System.out.println(ob2);
		
		
	}
}
