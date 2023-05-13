package quiz_answer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// 변수 선언
		Handler handler = new Handler();	// main과 상호작용할 handler 객체
		PhoneBook tmp = null;
		String name = null, pnum = null;
		Scanner sc = new Scanner(System.in);
		ArrayList<PhoneBook> list = null;
		int menu, index;
		
		// 연산 및 처리
		while(true) {
			System.out.println("1. 추가");
			System.out.println("2. 목록");
			System.out.println("3. 삭제");
			System.out.println("4. 정렬");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				System.out.print("이름 입력 : ");
				name = sc.nextLine();
				
				System.out.print("전화번호 입력 : ");
				pnum = sc.nextLine();
				
				// main에서 index를 지정하지 않아도, handler에서 다시 배정해준다
				tmp = new PhoneBook(0, name, pnum);
				handler.insert(tmp);
				break;
				
			case 2:
				list = handler.select();
				list.forEach(ob -> System.out.println(ob));
				break;
				
			case 3:
				System.out.print("삭제할 정보의 번호를 입력 : ");
				index = Integer.parseInt(sc.nextLine());
				handler.delete(index);
				break;
				
			case 4:
				handler.sort();
				break;
				
			case 0:
				handler.save();
				sc.close();
				return;
			}
			System.out.println();
		}
		
		
		
	}
}
