package day07_my;

public class Quiz2_2 {

	public static void main(String[] args) {
		System.out.println("            3월\n");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		
		int num = -2;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				boolean flag = (1 <= num) && (num <= 31);
				if (flag) {
					System.out.printf("%3d ", num);
				} else {
					System.out.print("    ");
				}
				num++;
			}
			System.out.println();
		}
	}

}
