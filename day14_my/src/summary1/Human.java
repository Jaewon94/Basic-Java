package summary1;

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
	
	public void give(Cat cat) {
		System.out.printf("%s이 %s에게 먹이를 준다.\n",name, cat.getName());
	}
	
	public void give(Dog dog) {
		System.out.printf("%s이 %s에게 먹이를 준다.\n",name,dog.getName());
	}
}
