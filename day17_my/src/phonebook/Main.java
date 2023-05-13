package phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	// 클래스 대신 HashMap을 이용하여 개별 데이터를 저장하고
	// 여러 HashMap을 list에 저장하여 관리하는 프로그램
	// 필요한 기능은 추가/전체목록/삭제

	static ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> data = new HashMap<String, String>();
		int menu, result;
		String name, pnum;
		do {
			System.out.println("1. 추가");
			System.out.println("2. 목록");
			System.out.println("3. 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				System.out.print("이름 입력 : ");
				name = sc.nextLine();
				System.out.print("번호 입력 : ");
				pnum = sc.nextLine();

				// name과 pnum을 이용하여 데이터를 생성하고, 생성된 데이터를 리스트에 추가한다.
				data = makeData(name, pnum);
				result = add(data);

				if (result == 1) {
					System.out.println("list에 전화번호를 추가 하였습니다.");
				} else {
					System.err.println("list에 전화번호를 추가를 실패 하였습니다.");
				}
				break;
			case 2:

				if (list.isEmpty()) {
					System.out.println("list에 아무도 저장되어 있지 않습니다.");
				} else {
					for (HashMap<String, String> m : list) {
						System.out.println(toString(m));
					}
					
					// 람다식
//					list.forEach(o -> System.out.println(toString(o)));
				}
				break;
			case 3:
				System.out.print("이름 입력 : ");
				name = sc.nextLine();

				data.put("name", name);

				result = delete(name);
				if (result == 1) {
					System.out.printf("%s의 번호를 삭제 하였습니다.\n", data.get("name"));
				} else {
					System.err.printf("%s의 번호의 삭제에 실패 하였습니다.\n", data.get("name"));
				}
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break;

			// 더미 데이터
			case 1234:
				System.out.println("더미 데이터 추가");
				add(makeData("이지은", "010-1111-1111"));
				add(makeData("홍진호", "010-2222-2222"));
				add(makeData("남도일", "010-3333-3333"));
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		} while (menu != 0);
		sc.close();
	}

	static int add(HashMap<String, String> data) {
		boolean flag = list.add(data);
		return flag ? 1 : 0;
	}

	static HashMap<String, String> makeData(String name, String pnum) {
		HashMap<String, String> data = new HashMap<String, String>();

		data.put("name", name);
		data.put("pnum", pnum);

		return data;
	}

	static int delete(String name) { // 이름과 같은 데이터를 리스트에서 삭제
		boolean flag = list.removeIf(o -> o.get("name").equals(name));
		return flag ? 1 : 0;
	}

	static String toString(HashMap<String, String> data) {
		return String.format("%s : %s", data.get("name"), data.get("pnum"));
	}
	// main 함수에서 곧바로 list가 참조가능하기 때문에 전체 목록은 별도의 함수로 구현하지 않음
}
