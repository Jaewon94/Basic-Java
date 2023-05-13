package day07_my;

public class GuguClass {
	public static void main(String[] args) {
		
		// for문은 코드를 자동으로 복붙해주는 기능이다.
/*			
		int n1 = 3, n2 =1;
	
  		System.out.printf("%d X %d = %2d\n",n1,n2,n1*n2++);
		System.out.printf("%d X %d = %2d\n",n1,n2,n1*n2++);
		System.out.printf("%d X %d = %2d\n",n1,n2,n1*n2++);
		System.out.printf("%d X %d = %2d\n",n1,n2,n1*n2++);
		System.out.printf("%d X %d = %2d\n",n1,n2,n1*n2++);
		System.out.printf("%d X %d = %2d\n",n1,n2,n1*n2++);
		System.out.printf("%d X %d = %2d\n",n1,n2,n1*n2++);
		System.out.printf("%d X %d = %2d\n",n1,n2,n1*n2++);
		System.out.printf("%d X %d = %2d\n",n1,n2,n1*n2++);
		System.out.println();
*/		
		
		System.out.println("===구구단===");
		// 전체 구구단 출력하기
		// 2단부터 9단까지 각 단은 한줄 띄워서 구분
		
		// 단 마다 곱하는 수를 반복하여 수식을 출력한다.
		for(int i=2; i < 10; i++ ) {	// 단
			System.out.printf("%d단\n",i);
			for (int j=1; j<10;j++) {	// 곱하는 수
				System.out.printf("%d X %d = %2d\n",i,j,i*j);
			}
			System.out.println();
		}
	}
	
}
