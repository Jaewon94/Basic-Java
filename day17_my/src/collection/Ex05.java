package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex05 {	
	public static void main(String[] args) {
		// Map : List의 index대신 key를 사용하는 구조
		
		// list는 index에 따라 서로 다른 값을 저장한다.
		// map은 key에 따라 서로 다른 값(value)을 저장한다.
		// key와 value가 1:1 mapping 되는 구조를 가지기 때문에 Map이라고 한다.
		
		// java.util.Map은 인터페이스이므로 생성자를 이용한 객체 생성이 불가능하다.
		// java.util.Map을 implement한 클래스 HashMap을 사용한다.
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("0", "10");		// list.add(10)
		map.put("1", "20");		// list.add(20)
		map.put("2", "ITBANK");		// list.add("ITBANK")
		map.put("3", "20");		// list.add(40)
		
		// list는 index의 값이 미리 정해져있으나
		// map의 key는 내가 원하는 이름으로 지정할 수있다.
		// key를 알면 value에 접근 할 수 있으나, value를 안다고 해서 key를 추적하지 못한다.
		
		System.out.println(map);
		System.out.println(map.get("0"));	// key: 0, value: 10
		System.out.println(map.get("1"));	// key: 1, value: 20
		System.out.println(map.get("20"));	// key: 20, value: null
		System.out.println(map.get("ITBANK"));	// key: "ITBANK", value: null
	
		// 서로 다른 변수, 데이터의 값들을 한번에 묶어서 처리할 때 주로 사용한다.
		String a = "Hello";
		String b = "World";
		String c = "Java";
		String d = "Http";
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("a", a);
		map2.put("b", b);
		map2.put("c", c);
		map2.put("d", d);
		
		System.out.println(map2);
		
		// map의 key는 중복을 허용하지 않는다.(Set은 중복을 허용하지 않는다.)
		// map의 key들을 Set으로 받을 수 있다.
		Set<String> keySet = map2.keySet();
		
		for(String key : keySet) {
			// key를 알면 value에 접근할 수 있다.
			String value = map2.get(key);
			System.out.printf("%s : %s\n", key, value);
		}
		System.out.println();
		
		// Iterator : 여러 값을 순서대로 한번씩 조회하기 위해 사용하는 클래스
		Iterator<String> keys = keySet.iterator();
		
		while(keys.hasNext()) {	// 아직 처리하지 않은 값이 하나라도 남아있다면
			String key = keys.next(); 		// 그 다음 key를 하나 가져와서
			String value = map2.get(key);	// key를 이용하여 value를 구한다.
			System.out.println(key + " : " + value);
			// key와 value를 출력한다.
			
		}
	}

}
