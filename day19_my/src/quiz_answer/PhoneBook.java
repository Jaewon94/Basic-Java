package quiz_answer;

import java.io.Serializable;

public class PhoneBook implements Serializable, Comparable<PhoneBook> {	// 직렬화 가능하도록
	// 이름과 전화번호를 멤버필드
	// 필드를 전달받는 생성자
	// getter/setter
	// toString()
	
	private static final long serialVersionUID = 1234L;
	
	private int index;
	private String name;
	private String pnum;

	public PhoneBook(int index, String name, String pnum) {
		this.index = index;
		this.name = name;
		this.pnum = pnum;
	}
	
	@Override
	public int compareTo(PhoneBook o) {
		String othersName = o.getName();		// 대상의 이름을 변수에 담고
		int diff = name.compareTo(othersName);	// 내 이름과 대상의 이름 비교값의 결과(차이)
		return diff;	// 차이값을 정수로 반환한다 (0보다 큰지 같은자 작은지)
	}
	
	@Override
	public String toString() {
		return String.format("%d) %s : %s", index, name, pnum); 
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	
}
