package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class ClientOutput implements Runnable{
	
	private Socket so;
	private PrintWriter pw;
	private Scanner sc;
	
	public ClientOutput(Socket so,Scanner sc) throws IOException {
		this.so = so;
		this.sc = sc;
		pw = new PrintWriter(so.getOutputStream());
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			String msg = "";
			while(true) {
				System.out.print("보낼 메시지 입력 : ");
				msg = sc.nextLine();
				pw.println(msg);		// 한줄 단위로 처리
				pw.flush();
				if("exit".equals(msg)) {
					break;
				}
			}
			pw.close();
			try { so.close();} catch (Exception e) {}
		}
		
	}
	
}


public class Ex03_Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);
		String host,msg;
		int port = 7777;
		Socket so;
		Scanner server;
		
		System.out.print("접속할 서버의 아이피 입력 : ");
		host = sc.nextLine();
		
		so = new Socket(host, port);
		
		ClientOutput out = new ClientOutput(so, sc);
		Thread th = new Thread(out);
		th.start();
		server = new Scanner(so.getInputStream());
		
		while(true) {
			msg = server.nextLine();
			System.out.println(msg);
			if(msg.equals("exit")) {
				break;
			}
		}
		server.close();
		sc.close();
		so.close();
	}
}
