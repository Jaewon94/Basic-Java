package tv_모범;


public class TV {
	// 속성 : 전원, 채널, 음략, TV이름
	
	private boolean power;
	private int channel =2;
	private int volume;
	private int mute;
	private static final int MAX_CHANNEL = 20;
	private static final int MIN_CHANNEL = 2;
	private static final int MAX_VOLUME = 10;
	private static final int MIN_VOLUME = 0;

	// 기능 : 전원 온오프, 채널 올림/내림, 음량 올림/내림, 음소거
	public boolean onoff() {
		this.power= !power;
		show();
		return power;
	}
	
	// boolean타칩의 getter는 is 혹은 has 혹은 can을 사용
	public boolean isPower() {
		return power;
	}
	
	public int channeelUP() {
		if(power) {			// 전원이 켜져 있다면
			channel++;		// 채널의 값을 1 증가
			show();		
			if(channel > MAX_CHANNEL) {	// 만약, 채널의 값이 최대채널을 초과하면
				channel = MIN_CHANNEL;	// 최소 채너로 값을 새로 대입
				
			}
		}
		return channel;
	}
	
	public int channeelDown() {
		if(power) {			// 전원이 켜져 있다면
			channel--;		// 채널의 값을 1 감소
			show();	
			if(channel < MIN_CHANNEL) {	// 만약, 채널의 값이 최소채널 미만이면
				channel = MAX_CHANNEL;	// 최대 채널로 값을 새로 대입
			}
		}
		return channel;
	}
	
	public int volumeUp() {
		if(power) {			// 전원이 켜져 있다면
			volume++;		// 볼륨의 값을 1 증가
			show();	
			if(volume > MAX_VOLUME) {	// 만약, 볼륨의 값이 최대음량을 초과하면
				volume = MAX_VOLUME;	// 최대음량을 볼륨 값으로
			}
		}
		return volume;
	}
	
	public int volumeDown() {
		if(power) {			// 전원이 켜져 있다면
			volume--;		// 볼륨의 값을 1 감소
			show();	
			if(volume > MIN_VOLUME) {	// 만약, 볼륨의 값이 최소음량을 미만이면
				volume = MIN_VOLUME;	// 최소음량을 볼륨 값으로

			}
		}
		return volume;
	}
	
	public boolean mute() {
		int tmp = volume;
		volume = mute;
		mute = tmp;
		show();	
		return mute != 0;
	}
	
	public void show() {
		if (power) {
			System.out.println("=========================");
			System.out.println("      <현재 TV상태>");
			System.out.println("┌────────────────────┐");
			System.out.printf("│          ch : %3d  │\n",channel);
			System.out.printf("│         vol : %3d  │\n",volume);
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
}
