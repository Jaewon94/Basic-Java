package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws Exception {
		
		// (InputStream/OutputStream)빨때(통로)를 꼽고
		InputStream is = null;
		FileOutputStream fos = null;
		
		byte[] buf = new byte[1024];
		int i=0;
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자원위치 입력 : ");
		String resource = sc.nextLine();
		
		// 확장자가 없어도 가능한 방법
		// Uniform Resource Locator : 자원의 위치를 알리는 문자열 형식
		URL url = new URL(resource);
		
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		String contentType = conn.getContentType();	// 자원의 유형
		int size = conn.getContentLength();			// 자원의 전체 크기 (byte)
		
		System.out.printf("%s : %d byte\n",contentType, size);
		
		String fileName = "ex05." + contentType.split("/")[1];	// 새로 만들 파일이름
		
		File dest = new File(fileName);
		dest.createNewFile();
		
		is = url.openStream();
		fos = new FileOutputStream(dest);
		
// 		확장자가 없는 경우 이미지 주소를 가져와도 안될 수 있음
//		URL url = new URL(resource);
//		is = url.openStream();
//		String file = url.getFile();
//		String ext = file.substring(file.lastIndexOf("."));
//		if (ext.contains("?")) {
//			ext = ext.substring(0,ext.lastIndexOf("?"));
//		}
//		
//		String newFileName = "ex05" + ext;
//		
//		File dest = new File(newFileName);
//		
//		if (dest.exists()) {
//			dest.delete();
//		}
//		dest.createNewFile();
//		
//		fos = new FileOutputStream(dest);
		
		
		// 파일의 내용을 buf에 담는다. 0은 간격을 띄우는 크기, 1024는 버퍼의 크기
		// read()는 빨아들이고
		while (( i = is.read(buf, 0, 1024)) != -1) {	// -1 : EOF (End of File)
			// write()는 뱉는 느낌
			// buf에 담긴 내용을 새파일에 기록한다. 여백 0
			fos.write(buf, 0, i);	// i 만큼만 기록한다. 1024만큼 기록하지 않고, 읽어낸 만큼만 기록
			fos.flush();
			total += i;
			System.out.printf("%d / %d (%3d %%)\n",total, size, total *100/size);
		}
		fos.flush();
		fos.close();
		is.close();
		sc.close();
	}
}
