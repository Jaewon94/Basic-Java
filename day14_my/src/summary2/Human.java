package summary2;

public class Human {
	private String name;
	
	public Human(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void give(Animal ani) {
		System.out.printf("%s이 %s에게 먹이를 준다.\n",name, ani.getName());
	}
	
}
