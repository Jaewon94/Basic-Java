package abstractClass;

public class Ex06 {
	public static void main(String[] args) {
		
		Thread th1 = new Thread(() ->  {
			for(int i=0;i<25;i++) {
				System.out.print(i+" ");
			}
		});
		
		Thread th2 = new Thread(() -> {
			for(char i='A'; i<'Z';i++) {
				System.out.print(i+" ");
			}
		});
		
		th1.start();
		th2.start();
	}
}
