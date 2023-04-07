package vendingMachine_모범;



// 여러 상품을 보관하고 기능이 포함된 클래스
// 여러 상품을 저장하기 위한 배열(상품 트레이)이 포함됨
// 최대한 배열을 사용해서 만들어보기 (리스트, 맵 같은 아직 안배운 내용은 X)
public class Machine {
	private Product[] tray1 = new Product[5];
	private Product[] tray2 = new Product[5];
	private Product[] tray3 = new Product[5];
	private Product[] tray4 = new Product[5];
	private Product[][] arr = {tray1, tray2, tray3, tray4};
	private int money;
	
	public Machine() {
		for(int i = 0; i < tray1.length; i++) {
			tray1[i] = new Product("콜라", 800);
		}
		for(int i = 0; i < tray2.length; i++) {
			tray2[i] = new Product("사이다", 700);
		}
		for(int i = 0; i < tray3.length; i++) {
			tray3[i] = new Product("게토레이", 900);
		}
		for(int i = 0; i < tray4.length; i++) {
			tray4[i] = new Product("비타500", 500);
		}
	}
	
	private int countOfTray(Product[] tray) {
		int count =0;
		for(int i=0; i<tray.length;i++) {
			if(tray[i] != null) {
				count++;
			}
		}
		return count;
	}
	
	public void show() {
		System.out.printf("%s (%d개)\n",tray1[0].toString(),countOfTray(tray1));
		System.out.printf("%s (%d개)\n",tray2[0].toString(),countOfTray(tray2));
		System.out.printf("%s (%d개)\n",tray3[0].toString(),countOfTray(tray3));
		System.out.printf("%s (%d개)\n",tray4[0].toString(),countOfTray(tray4));
	}
	
	public int getMinimumMoney(int money) {
		int minimumPrice = 99999999;
		for (int i=0; i <arr.length; i++) {	//tray1, tray2, tray3, tray4
			for(int j=0; j< arr.length;j++) {
				if(arr[i][j] != null && arr[i][j].getPrice() <minimumPrice) {
					minimumPrice = arr[i][j].getPrice();
				}
			}
		}
		return minimumPrice;
	}
	
	public boolean inputMoney(int money) {
		this.money += money;
		int minimumPrice = getMinimumMoney(money);
		
		return this.money >= minimumPrice; 
	}
	
	public void choice(String menu, int money) {

		while (money >= tray4[0].getPrice()) {
			switch (menu) {
			case "1":
			case "콜라":
				if(money >= tray1[0].getPrice() && tray1 != null) {
					for (int i=tray1.length-1;i >= 0;i--) {
						if (tray1[i] != null) {
							tray1[i] = null;
							break;
						}
					}
					System.out.printf("남은 돈 : %d원\n",(money -tray1[0].getPrice()));
				} else {
					System.out.println("현재 상품이 없습니다.");
				}
				
				break;
			case "2":
			case "사이다":
				if(money >= tray2[0].getPrice() && tray2 != null) {
					for (int i=tray2.length-1;i >= 0;i--) {
						if (tray2[i] != null) {
							tray2[i] = null;
							break;
						}
					}
					System.out.printf("남은 돈 : %d원\n",(money -tray2[0].getPrice()));
				} else {
					System.out.println("현재 상품이 없습니다.");
				}
				
				break;
			case "3":
			case "게토레이":
				if(money >= tray3[0].getPrice() && tray3 != null) {
					for (int i=tray3.length-1;i >= 0;i--) {
						if (tray3[i] != null) {
							tray3[i] = null;
							break;
						}
					}
					System.out.printf("남은 돈 : %d원\n",(money -tray3[0].getPrice()));
				} else {
					System.out.println("현재 상품이 없습니다.");
				}
				
				break;
			case "4":
			case "비타500":
				if(money >= tray4[0].getPrice() && tray4 != null) {
					for (int i=tray4.length-1;i >= 0;i--) {
						if (tray4[i] != null) {
							tray4[i] = null;
							break;
						}
					}
					System.out.printf("남은 돈 : %d원\n",(money -tray4[0].getPrice()));
				} else {
					System.out.println("현재 상품이 없습니다.");
				}
				
				break;
	
			default:
				System.out.println("없는 상품입니다. 돈을 반환합니다.");
				System.out.println("거스름돈 : "+money);
				break;
			}
			
		}
	}
}
