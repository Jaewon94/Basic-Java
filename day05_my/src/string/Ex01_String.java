package string;

public class Ex01_String {
	public static void main(String[] args) {
		// String : 문자열을 처리하는 클래스
		// ""를 이용하여 문자열을 표시하며, 모든 문자열은 내장기능(함수)이 포함되어 있다.
		// 특정 문자열이 아니더라고, String 클래스에서 기능을 호출하여 사용할 수 있다.
		
		String s1 = "Hello";
		
		// 문자열의 글자수(길이)를 정수 형태로 변환한다.
		System.out.println("s1의 길이 : " +s1.length());
		
		// 문자열의 n번째 글자만 char령태로 추출한다.
		System.out.println("s1의 0번째 글자 : " + s1.charAt(0));
		System.out.println("s1의 1번째 글자 : " + s1.charAt(1));
		
		// 문자열이 다른 내용을 포함하는지 boolean형태로 반환한다.
		System.out.println("s1이 Hell이라는 내용을 포함하는가? : "+s1.contains("Hell"));
		
		// 문자열의 특정 패턴을 찾아서 다른 패턴으로 변경한 문자열을 새롭게 반환한다.
		System.out.println("s1에서 l을 L로 바꾼 결과 : " + s1.replace("l", "L"));
		
		// 문자열에서 특정 패턴이 몇번째 위치에 있는지 정수로 반환
		System.out.println("s1에서 el은 몇번째 위치에 있는가? : " +s1.indexOf("el"));
		
		// 문자열에서 특정 글자를 제외한 나머지 구간을 새로운 문자열로 반환한다.
		// 원본 문자열은 0, 1, 2, 3, 4번째 글자가 있는데
		// 2번째 부터 끝까지만 이용하여 새로운 문자열을 만든다.
		System.out.println("s1에서 He를 빼면 무엇이 남는가? :" +s1.substring(2));
		
		String url = "Https://www.naver.com";
		String url2 = "Https://www.daum.com";
		String url3 = "Https://www.google.com";
		System.out.println(url.substring("https://".length()));
		System.out.println(url2.substring("https://".length()));
		System.out.println(url3.substring("https://".length()));
		System.out.println(url.substring(0,url.indexOf("www.naver.com")));
		// s1.substring(beginIndex) : beginIndex부터 끝까지 잘라낸다.
		// s1.substring(beginIndex, endIndex) : beginIndex부터 endIndex전까지 잘라낸다.
		
		// 문자열이 특정 패턴으로 시작하는지 판별한다.
		System.out.println("s1이 He로 시작하는가? : " +s1.startsWith("He"));
		
		// 문자열의 모든 소문자를 대문자로 바꾼다.
		System.out.println("s1의 대문자처리 : " + s1.toUpperCase());
		
		// 문자열의 모든 대문자를 소문자로 바꾼다.
		System.out.println("s1의 소문자 처리 : " + s1.toLowerCase());
		
		// 원본 문자열 다시 출력 
		System.out.println("원본 s1 : " +s1);
		
	}
}
