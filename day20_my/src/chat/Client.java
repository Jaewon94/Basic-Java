package chat;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		Socket so = null;
		String host;
		int port = 7777;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("접속할 서버의 주소 입력 : ");
		host = sc.nextLine();
		
		try {
			so = new Socket(host, port);
			Thread sender = new Thread(new ChatSender(so, sc));
			Thread reciver = new Thread(new ChatReciver(so));
			sender.start();
			reciver.run();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			sc.close();
		}
	}
}
