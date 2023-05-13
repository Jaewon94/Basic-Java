package vending;


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
	
	
	// 특정 함수 하나를 반환하는 함수
	public Product getProduct(int select) {
		select -= 1;
		Product product = null;
		for(int i= arr[select].length-1; i != 0; i++) {
			// 조건1 : 상품이 있어야 한다.
			// 조건2 : 상품의 가격이 넣은 돈보다 작거나 같아야한다.
			boolean flag1 = arr[select][i] != null;
			boolean flag2 = flag1 && arr[select][i].getPrice() <= money;
			if(flag2) {
				product = arr[select][i];
				arr[select][i] = null;
				money -= product.getPrice();
				break;
			}
		}
		return product;
	}
	
	public int getMinimumMoney() {
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
		int minimumPrice = getMinimumMoney();
		
		return this.money >= minimumPrice; 
	}
	
	public boolean isEnoughMoney() {
		return getMinimumMoney() <= money;
	}
}
