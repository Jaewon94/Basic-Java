package day07_my;

public class Ex04 {
	public static void main(String[] args) {
		
		// 구구단 2단에서 5단까지
		for (int i=2 ; i<6;i++) {		// 세로
			for(int j=1; j<10;j++) {	// 가로
				System.out.printf("%d X %d = %2d ",i,j,i*j);
			}
			System.out.println();
		}
		System.out.println();
		
		// 4개의 단을 가로로 배치하고 싶다면
		
		for (int i=1 ; i<10;i++) {		// 가로
			for(int j=2; j<6;j++) {		// 세로
				System.out.printf("%d X %d = %2d  ",j,i,i*j);
			}
			System.out.println();
		}
	}
}
