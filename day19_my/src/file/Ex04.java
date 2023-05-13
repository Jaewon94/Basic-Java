package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		// 텍스트가 아닌, 바이너리 파일을 바이트 단위로 복사하는 예제
		
		File src = new File("다나카.jpg");
		File dst = new File("copy.jpg");
		
		System.out.println("src가 존재하는가? : " +src.exists());
		System.out.println("dst가 존재하는가? : " +dst.exists());
		
		FileInputStream fis = new FileInputStream(src);		// src의 내용을 읽어서
		FileOutputStream fos = new FileOutputStream(dst);	// dst에 기록한다.
		
		int i=0;
		int total=0;
		
		// 1바이트 씩 파일의 내용을 읽어서 새로 쓰는 (복사하는) 코드 (=젓가락질)
		
//		while((i=fis.read()) != -1) {
//			System.out.printf("%3d, %02x\n", i,i);
//			fos.write(i);
//			
//			total++;
//		}
		
		// 1024바이트 크기의 그릇을 이용하여 그릇이 꽉 차면 옮겨담는 방식 (= 그릇으로 퍼기)
		// 버퍼 단위로 파일을 복사함
		byte[] buf = new byte[1024];
		while ((i = fis.read(buf)) != -1) {
			System.out.println(i);
			fos.write(buf);
			total += i;
		}
		System.out.println("total : " + total);
		
		System.out.println("dst 파일의 크기 : "+dst.length());
		fis.close();
		fos.close();
		
	}
}
