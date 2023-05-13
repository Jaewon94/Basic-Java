package summary3;

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
		String feed ="먹이";
// 		1)
		if (ani instanceof Cat) {
			feed="츄르";
		} else if(ani instanceof Dog){
			feed="육포";
		}
		
//		2)
//		switch (ani.getClass().getSimpleName()) {
//		case "Dog":
//			feed = "육포"; break;
//		case "Cat":
//			feed = "츄르"; break;
//		}
		System.out.printf("%s이 %s에게 %s를 준다.\n",name, ani.getName(),feed);
	}
	
}
