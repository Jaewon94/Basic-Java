package operator;

public class Ex02_Operator {
	public static void main(String[] args) {
		// 복합대입 연산자 (배정대입 연산자)
		int n1 = 10;
		int n2 = 3;
		
		n1 = n1 + n2;
		System.out.println(n1);
		n1 += n2;
		System.out.println(n1);
		
		n1 -= 2;
		n1 *= 3;
		n1 %= 4;
		System.out.println(n1);
		
		// 게시물을 클릭할 때 마다 조회수가 1씩 증가하게 만들고 싶다면
		int view_count = 0;
		view_count +=1;
		view_count +=1;
		view_count +=1;
		view_count++; 	// 단항 증감 연산자 (1씩 증가)
		System.out.println("조회수 :"+ view_count);
		
		// 비교 연산자 : >, <, >=, <=, ==, !=
		// 비교 연산의 결과는 boolean 형태로 나타난다.(true, false)
		
		n1 = 10;
		n2 =3;
		System.out.println("n1 > n2 : " + (n1>n2));		// 초과 (gt)
		System.out.println("n1 < n2 : " + (n1<n2));		// 미만 (lt)
		System.out.println("n1 >= n2 : " + (n1>=n2));	// 이상 (ge)
		System.out.println("n1 <= n2 : " + (n1<=n2));	// 이하 (le)
		System.out.println("n1 == n2 : " + (n1==n2));	// 일치 (eq)
		System.out.println("n1 != n2 : " + (n1!=n2));	// 불일치 (ne)
		// if, while, for, 삼항연산자 등에 활용되기 때문에 중요도가 높다.
		
		int age = 20;
		boolean isAdult = age >=20;
		System.out.println("성인 여부 : "+ isAdult);
		
		// 비교연산자는 primitive 타입에 대해서만 작동한다.
		// 객체는 별도의 함수를 통해 비교해야 한다.
		// 문자열(String)의 일치 여부 또한 연산자로 비교할 수 없다.
	}
}
