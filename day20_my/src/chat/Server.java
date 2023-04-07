package chat;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Scanner;

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
		
		ServerSocket ss;
		Socket so;
		Scanner sc = new Scanner(System.in);

		System.out.println("현재 컴퓨터의 IP는 [" + getLocalServerIp() + "] 입니다");
		System.out.println("서버 생성. 접속 대기중...");
		
		try {
			ss = new ServerSocket(7777);
			so = ss.accept();
			
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
