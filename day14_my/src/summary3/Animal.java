package summary3;

// 공통 속성과 기능은 슈퍼클래스에

public abstract class Animal {
	private String name;
	
	public Animal(String name) {
	this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
