package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;
import java.util.NoSuchElementException;

public class ChatReciver implements Runnable {

	private BufferedReader br;
	private Socket so;
	
	public ChatReciver(Socket so) {
		try {
			this.so = so;
			br = new BufferedReader(new InputStreamReader(so.getInputStream()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		String msg;
		try {
			while(true) {
				msg = br.readLine();
				if(msg == null || msg.equals("exit")) {
					break;
				}
				System.out.println(msg);
			}
		} catch(NoSuchElementException | SocketException e) {
			System.out.println("종료됨");
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try { br.close(); } catch(Exception e) {}
			try { so.close(); } catch(Exception e) {}
		}
	}

}
