package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Ex07 {
	public static void main(String[] args) throws Exception {
		// Ex06에서 기록한 ex06.dat 파일의 내용을  불러와서 다시 객체로 저장해서 출력하기
		
		File f= new File("ex06.dat");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<HashMap<String, Object>> list;
		
		list = (ArrayList<HashMap<String, Object>>) ois.readObject();
		ois.close();
		
		list.forEach(map -> System.out.println(map));
	}
}
