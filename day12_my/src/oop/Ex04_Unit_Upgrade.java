package oop;

class Marine{
	// static은 여러 객체가 공유하는 요소
	static String name = "Marine";
	static int atk = 5;
	static int def = 0;
	
	// non-static은 객체마다 서로 다른 값을 가질 수 있는 요소
	int hp = 40;
	
	void atk(Ultralisk target) {
		target.hp -= (atk - Ultralisk.def);
	}
	static void upgradeAtk() {
		if(atk <8) {
			atk +=1;
			System.out.println("Upgrade Complete");
			return;
		}
		System.out.println("더 이상 업그레이드 할 수 없습니다.");
	}
}

class Ultralisk{
	static String name ="Ultralisk";
	static int atk = 20;
	static int def = 2;
	int hp = 400;
}

public class Ex04_Unit_Upgrade {
	public static void main(String[] args) {
		Ultralisk mob = new Ultralisk();
		Marine player = new Marine();
		
		System.out.println("1. 노공업 마린은 몇번 공격해야 울트라를 잡는가?");
	
		int cnt=0;
		while(mob.hp >0) {
			player.atk(mob);
			cnt++;
		}
		
		System.out.println("cnt : "+ cnt);
		
		System.out.println("2. +1 공업한 마린은 몇번 공격해야 울트라를 잡는가?");
		Ultralisk mob2 = new Ultralisk();
		Marine.upgradeAtk();
		cnt=0;
		while(mob2.hp >0) {
			player.atk(mob2);
			cnt++;
		}
		
		System.out.println("cnt : "+ cnt);
		
		System.out.println("3. +2 공업한 마린은 몇번 공격해야 울트라를 잡는가?");
		Ultralisk mob3 = new Ultralisk();
		Marine.upgradeAtk();
		cnt=0;
		while(mob3.hp >0) {
			player.atk(mob3);
			cnt++;
		}
		
		System.out.println("cnt : "+ cnt);
		
		System.out.println("4. +3 공업한 마린은 몇번 공격해야 울트라를 잡는가?");
		Ultralisk mob4 = new Ultralisk();
		Marine.upgradeAtk();
		cnt=0;
		while(mob4.hp >0) {
			player.atk(mob4);
			cnt++;
		}
		
		System.out.println("cnt : "+ cnt);
		
		System.out.println("5. 새로 생성한 마린의 공격력과 기존 마린의 공격력은 각각 얼마인가?");
		
		System.out.println("기존 마린의 공격력 : "+player.atk);
		
		Marine player2 = new Marine();
		
		System.out.println("신규 생성한 마린의 공격력 : " + player2.atk);
		
		Marine.upgradeAtk();
		
		
	}
}
