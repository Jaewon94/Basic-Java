package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Handler h = new Handler();
		ArrayList<PhoneBook> list = null;
		ArrayList<PhoneBook> sort = null;
		
		int index, menu, result;
		String name, pnum;
		
		
		
		do {
			
			System.out.println("1. 전화번호 추가");
			System.out.println("2. 전화번호 리스트");
			System.out.println("3. 전화번호 정렬");
			System.out.println("4. 전화번호 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.println("메뉴 선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				System.out.println("저장할 이름 입력 : ");
				name = sc.nextLine();
				System.out.println("저장할 번호 입력 : ");
				pnum = sc.nextLine();
				PhoneBook tmp = new PhoneBook(name, pnum);
				result = h.insert(tmp);
				
				if(result == 1) {
					System.out.println("저장 완료");
				} else {
					System.out.println("저장 실패");
				}
				
				break;
			case 2:
				list = h.select();
				for (PhoneBook phoneBook : list) {
					System.out.println(phoneBook);
				}
				break;
			case 3:
				sort = h.select();
				sort = h.sort(sort);
				for (PhoneBook pb : sort) {
					System.out.println(pb);
				}
				break;
			case 4:
				System.out.print("삭제할 인덱스 번호 입력 : ");
				index = Integer.parseInt(sc.nextLine());
				result = h.delete(index);
				if(result == 1) {
					System.out.println("삭제 완료");
				} else {
					System.out.println("삭제 실패");
				}
				break;
			case 0:
				h.save();
				System.out.println("프로그램을 종료합니다.");
				break;

			default:
				System.out.println("메뉴를 잘못 입력 하셨습니다.");
				break;
			}
			
		}while(menu !=0);
		sc.close();
	}
}