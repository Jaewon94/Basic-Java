package loop;



public class Ex04 {
	// throw : 받을 것을 가정하고 던지는 것
	// throws : 일단 던지고 보는 것
		
	public static void main(String[] args) throws Exception {
		// 사용자에 대한 입출력 (특히 입력)에 많이 발생할 수 있다.
		// 하드웨어 (CPU, Disk)등에 접근할 때 발생할 수 있다.
		
		String str = "";
		str += "You and I\n";
		str += "It's more than 'Like'\n";
		str += "L 다음 또 O 다음 난 yeah, yeah, yeah\n";
		str += "You and I\n";
		str += "It's more than 'Like' (like)\n";
		str += "What's after 'Like'?\n";
		
//		System.out.println(str);
		
		char[] arr = str.toCharArray();
		for (int i=0;i<arr.length; i++) {
			char ch = arr[i];
			System.out.print(ch);
			Thread.sleep(200); // 200 millisecond (0.2초)동안 CPU에게 대기 명령을 전달
		}
		
	}
}
