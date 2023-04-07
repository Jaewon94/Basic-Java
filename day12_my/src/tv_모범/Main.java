package tv_모범;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		TV tv = new TV();
		
		Scanner sc = new Scanner(System.in);
		
		// 숫자 키패드를 기준으로 메뉴 구성
		// 2 : 채널 내림
		// 8 : 채널 올림
		// 4 : 볼륨 내림
		// 6 : 볼륨 올림
		// 7 : 전원
		// 9 : 음소거
		// 0 : 프로그램 종료
		
		int menu;
		do {
			System.out.println("TV 버튼 입력 : ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 2:
				tv.channeelDown();
				break;
			case 8:
				tv.channeelUP();
				break;
			case 4:
				tv.volumeDown();
				break;
			case 6:
				tv.volumeUp();
				break;
			case 7:
				tv.onoff();
				break;
			case 9:
				tv.mute();
				break;
			case 0:
				System.out.println("TV를 종료합니다.");
			default:
				break;
			}
		}while(menu != 0);
	}
}
