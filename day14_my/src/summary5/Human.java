package summary5;

public class Human implements Companion {
	String name;
	
	public Human(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void give(Companion ob) {
		String feed="먹이";
		String give ="던져";
		if(ob instanceof Cat) feed ="츄르";
		if(ob instanceof Dog) feed = "육포";
		if(ob instanceof Friend) feed = "치즈"; give="건네";
		System.out.printf("%s이 %s에게 %s (%s) 준다.\n",name, ob.getName(),feed,give);
	}
	
//	public void give(Object ob) {
//		String feed ="먹이";
//		if (ob instanceof Cat) {
//			feed="츄르";
//		} else if(ob instanceof Dog){
//			feed="육포";
//		} else if (ob instanceof Friend) {
//			feed="치즈";
//		}
//		System.out.printf("%s이 %s에게 %s를 준다.\n",name, ob.,feed);
//	}
//


}
