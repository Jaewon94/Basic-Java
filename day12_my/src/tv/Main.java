package tv;

public class Main {
	public static void main(String[] args) {
		
		TV tv = new TV();
		
		tv.powerBtn(tv);
		
		tv.chUpBtn(tv);
		tv.chUpBtn(tv);
		tv.volChange(tv, -10);
		tv.chUpBtn(tv);
		
		tv.chChange(tv, 31);
		
		tv.tvState(tv);
		
		tv.chDownBtn(tv);
		tv.chDownBtn(tv);
		tv.volUpBtn(tv);
		tv.volChange(tv, 130);
		tv.volUpBtn(tv);
		tv.volUpBtn(tv);
		
		tv.chDownBtn(tv);
		tv.volDownBtn(tv);
		
		tv.tvState(tv);
		tv.muteOn(tv);
		tv.tvState(tv);
		tv.muteOff(tv);
		tv.tvState(tv);
		
		
		tv.volChange(tv, 10);
		
		tv.tvState(tv);
		
		tv.powerBtn(tv);
	}
}
