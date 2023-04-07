package management;

import java.util.ArrayList;

public class Handler {
	// 학생을 저장할 수 있는 구조
	// 1) 학생들을 담을 수 있는 ArrayList를 생성
	ArrayList<Student> list = new ArrayList<Student>();
	
	// 학생의 CRUD를 처리하는 기능
	// 2) 
	public int insert(Student st) {			// 학생을 전달받아서
		int row = 0;						// 리스트에 추가하고
		if(list.add(st)) {
			row = 1;
		}
		return row;							// 1을 반환
	}
	
	public ArrayList<Student> select() {	
		ArrayList<Student> tmp = new ArrayList<Student>();		// 리스트에 모든 학생 정보를 담아서
		
		for(int i=0;i<list.size();i++) {
			tmp.add(list.get(i));
		}
	
		return tmp;						// list를 반환
	}
	
	public int delete(String name) {		// 학생 이름을 전달 받아서
//		int row = 0;						// 이름이 일치하는 학생 하나를 제거하고
		
//		for(int i=0; i <list.size();i++) {
//			if (name.equals(list.get(i).getName())) {
//				list.remove(i);
//				row = 1;
//				break;	// 안하면 끝까지 다 하고 끝남(시간 더 걸림)
//			}
//		}
		
		// 람다를 사용하면
		// 만약 리스트의 각 학생의 이름이 name과 같다면 지운다.
		boolean flag = list.removeIf(st -> st.getName().equals(name));
		return flag ? 1 : 0;							// 1을 반환
	}

}
