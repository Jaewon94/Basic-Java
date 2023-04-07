package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// 파일 객체의 내용을 읽기전에 텍스트 기반의 데이터인지, 바이너리 데이터인지 구분해야한다.
		// 텍스트 기반 내용을 입출력하는 객체는 Reader, Writer 가 클래스 이름에 붙어 있다.
		// 읽기
		File f = new File("C:\\windows\\system32\\drivers\\etc\\hosts");
		
		if(f.exists() == false) {
			f.createNewFile();
		}
		FileReader fileReader = new FileReader(f);
		BufferedReader br = new BufferedReader(fileReader,1024);
		
		String line;
		while((line = br.readLine()) != null) { // br.readLine() 는 hasNextLine()과 비슷한 내용
			System.out.println(line);
		}
		System.out.println("읽기 끝");
		br.close();
		fileReader.close();
		
		
		// 쓰기 
		File f2 = new File("a.txt");
		
		if(f2.exists() == false) {
			f2.createNewFile();
		}
		
		// FileWriter(File dest, boolean append)
		// 지정한 dest 파일에 내용을 기록한다.
		// append가 true이면 기존 내용을 유지하고 추가한다. false이면 덮어쓴다.

		FileWriter fw = new FileWriter(f2, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello\n");
		bw.write("안녕하세요\n");
		
		// 버퍼는 가득 차야 넘어가는데 
		// 가득 차지 않아 넘어가지 못한 데이터가 있을 경우
		// flush 데이터를 밀어 넘기는 것
		bw.flush();
		bw.close();
		
		// Process 를 이용하여 메모장으로 대상 파일을 열어보기
		Process notepad = Runtime.getRuntime().exec("notepad " + f2.getAbsolutePath());
		Thread.sleep(3000);
		notepad.destroy();
		
		// f2.getAbsolutePath()는 파일의 절대경로를 문자열로 반환한다.
		// 절대경로 : 전체 주소
		// 상대경로 : 현재위치 기준 주소
		
		System.out.println(f2.getName());
		System.out.println(f2.getPath());
		System.out.println(f2.getAbsolutePath());
	}
	
}
