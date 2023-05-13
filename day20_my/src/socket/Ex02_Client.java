package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex02_Client {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Socket so = null;
		PrintWriter pw =null;
		String msg;
		try {
			so = new Socket("192.168.112.1",7777);
			
			//	여기는 보낼 타입에 따라(지금은 텍스트라 PrintWriter, 객체면 Object) (여기는 내보내는 빨대를 꼽겠다는 뜻)
			pw = new PrintWriter(so.getOutputStream());
			while(true) {
		
				System.out.print("서버에게 보낼 메시지 입력 : ");
				msg = sc.nextLine();
				
				// pw로 보낼 값이 object이면 writeObject
				pw.write("[Client] " + msg);
				pw.flush();
				if("종료".equals(msg)) {
					break;
				} 
			}
				System.out.println("종료했습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try { if(sc != null) sc.close();} catch(Exception e) {}
				try { if(so != null) so.close();} catch(Exception e) {}
			}
			
			
		}
	}

