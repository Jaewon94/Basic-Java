package day13_my;

// heritage : 유산

class Pos2D {				// 슈퍼 클래스 (부모 클래스, 상위 클래스)
	private int x, y;
	
	public Pos2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void show() {
		System.out.println("x : " + x + ", y : "+y );
	}

	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}

}

class Pos3D extends Pos2D{	// Pos2D의 내용을 상속받아서, 추가 속성과 기능을 작성한 새로운 클래스
							// 서브 클래스 (자식 클래스)
	private int z;	

	public Pos3D(int x, int y, int z) {	// 서브클래스는 슈퍼클래스의 생성자를 반드시 호출해야 한다.
//		this.x = x;
//		this.y = y;
		super(x,y);			// Pos2D(int x, int y)를 호출, 반드시 생성자의 첫번째 줄에서 호출
		this.z = z;
	}
	
	
	@Override		// 물려받은 기능(함수)의 형식은 유지하면서, 내용을 새로 작성한다.
	public void show() {
		System.out.printf("x : %d, y : %d, z : %d",getX(),getY(),z);
	}


	public int getZ() {
		return z;
	}


	
}

public class Ex01 {
	public static void main(String[] args) {
		
		// extends : 기존의 클래스의 내용을 물려받아서 (inheritance)
		//			추가적인 속성과 기능을 만들어서 개념을 확장한 새로운 클래스를 작성한다.
		
		Pos2D ob1 = new Pos2D(3,4);
		ob1.show();
		
		Pos3D ob2 = new Pos3D(2, 3, 5);
		// Pos3D -> Pos2D(x, y) -> Pos3D(z) -> 객체 생성완료
		ob2.show();

	}
}
