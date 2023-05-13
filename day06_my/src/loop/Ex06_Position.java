package loop;

public class Ex06_Position {
	public static void main(String[] args) {
		
		// + 모양
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("[%d, %d] ",i,j);
			}
			System.out.println(); // 한 줄의 출력이 끝나면 줄바꿈을 한다.
		}
		System.out.println();
		
		// X 모양
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i == 2 || j ==2) {
					System.out.print("* "); // win + .
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(); // 한 줄의 출력이 끝나면 줄바꿈을 한다.
		}
		System.out.println();
		
		
		// 마름모 모양
		int width =5;
		int height =5;
		int halfOfWidth = width/2;
		int halfOfHeight = height/2;
		
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				if(i == j || i +j == width-1) {
					System.out.print("* "); // win + .
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(); // 한 줄의 출력이 끝나면 줄바꿈을 한다.
		}
		
		
		System.out.println();
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				if(i +j== halfOfWidth || i +j == halfOfWidth +4) {
					System.out.print("* ");
				} else if (Math.abs(i-j) == 2 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(); // 한 줄의 출력이 끝나면 줄바꿈을 한다.
		}
		System.out.println();
		
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				if(Math.abs(i-j) ==2 || i == j && i % 2 !=0) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(); // 한 줄의 출력이 끝나면 줄바꿈을 한다.
		}
		System.out.println();
		
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				if(Math.abs(halfOfWidth -j) + Math.abs(halfOfHeight -i) ==2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(); // 한 줄의 출력이 끝나면 줄바꿈을 한다.
		}
		System.out.println();
	}
}
