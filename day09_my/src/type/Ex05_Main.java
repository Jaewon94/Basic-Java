package type;

import java.util.Scanner;

public class Ex05_Main {
	public static void main(String[] args) {

		// 같은 자료형의 여러 요소를 묶어서 관리하는 구조 : 배열
		Ex05_Student[] arr = new Ex05_Student[5];
		Scanner sc = new Scanner(System.in);

		String name;
		int score, result;
		int menu;
		Ex05_Student st;

		while (true) {
			System.out.println("1. 추가");
			System.out.println("2. 목록");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1: // 추가
				System.out.println("추가할 학생의 이름 입력 : ");
				name = sc.nextLine();
				System.out.printf("%s학생의 점수 입력 : ", name);
				score = Integer.parseInt(sc.nextLine());
				st = new Ex05_Student(); // 새로운 학생 객체를 만들어서
				st.name = name; // 입력받은 이름과
				st.score = score; // 입력받은 점수를 넣어주고

				result = insert(arr, st);
				System.out.println(result == 1 ? "추가 성공" : "추가 실패");
				break;
			case 2:
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null) {
						// System.out.println(arr[i]);
						System.out.printf("%s : %d점\n", arr[i].name, arr[i].score);
					}
				}
				break;
			case 0:
				sc.close();
				break;

			default:
				break;
			}
		}

	}

	static int insert(Ex05_Student[] arr, Ex05_Student st) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = st;
				row = 1;
				break;
			}
		}
		return row;
	}
}
