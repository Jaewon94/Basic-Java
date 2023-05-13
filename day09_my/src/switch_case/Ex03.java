package switch_case;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 문자열 데이터 CRUD
		// 데이터의 입력과 출력은 항상 main 에서만 진행한다.
		Scanner sc = new Scanner(System.in);
		int menu, result;
		String data, replace;
		// 1) 여러 데이터를 저장할 구조를 만들어둔다(배열)
		String[] arr = new String[5];
		
		// 2) while, switch-case를 활용하여 메뉴 반복 구조를 만든다.
		while(true) {
			System.out.println("1. 추가");	// Create
			System.out.println("2. 목록");	// Read
			System.out.println("3. 수정");	// Update
			System.out.println("4. 삭제");	// Delete
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				System.out.print("추가할 데이터를 입력 : ");
				data = sc.nextLine();
				result = insert(arr,data);	// arr에 data를 추가하겠다.
				System.out.println(result == 1 ? "추가 성공" : "추가 실패");
				break;
				
			case 2:	// 목록
				 show(arr);
				 break;
				 
			case 3:
				System.out.print("수정할 데이터의 이름 입력 : ");
				data =sc.nextLine();
				System.out.println("변경할 내용 입력 : ");
				replace = sc.nextLine();
				result = update(arr, data, replace);
				System.out.println(result == 1 ? "수정 성공" : "수정 실패");
				break;
				
			case 4:
				System.out.print("삭제할 데이터의 이름 입력 : ");
				data =sc.nextLine();
				result = delete(arr, data);
				System.out.println(result == 1 ? "삭제 성공" : "삭제 실패");
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;	// main함수의 return(종료)
			}
			System.out.println();  // 각 메뉴를 실행 후 한줄 공백
		}	// end of while
	}	// end of main
	
	static int insert(String[] arr,String data) {
		// 배열의 멤버요소는 초기화 값이 null로 설정되어 있다.
		for(int i =0; i<arr.length; i++) {		// 전체 배열에서
			if(arr[i] == null) {				// 빈칸이 있으면
				arr[i] =data;					// 빈칸에 데이터를 저장하고
				return 1;						// 1을 반환한다. (성공)
			}
		}
		return 0;				// 빈칸이 없다면 데이터를 추가하지 못하고 0을 반환한다.(실패)
	}
	
	static void show(String[] arr) {
		for (int i=0; i<arr.length;i++) {
			if(arr[i] != null) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("목록 출력 완료");
	}
	
	static int update(String[] arr, String data, String replace) {
		int row = 0;
		for(int i=0; i<arr.length;i++) {	// 전체 배열에서
			if(data.equals(arr[i])) {		// 일치하는 데이터가 있으면
				arr[i] = replace;			// 새로운 데이터로 바꿔주고
				row=1;						// 반환할 값을 1로 변경해 주고(성공)
				break;						// 반복 종료
			}
		}
		return row;		// 반환 (if가 실행되었다면 1일테고, 아니라면 초기값 0을 반환)
	}
	
	static int delete(String[] arr, String data) {
		// 값을 제거하려면 null을 대입하면 된다.
		int row =0;
		for(int i=0;i<arr.length;i++) {						// 전체 배열에서
			if(arr[i] != null && arr[i].equals(data)) {		// 빈칸이 아닌곳 중에 일치하는 데이터를
				arr[i] = null;								// 삭제하고
				row = 1;									// 반환값을 준비시켜주고
				break;										// 반복을 중단한다.
			}
		}
		return row;	// if가 실행되었다면 1, 아니면 0을 반환한다.
	}
	
}	// end of class
