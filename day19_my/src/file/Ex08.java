package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


// 직접 만드는 클래스에 Serializable (직렬화) 해주려면 implements Serializable 해주고
// Human에 노란줄 뜨면  커서를 대면  Add generated serial version ID 눌러주면 알아서 만들어줌
class Human implements Serializable{
	
	
	private static final long serialVersionUID = -7518176237668074476L;
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {

		return String.format("%s : %d살\n", name, age);
	}
}

public class Ex08 {
	public static void main(String[] args) throws Exception {
		
		Human ob1 = new Human("이지은", 31);
		
		File f = new File("ex08.human");
		
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(ob1);
		oos.flush();
		oos.close();
		
		
		
	}
}
