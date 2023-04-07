package loop;

public class Ex07_LoopCount {
	public static void main(String[] args) {

		// 가로와 세로가 같은 정 사각형 안에서 도형을 출력하기
		/*
		 * 출력 순서 : 공백 -> 별 -> 공백 0 * 2 1 2 1 * * * 1 3 1 2 * * * * * 0 5 0 3 * * * 1 3 1
		 * 4 * 2 1 2
		 */

		int length = 5;
		String space = "  ";
		String star = "* ";
		int sp = 2;
		int st = 1;

		for (int i = 0; i < length; i++) { // 한 줄의 출력 내용을 순서대로 작성
			for (int j = 0; j < sp; j++) {
				System.out.print(space);
			}
			for (int j = 0; j < st; j++) {
				System.out.print(star);
			}
			for (int j = 0; j < sp; j++) {
				System.out.print(space);
			}
			System.out.println(); // 출력할 내용이 모두 끝나면 한 줄을 끝낸다.

			if (i < length / 2) {
				sp -= 1;
				st += 2;
			} else {
				sp += 1;
				st -= 2;
			}

		}
		System.out.println("======================");
		sp = length - 1;
		st = 1;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print(space);
			}
			for (int j = 0; j < st; j++) {
				System.out.print(star);
			}
			System.out.printf("\t%d, %d\n", sp, st);
			sp -= 1;
			st += 1;
		}

		System.out.println("======================");
		sp = 0;
		st = length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print(space);
			}
			for (int j = 0; j < st; j++) {
				System.out.print(star);
			}
			System.out.printf("\t%d, %d\n", sp, st);
			sp += 1;
			st -= 1;
		}

		System.out.println("======================");
		sp = 0;
		st = length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < st; j++) {
				System.out.print(star);
			}
			for (int j = 0; j < sp; j++) {
				System.out.print(space);
			}

			System.out.printf("\t%d, %d\n", sp, st);
			sp += 1;
			st -= 1;
		}
		System.out.println("======================");
		sp = length - 1;
		st = 1;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < st; j++) {
				System.out.print(star);
			}
			for (int j = 0; j < sp; j++) {
				System.out.print(space);
			}

			System.out.printf("\t%d, %d\n", sp, st);
			sp -= 1;
			st += 1;
		}

		System.out.println("======================");
		length = 11;
		sp = length - 2;
		st = 1;
		for (int i = 0; i < length; i++) {

			if (st <= length / 2) {
				for (int j = 0; j < st; j++) {
					System.out.print(star);
				}
				for (int j = 0; j < sp; j++) {
					System.out.print(space);
				}
				for (int j = 0; j < st; j++) {
					System.out.print(star);
				}
			} else {
				for (int j = 0; j < length; j++) {
					System.out.print(star);
				}

			}

			System.out.printf("\t%d, %d, %d\n", st, sp, st);
			if (i < length / 2) {
				sp -= 2;
				st += 1;
			} else {
				sp += 2;
				st -= 1;
			}

		}

		System.out.println("======================");
		length = 5;
		sp = length - 2;
		st = 1;
		for (int i = 0; i < length; i++) {

			for (int j = 0; j < st; j++) {
				System.out.print(star);
			}
			for (int j = 0; j < sp; j++) {
				System.out.print(space);
			}
			// if, while, for 모두 조건이 참이 아니면 종속문장을 실행하지 않는다.
			for (int j = 0; j < st && st + j < length; j++) {
				System.out.print(star);
			}

			System.out.printf("\t%d, %d, %d\n", st, sp, st);
			if (i < length / 2) {
				sp -= 2;
				st += 1;
			} else {
				sp += 2;
				st -= 1;
			}

		}
		
		// 참고 사항 : 조건식을 생략하면 for문으로 무한반복을 구현할 수 있다.
		// 잘 사용하진 않음
		for (/*변수선언 및 초기화*/ ;/*조건식*/ ;/*증감식*/) {
			System.out.println("infinite loop");
			break;
		}
		
		// 이미 선언된 변수를 활용하여 반복문을 진행할 때는 선언 및 초기화 부분을 생략할 수있다.
		int cnt=0;
		for(;cnt<3; cnt++) {
			
			System.out.println(1);
		}
		
		// 종속문장에서 등감을 별도로 처리하고 있다면 증감식도 생략가능
		for(;cnt<7;) {
			System.out.println(cnt++);
			
		}
		
	}
}
