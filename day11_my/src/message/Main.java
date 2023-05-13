package message;

import java.util.Scanner;

class Message{

	String content;
	
	Message(String content) {

		this.content = content;
	}
}

class Phone {
	String name;
	String fnum;
	Message msg;
	String sendNum;
	Phone(String name, String fnum){
		this.name = name;
		this.fnum = fnum;
	}
	
	void sendMessage(Phone[] net, String target, Message msg){
		
		if(searchNum(net, target)){
			for (int i=0;i<net.length;i++) {
				if (target.equals(net[i].fnum)) {
				net[i].msg = msg;
				net[i].sendNum = fnum;
				break;
				} 
			} 
			
		} else {
			System.out.println("입력하신 전화번호가 없습니다.");
		}
	}
	
	void showMsg() {
		if (msg == null) {
			System.out.printf("[%s의 화면]\n",fnum);
			System.out.printf("메시지가 없습니다.\n\n");
		} else {
			System.out.printf("[%s의 화면]\n",fnum);
			System.out.printf("%s : %s\n\n",sendNum, msg.content);
		}
	}
	
	boolean searchNum(Phone[] net, String num) {
		for (int i=0;i < net.length;i++) {
			if (num.equals(net[i].fnum)) {
				return true;
			}
		}
		return false;
		
	}
}

public class Main {
	public static void main(String[] args) {
		Phone p1 = new Phone("p1", "010-1111-1111");
		Phone p2 = new Phone("p2", "010-2222-2222");
		Phone[] network = new Phone[] {p1, p2};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("[%s] 메시지를 보낼 대상의 전화번호를 입력 : ",p1.name);
		String targetNumber = sc.nextLine();		// 010-2222-2222
		
		System.out.printf("[%s]이 보낼 메시지를 입력 : ",p1.name);		
		String content = sc.nextLine();				// 아무 내용
		
		Message message = new Message(content);
		
		p1.sendMessage(network, targetNumber, message);
		// p1이 p2에게 메시지를 보내면
		// p2에서 메시지를 받았을 때, 보낸 사람의 번호와 받은 메시지의 내용을 출력
		

		p2.showMsg();
		
		System.out.printf("[%s] 메시지를 보낼 대상의 전화번호를 입력 : ",p2.name);
		targetNumber = sc.nextLine();
		System.out.printf("[%s]이 보낼 메시지를 입력 : ",p2.name);		
		content = sc.nextLine();				// 아무 내용
		message = new Message(content);
		p2.sendMessage(network, targetNumber, message);
		
		p1.showMsg();
		sc.close();
	}
}
