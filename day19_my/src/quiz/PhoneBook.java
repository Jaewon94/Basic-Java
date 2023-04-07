package quiz;

import java.io.Serializable;

public class PhoneBook implements Serializable{	// 직렬화 가능하도록
	
	private static final long serialVersionUID = -4406636240784581678L;
	// 이름과 전화번호를 멤버 필드
	private static int sequence = 1;
	private int index;
	private String name;
	private String pnum;
	
	// 필드를 전달받는 생성자
	public PhoneBook(String name, String pnum) {
		index = sequence++;
		this.name = name;
		this.pnum = pnum;
	}


	
	// 게터/세터
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
	
	// toString
	
	@Override
		public String toString() {
			return String.format("(%d번)[이름] %s : [전화번호] %s", index, name, pnum);
		}



}
