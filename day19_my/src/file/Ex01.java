package file;

import java.io.File;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		// java.io.File : 운영체제의 파일 시스템과 연결하여 파일 및 폴더를 제어하는 클래스
		
		// 자바의 File객체는 실제 파일을 가리키는 역할이며
		// 객체를 생성했다고 해서 파일이 생성되는 것은 아니다.
		
		// 객체가 잘못된 파일을 가리키는 상태에서 읽기/쓰기/접근을 시도하면 IOExection이 발생한다. 
		
		File f1 = new File("a.txt");			// File ((String fileName)
												// 해당 위치에 생성
		
		File f2	= new File("C:\\test");			// 파일 및 디렉토리(폴더를)모두 포함한다.
												// 절대 경로를 지정해 줄 수 있다.
												// 파일을 만들때는 createNewFile(); 메서드
												// 폴더를 만들때는 mkdir(); 또는 mkdirs(); 메서드
		
		File f3 = new File("C:\\test", "b.txt");// File(String parent, String child)
												// 앞쪽은 폴더, 뒤쪽은 파일
		
		File f4 = new File(f2, "c.txt");		// File(File  parent, String child)
												// 앞쪽은 폴더, 뒤쪽은 파일
												// 여기서 폴더는 new File 해서 만든 위치를 사용할 수 있다는 뜻
		
		System.out.println("f1이 실제로 존재하는가? : " +f1.exists());
		System.out.println("f2이 실제로 존재하는가? : " +f2.exists());
		System.out.println("f3이 실제로 존재하는가? : " +f3.exists());
		System.out.println("f4이 실제로 존재하는가? : " +f4.exists());
		
		boolean bo1 = f1.createNewFile();	// 경로가 잘못됬거나, 디스크 용량이 부족하거나, 권한없음
		System.out.println("f1이 실제로 존재하는가? : " +f1.exists());
		System.out.println();
		
		f2.mkdir();		// 지정한 경로 및 이름으로 폴도 (디렉토리)를 생성한다.
		f2.mkdirs();	// 만약 마지막 경로의 폴더를 생성하는데 중간 경로가 없다면 중간 경로도 같이 생성한다.
		
		// f2.mkdir();  == mkdir 	(리눅스 기본 명령어)	
		// f2.mkdirs(); == mkdir -p (리눅스 기본 명령어 + 옵션)
		
		// D:\\games\\blizzard entertainment\\starcraft
		boolean bo2 = f3.createNewFile();
		boolean bo3 = f4.createNewFile();
		System.out.println("f3가 새로 생성되었는가? : " + bo2);
		System.out.println("f4가 새로 생성되었는가? : " + bo3);
	}
}
