package chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import java.util.Scanner;

public class ChatSender implements Runnable {

	private Scanner sc;
	private Socket so;
	private PrintWriter pw;
	
	public ChatSender(Socket so, Scanner sc) {
		try {
			this.so = so;
			this.sc = sc;
			pw = new PrintWriter(so.getOutputStream());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		String name;
		String msg;
		System.out.print("채팅에 사용할 닉네임 입력 : ");
		name = sc.nextLine();
		
		while(true) {
			System.out.print("보낼 메시지 입력 : ");
			msg = sc.nextLine();
			pw.printf("\n%s] %s\n", name, msg);
			pw.flush();
			if(msg.equals("exit")) {
				break;
			}
		}
		pw.close();
		try { so.close(); } catch(Exception e) {}
	}
}
