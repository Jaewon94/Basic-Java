package assignment;

public class Assignment_substring_모범 {
	
	public static void main(String[] args) {
		// substring 함수를 직접 구현해봅시다.
	// (오버로딩 된 형태까지 포함)
	
	// A.substring(begin, end)	<- 현재 안배움
	// substring(A, begin, end)
	
	String t1 = "James Gosling";
	
	// G의 위치부터 끝까지 잘라내서 새로운 문자열을 만들어낸다.
	// (endIndex가 생략된 형태, endIndex가 생략되면 기준 문자열의 끝까지)
	String t2 = t1.substring(t1.indexOf("G"));
	
	// 처음부터 띄어쓰기 이전까지 잘라낸다.
	String t3 = t1.substring(0, t1.indexOf(" "));
	
	System.out.println("t2 : " + t2);
	System.out.println("t3 : " + t3);
	
	String t4 = substring(t1, 0, t1.indexOf(" "));
	System.out.println("t4 : " + t4);
	
	String t5 = substring(t1,t1.indexOf("G"));
	System.out.println("t5 : " + t5);
	}
	
	// 직접 만들어보는 substring
	static String substring(String str, int begin, int end) {
		String result="";
		// 1) 배열로 만들어서 char하나하나 처리하거나
		// 2) 문자열의 charAt 함수를 이용하여 글자를 하나씩 처리하기
		
		for(int i = begin; i < end; i++) {
			char ch = str.charAt(i);
//			System.out.printf("%d : %c\n", i, ch);
			result += ch;
		}
		return result;
	}
	
	// substring 오버로딩 
	// end를 생략하면 기존 문자열의 마지막까지 잘라내기
	static String substring(String str, int begin) {
		// 이미 만들어진 substring을 한번 더 호출하여 사용한다.
		return substring(str, begin, str.length());
	}
	
}
