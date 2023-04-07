package file;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.out.println(System.getProperty("os.name"));
		System.out.println("File.separator : " + File.separator);
		System.out.println("File.pathSeparator : " + File.pathSeparator);
		System.out.println(System.getenv("PATH"));
		
//						Windows 		Linux		설명
//	File.separator		\				/			파일 경로에서 상위폴더 하위폴더를 구분하는 글자
//	File.pathSeparator	;				:			여러 경로를 나열할 때 사용한는 글자
		
		// 자바가 운영체제에 따른 JVM이 서로 다르게 구성되어 있지만
		// 경로 구분자를 정확하게 사용하지 않으면 파일을 찾지 못할 수 있다.
		
		File dir = new File("C:\\windows\\system32\\drivers\\etc");
		
		System.out.println("dir가 존재하는가 : " + dir.exists());
		System.out.println("dir가 폴더인가 : " + dir.isDirectory());
		System.out.println("dir가 파일인가 : " + dir.isFile());
		System.out.println("dir가 읽기 가능한가: " + dir.canRead());
		System.out.println("dir가 쓰기 가능한가: " + dir.canWrite());
		System.out.println("dir가 실행(접근) 가능한가: " + dir.canExecute());
		System.out.println();
		
		File f = new File(dir, "hosts");
		System.out.println("f가 존재하는가 : " + f.exists());
		System.out.println("f가 폴더인가 : " + f.isDirectory());
		System.out.println("f가 파일인가 : " + f.isFile());
		System.out.println("f가 읽기 가능한가: " + f.canRead());
		System.out.println("f가 쓰기 가능한가: " + f.canWrite());
		System.out.println("f가 실행(접근) 가능한가: " + f.canExecute());
		System.out.println();
		
		Scanner sc; 
		
		// f의 대상 파일이 존재하고, 형식이 디렉토리가 아닌 파일이고, 권한 상 읽기 가능하다면
		if(f.exists() && f.isFile() && f.canRead()) {
			sc = new Scanner(f);	// f를 읽어내는 Scanner 객체 생성 
			
			while(sc.hasNextLine()) {			// 아직 처리하지 않은 다음 줄이 있다면
				String line = sc.nextLine();	// 다음 줄을 가져와서
				System.out.println(line);		// 출력하고
				Thread.sleep(500);					// 0.5초 딜레이
			}
			sc.close();
		}
		System.out.println("끝");
	}
}
