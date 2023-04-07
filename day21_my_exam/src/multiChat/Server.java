package multiChat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Scanner;

class Session implements Runnable {
	
	private PrintWriter pw;
	private Scanner sc;
	private InetAddress inetAddress;
	static ArrayList<Session> list = new ArrayList<>();
	
	public Session(Socket so) {
		 try {
			pw = new PrintWriter(so.getOutputStream());
			sc = new Scanner(so.getInputStream());
			inetAddress = so.getInetAddress();
			list.add(this);	// 만들어진 세션 자기 자신을 리스트에 추가한다
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	Session() {
		this.pw = new PrintWriter(System.out);
		try {
			inetAddress = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public PrintWriter getPrintWriter() {
		return pw;
	}
	
	@Override
	public void run() {
		String msg;
		while(true) {
			msg = sc.nextLine();	// 한명의 클라이언트에게 메시지를 전달받아서
			for(Session session : Session.list) {	// 리스트에 저장된 모든 출력요소에 전달한다
				session.getPrintWriter().println(msg);
				session.getPrintWriter().flush();
			}
			if(msg.equals("exit")) {
				break;
			}
		}
		try { pw.close(); } catch(Exception e) {}
		list.remove(this); 	// 접속을 종료하면 pw를 close하고, 자기자신을 리스트에서 제거한다
	}

	@Override
	public String toString() {
		return inetAddress.toString() + " 세션";
	}
}

// 서버는 클라이언트들을 연결해주는 중개역할
public class Server {
	
	// 서버 컴퓨터의 IP 중에서 가상 IP이거나 루프백 IP를 제외한 실제 IP를 찾아주는 메서드
	private static String getLocalServerIp() {
		try	{
		    for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements();)  {
		        NetworkInterface intf = en.nextElement();
		        for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements();)  {
		            InetAddress ia = enumIpAddr.nextElement();
		            if (!ia.isLoopbackAddress() && !ia.isLinkLocalAddress() && ia.isSiteLocalAddress()) {
		            	return ia.getHostAddress();
		            }
		        }
		    }
		}
		catch (SocketException ex) {}
		return null;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String localIP = getLocalServerIp();
		ServerSocket ss;
		Socket so;
		int port = 7777;
		Session session;

		try {
			
			ss = new ServerSocket(port);	// 서버 개설
			System.out.printf("서버 아이피는 [%s] 입니다\n", localIP);
			
			// 서버도 채팅내용을 보고 싶다
			Session.list.add(new Session());
			
			while(true) {
				System.out.println("접속 대기중...");
				so = ss.accept();
				session = new Session(so);
				Thread th = new Thread(session);
				th.start();
				
				System.out.println("현재 접속 인원 : " + Session.list.size());
				
				Session.list.forEach(System.out::println);
				System.out.println();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
		
	}
}
