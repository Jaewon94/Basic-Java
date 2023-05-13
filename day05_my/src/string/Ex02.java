package string;

public class Ex02 {
	public static void main(String[] args) {
		// 다음 제시된 문자열을 분석하여
		// 프로토콜, 도메인이름, 페이지(자원)이름, 파라미터로 구분하여 각각 출력
		// 단, split()메서드는 사용하지 말고
		
		String url = "https://search.naver.com/search.naver";
		url += "?query=단비&where=image";
		
		System.out.println(url);
		
		String protocol, domainName, uri, parameter1, parameter2;
		
		// protocol : https://
		// domainName : search.naver.com
		// uri : search.naver
		// parameter(query) : 단비
		// parameter(where) : image
		
		protocol = url.substring(0,url.indexOf("/")+2);
		System.out.println("protocol\t: " +protocol);
		url = url.substring(protocol.length());
//		System.out.println(url);
		

		domainName = url.substring(0, url.indexOf("/"));
		System.out.println("domainName\t: "+ domainName);
		url = url.substring(domainName.length());
//		System.out.println(url);
		
		uri = url.substring(1, url.indexOf("?"));
		System.out.println("uri\t\t: "+ uri);
		url = url.substring(uri.length()+1);
//		System.out.println(url);
		
		parameter1 = url.substring(url.indexOf("=")+1, url.indexOf("&"));
		System.out.println("parameter1\t: "+ parameter1);
		url = url.substring(url.indexOf("=")+parameter1.length() +1);
//		System.out.println(url);
		
		parameter2 = url.substring(url.indexOf("=") +1);
		System.out.println("parameter2\t: "+ parameter2);

	}
}
