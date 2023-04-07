package loop;

public class Ex05_LoopInLoop {
	public static void main(String[] args) {
		int num=1;
		for(int i = 0; i < 3;i++) {			// 세로 줄을 결정짓는 요소
			for (int j = 0; j < 4 ;j++) {	// 가로 칸을 결정짓는 요소
				System.out.printf("(%d, %d) : %2d\t",i,j,num);
				num++;
			}
			System.out.println();
		}
		
		System.out.println("끝");
		
		// 중첩된 반복문은 다수의 값을 2개 이상의 기준으로 나누어서 처리하고 싶을때 사용
		// 단독으로 사용하기 보다는, 배열 혹은 컬렉션과 연계항 사용하는 경우가 훨씬 많다.
	}
}
