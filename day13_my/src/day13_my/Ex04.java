package day13_my;

class Animal{
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	
	void bark() {
		System.out.printf("%s : ---\n",name);
	}
}

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	@Override	// 오버라이딩을 할때, 접근제한자의 범위를 넓힐 수 있다.(좁힐 수는 없다)
	public void bark() {
		System.out.printf("%s : 야옹\n",name);
	}
	
	// 고양이의 고유기능 (상속받은 메서드가 아니다)
	public void grooming() {
		System.out.printf("%s가 털을 햝는다.\n",name);
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
	
	@Override	// 오버라이딩 메서드임을 명시하기 위해서, 형식을 맞추지 않으면 경고를 알리기 위해서
	public void bark() {
		System.out.printf("%s : 멍멍\n",name);
	}
	
	// 강아지의 고유기능
	public void tailing() {
		System.out.printf("%s가 꼬리를 흔든다.\n",name);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		
		Cat cat = new Cat("나비");
		Dog dog = new Dog("바둑이");
		
		cat.bark();
		cat.grooming();
		
		dog.bark();
		dog.tailing();
		
		Animal[] animalHospital = new Animal[2];
		animalHospital[0] = cat;	// 업캐스팅
		animalHospital[1] = dog;	// 서로 다른 타입의 객체를 묶어서 관리하고 싶을 때
		
		for(int i =0; i<animalHospital.length;i++) {
			Animal a= animalHospital[i];
			a.bark(); 	// animal 클래스에도 bark()가 정의되어 있으므로 호출할 수 있다.
						// 단, 실행되는 내용은 서브클래스에서 덮어씌운 형태로 실행된다.
		}
		
		Animal a1 = animalHospital[0];	// cat
		Animal a2 = animalHospital[1];	// dog
		
		a1.bark();
//		a1.grooming();		// grooming()은 Animal 클래스에 정의되어 있지 않아서 호출할 수 없다.
		
		a2.bark();
//		a2.tailing();		// tailing()은 Animal 클래스에 정의되어 있지 않아서 호출할 수 없다.
		

		for(int i=0;i<animalHospital.length;i++) {
			if(animalHospital[i] instanceof Cat) {
				Cat c1 = (Cat) a1;
			}
			if(animalHospital[i] instanceof Dog) {
				Dog d1 = (Dog) a2;
			}
		}
		
		// 다형성(polymorphism):  하나의 객체가 슈퍼클래스 타입 혹은 서브클래스 타입으로 참조될 수 있다.
		// 하나의 객체가 다양한 형태로 취급될 수 있는 성격
	}
}
