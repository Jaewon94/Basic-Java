package tv;

// TV의 객체를 생성하세요
// 클래스를 구성하세요

// 객체의 속성은 필드로 표현합니다.
// 객체의 기능은 메서드로 표현합니다.

// 필드는 보통 공개되지 않습니다.(private)
// 메서드는 보통 공개되어 있습니다.(public)
public class TV {
	
	// 필드
	private boolean power;
	// 채널은 100 넘으면 다시 1로
	private int ch;
	// 볼륨은 1 - 100까지
	private int vol;
	private static int savedVol;
	
	// 생성자
	public TV() {
		power = false;
		ch = 98;
		vol = 15;
	}
	
	// getter & setter 
	
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}


	
	// 메서드 
	public void powerBtn(TV tv) {
		if (!tv.power) {
			System.out.println("TV를 켭니다.");
			power = true;
			System.out.println("현재 채널 : " + ch);
			System.out.println("현재 음량 : " + vol);
			System.out.println();
		} else {
			System.out.println("TV를 끕니다.");
			power = false;
		}
	}
	
	public void chUpBtn(TV tv) {
		if (tv.ch<1 || tv.ch >= 100) {
			tv.ch = 1;
		} else {
			tv.ch++;
		}
		System.out.println("현재 채널 : "+ch);
	}
	
	public void chDownBtn(TV tv) {
		if (tv.ch < 1) {
			tv.ch = 100;
		} else {
			tv.ch--;
		}
		System.out.println("현재 채널 : "+ch);
	}
	
	public void chChange(TV tv, int ch) {
		if (ch <1 && ch > 100) {
			System.out.println("없는 채널 번호입니다.");
		} else {
			tv.ch = ch;
			System.out.println("현재채널 : "+ch);
		}
	}
	
	public void tvState(TV tv) {
		if (tv.power) {
			System.out.println("=========================");
			System.out.println("      <현재 TV상태>");
			System.out.println("┌────────────────────┐");
			System.out.printf("│          ch : %3d  │\n",tv.ch);
			System.out.printf("│         vol : %3d  │\n",tv.vol);
			for(int i=0;i<3;i++) {
				System.out.println("│                    │");
			}
			
			System.out.println("└────────────────────┘");
			System.out.println("        │   │         ");
			System.out.println("   ────────────────");
			System.out.println("=========================");
		} else {
			System.out.println("TV가 꺼져 있습니다.");
		}
	}
	
	public void volUpBtn(TV tv) {
		if (tv.vol >= 100) {
			System.out.println("최대 음량입니다.");
			tv.vol = 100;
			
		} else {
			tv.vol++;
		}
		System.out.println("현재 음량 : "+ vol);
	}
	
	public void volDownBtn(TV tv) {
		if (tv.vol < 1) {
			System.out.println("최소 음량입니다.");
			tv.vol = 1;
		} else {
			tv.vol--;
		}
		System.out.println("현재 음량 : "+ vol);
	}
	
	public void volChange(TV tv, int vol) {
		if (vol <1) {
			System.out.println("최소 음량(1)으로 설정합니다.");
			tv.vol=1;
		} else if(vol > 100) {
			System.out.println("최대 음량(100)으로 설정합니다.");
			tv.vol=100;
		} else {
			tv.vol = vol;
			System.out.println("현재 음량을  "+vol+"로 설정합니다.");
		}
	}
	
	public void muteOn(TV tv) {
		System.out.println("음소거 모드 On");
		tv.savedVol = tv.vol;
		tv.vol = 0;
	}
	
	public void muteOff(TV tv) {
		System.out.println("음소거 모드 Off");
		tv.vol = tv.savedVol;
	}
	
}
