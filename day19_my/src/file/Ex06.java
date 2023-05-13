package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Ex06 {
	public static void main(String[] args) throws Exception{
		
		HashMap<String, Object> map1 = new HashMap<String, Object>();
		HashMap<String, Object> map2 = new HashMap<String, Object>();
		HashMap<String, Object> map3 = new HashMap<String, Object>();

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		map1.put("name", "이지은");
		map1.put("age", "31");
		
		map2.put("name", "이지금");
		map2.put("age", "18");
		
		map3.put("name", "신짱구");
		map3.put("age", "5");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		System.out.println(list);
		
		
		// 위에서 만든 리스트를 파일에 그대로 기록해 보자
		
		File f = new File("ex06.dat");	// 텍스트 기반의 기록이 아니다.  
		
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// 객체를 파일에 기록하기 위한 출력스트림
		
		oos.writeObject(list);
		oos.flush();
		oos.close();
		
		Process notepad = Runtime.getRuntime().exec("notepad" + f.getAbsolutePath());
		Thread.sleep(3000);
		notepad.destroy();
		
	}
}
