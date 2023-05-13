package loop;

import java.util.Random;
import java.util.Scanner;

public class Ex03_Dice {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int dice = ran.nextInt(6) +1;
		
		int cnt = 0;
		int user;
		
		while (true) {
			System.out.println("정답은 무엇일까 : ");
			user = Integer.parseInt(sc.nextLine());
			cnt +=1;
			if (user == dice) {
				break;
			}	// end of if
		}	// end of while
		System.out.printf("정답은 %d입니다. !! %d회만에 정답을 맞췄습니다.!\n",dice, cnt);
		sc.close();
	}	// end of main
}	// end of class
