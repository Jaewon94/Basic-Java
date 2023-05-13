package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		int menu;
		Scanner sc = new Scanner(System.in); 
		String data;
		
		while (true) {	// Queue : 먼저 넣은 데이터가 먼저 나오는 구조 (First In First Out(FIFO)
			System.out.println();
			System.out.println(queue);
			System.out.println();
			System.out.print("1. add | 2. poll | 3. quit\nselet >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				// 데이터를 하나 입력받아서 맨 끝에 추가한다.
				System.out.print("input for add data : ");
				queue.add(sc.nextLine());
				break;
			case 2:
				// 현재 추가된 데이터 중에서 가장 첫번째 데이터를 꺼낸다.
				data = queue.poll();
				System.out.println("poll data : " +data);
				break;

			default:
				
				break;
			}
			sc.close();
		}
	}
}
