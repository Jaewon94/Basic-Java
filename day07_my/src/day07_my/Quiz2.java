package day07_my;

public class Quiz2 {
	public static void main(String[] args) {
		// 2023년 3월의 달력을 이중 for문으로 표현하세요
		// 단, 요일은 [일, 월, 화, 수, 목, 금, 토]의 순서로 출력해야 하고
		// 3월 1일부터 31일 까지 있습니다.
		// 범위에 포함되지 않는 칸은 빈칸으로 두어야 됩니다.
		// 3월 1일은 수요일 입니다.
		
		
		int week = 7;
		int month = 42/week;
		int day =1;
		
		System.out.println("            3월\n");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		for (int i = 0; i < month; i++) {
			for (int j=0; j<week;j++) {
				if (i == 0 && j <3) {
					System.out.print("    ");
				}else {
					if (day <32){
						System.out.printf(" %2d ",day);	
						day++;
					}
				}
			}
			System.out.println();
		}
		
		
		
		
	}
}
