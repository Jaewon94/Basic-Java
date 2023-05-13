package type;

class Student {
	String name;
	int score;
}

public class Ex06_DebuggingSample {
	public static void main(String[] args) {
		
		Student[] arr = new Student[5];
		Student st;
		
		System.out.println("1. 새로운 항목 추가하기");
		st = new Student();
		st.name = "짱구";
		st.score = 50;
		insert(arr, st);
		
		st = new Student();
		st.name = "유리";
		st.score = 80;
		insert(arr, st);
		
		System.out.println("2. 전체 출력하기");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.printf("%s : %d점\n", arr[i].name, arr[i].score);
			}
		}
		
		System.out.println("3. 항목 수정하기");
		st = new Student();
		st.name = "수지";
		st.score = 85;
		update(arr, "유리", st);
		
		System.out.println("4. 항목 삭제하기");
		delete(arr, "짱구");
		
	}
	static int insert(Student[] arr, Student st) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = st;
				row = 1;
				break;
			}
		}
		return row;
	}
	static int update(Student[] arr, String name, Student st) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(name)) {
				arr[i] = st;
				row = 1;
				break;
			}
		}
		return row;
	}
	
	static int delete(Student[] arr, String name) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(name)) {
				arr[i] = null;
				row = 1;
				break;
			}
		}
		return row;
	}
}
