package collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex06 {	
	// 함수가 값을 반환할 때, 여러개의 값을 동시에 반환해야 한다면 Map을 사용할 수 있다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sido, gugun, dong;
		
		System.out.println("주소1 입력 : ");
		sido = sc.nextLine();
		
		System.out.println("주소2 입력 : ");
		gugun = sc.nextLine();
		
		System.out.println("주소3 입력 : ");
		dong = sc.nextLine();
		
		HashMap<String, String> address = getAddressMap(sido,gugun,dong);
		
		for(String key : address.keySet()) {
			String value = address.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		System.out.printf("%s %s %s",address.get("시/도"),address.get("구/군"), address.get("동"));
		sc.close();
	}
	
	static HashMap<String, String> getAddressMap(String sido, String gugun, String dong){
		HashMap<String, String> address = new HashMap<String, String>();
		
		address.put("시/도", sido);
		address.put("구/군", gugun);
		address.put("동", dong);
		return address;
	}
}
