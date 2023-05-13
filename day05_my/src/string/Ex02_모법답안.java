package string;

public class Ex02_모법답안 {
	public static void main(String[] args) {
		String s1 = "https://search.naver.com/search.naver";
		String s2 = "?query=단비&where=image";
		String url = s1+s2;
		
		System.out.println();
		System.out.println("s1 : " +s1);
		System.out.println("s2 : " +s2);
		System.out.println();
		
		System.out.println("url : " +url);
		System.out.println();
		
		// 프로토콜은 처음부터 // 까지 포함된다. (http://, https://)
		String protocol  = url.substring(0,s1.indexOf("//") + "//".length());
		
		// 프로토콜 다음 내용부터, 마지막 / 가 있는 곳 전까지
		String domainName = url.substring(protocol.length(),s1.lastIndexOf("/")); 
		
		// 마지막 / 다음부터 s1의 끝까지
		String uri = s1.substring(s1.lastIndexOf("/")+1);
		
		// s2에서 첫글자(?) 이후부터 & 위치 이전까지
		String param1 = s2.substring(1,s2.indexOf("&"));

		// s2에서 & 위치 다음부터 끝까지
		String param2 = s2.substring(s2.indexOf("&")+1);
		
		System.out.println("protocol\t: "+ protocol);
		System.out.println("domainName\t: "+ domainName);
		System.out.println("uri\t\t: "+ uri);
		System.out.println("param1\t\t: "+ param1);
		System.out.println("param2\t\t: "+ param2);
		
		
	}
}
