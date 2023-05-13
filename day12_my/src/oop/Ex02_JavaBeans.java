package oop;

class Member {
	
	// 1) 클래스의 멤버 필드를 모두 private로 작성
	private int idx;
	private String id;
	private String pw;
	private String name;
	private String email;
	private int age;
	
	
	// 2) 생성자는 작성하지 않거나, 기본생성자를 포함하여 작성한다.
	public Member() {
		
	}
	
	
	// 3) 이클립스 or 인텔리제이 등 대부분의 자바 관련 IDE 는 getter/setter 자동 생성이 있다.
	// 이클립스에서는 저장 -> 우클릭 -> source -> generate getters and setters
	// 또는 alt + shift + s ->  generate getters and setters
	
	
	public String getId() {
		return id;
	}

	public int getIdx() {
		return idx;
	}


	public void setIdx(int idx) {
		this.idx = idx;
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}


public class Ex02_JavaBeans {
	public static void main(String[] args) {
		
		// 여러 자바 기반 플랫폼에서 객체를 나타내기 위한 클래스 기본 형식
		
		// 1) 필드는 private로 구성한다.
		// 2) 메서드, 생성자는 public으로 구성한다.
		// 3) 생성자는 기본생성자를 반드시 포함해야 한다.(오버로딩은 자유)
		
		Member ob1 = new Member();
		ob1.setIdx(100);
		ob1.setId("itbank");
		ob1.setPw("it");
		ob1.setEmail("test@naver.com");
		ob1.setName("테스트");
		ob1.setAge(25);
		
		System.out.println(ob1.getIdx());
		System.out.println(ob1.getId());
		System.out.println(ob1.getPw());
		System.out.println(ob1.getName());
		System.out.println(ob1.getEmail());
		System.out.println(ob1.getAge());
	}
}
