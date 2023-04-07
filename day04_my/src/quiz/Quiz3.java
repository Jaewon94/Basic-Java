package quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		
		String id = "itbank";
		String pw = "it";
		
		Scanner sc = new Scanner(System.in);
		
		String userId, userPw;
		String result;
		
		// userId와 userPw에 문자열을 입력 받아서 
		// 1) 아이디 불일치
		// 2) 아이디는 일치하지만, 패스워드 불일치
		// 3) 아이디와 패스워드 모두 일치하여 로그인 성공
		
		// 3개의 결과를 화면에 출력할 수 있는 코드를 작성
		
		System.out.print("ID 입력 >> ");
		userId = sc.nextLine();
		System.out.print("PW 입력 >> ");
		userPw = sc.nextLine();
		
		if (id.equals(userId)) {
			if(pw.equals(userPw)) {
				result = "로그인 성공";
			}else {
				result="패스워드 불일치";
			}
		} else {
			result = "아이디 불일치";
		}
		System.out.println(result);
		sc.close();
	}
}
