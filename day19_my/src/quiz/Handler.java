package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;

public class Handler {
	private ArrayList<PhoneBook> list = new ArrayList<>();
	private File f;
	
	public Handler() {					//	Handler의 객체를 생성하면
		f= new File("phonebook.dat");	// 파일을 지정하고
		
		if(f.exists()) {				// 만약 파일이 이미 만들어져 있다면 (저장된 내용이 있다면)
			list = load();				// 파일을 불러와서 리스트에 올려둔다.
		}
	}
	
	// (경고를 억제하다) 타입이 확인되지 않은 다운캐스팅에 대한 경고
	@SuppressWarnings("unchecked")
	private ArrayList<PhoneBook> load(){
		ArrayList<PhoneBook> tmp = null;
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(f));
			tmp = (ArrayList<PhoneBook>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {ois.close(); } catch(Exception e) {}
		}
		
		
		return tmp;
	}
	
	public void save() {	// 종료
		// 멤버필드 list를 f 파일에 저장하는 내용
		// main에서 프로그램 종료를 실행하면, 저장 후 종료하도록 설정해야 한다.
		f = new File("phonebook.dat");
		if (f.exists()) {
			f.delete();
		}
		try {
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
	
			oos.writeObject(list);
			
			
			
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	public int insert(PhoneBook ob) {	// 추가
		int result = 0;
		if(list.add(ob)) {
			result =1;
		}
		return result;
		
	}
	
	public int delete(/* 매개변수 타입 자유 (권장값은 int index)*/int index) {	// 삭제
		int result = 0;
		for (int i=0; i < list.size(); i++) {
			if(index == list.get(i).getIndex()) {
				list.remove(i);
				result = 1;
			}
		}
		return result;
	}
	
	public ArrayList<PhoneBook> select() {	// 불러오기

		return list;
	}
	
	public ArrayList<PhoneBook> sort(ArrayList<PhoneBook> list) {	// 정렬
		// 리스트를 이름으로 정렬하는 코드
		ArrayList<PhoneBook> tmp = new ArrayList<PhoneBook>();
		Comparator<PhoneBook> comp = (o1, o2) -> o1.getName().compareTo(o2.getName());
		
		list.forEach(c -> tmp.add(c) );
		tmp.sort(comp);
		return tmp;
	}
	
}