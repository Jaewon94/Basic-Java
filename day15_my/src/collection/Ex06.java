package collection;

import java.util.ArrayList;

public class Ex06 {
	public static void main(String[] args) {
		// 컬렉션 프레임워크 : 여러 데이터를 수집(모으기)하여 관리할 수 있는 클래스
		// 데이터를 어떤 형식으로 저장하냐에 따라서, 기능의 효율이 달라질 수 있다.
		
		// 기초적인 타입은 배열이지만, 배열의 단점을 극복한 여러 클래스들이 있어서
		// 이를 활용하는 방법을 익힌다.
		
		// 리스트 : 여러 데이터를 선형 구조에 배치한다. 보통 index를 이용하여 각 요소에 접근한다.
		
		// java.util.List은 인터페이스이다. 직접 객체를 생성할 수 없다.
		// java.util.List를 구현(implement)한 java.util.ArrayList를 사용한다.
		
		ArrayList t1 = new ArrayList();
		
		// 리스트는 길이가 고정적이지 않다. 멤버요소를 추가할 때마다 혹은 삭제할 때마다 유동적으로 변한다.
		System.out.println("리스트의 크기 :" +t1.size());
		
		// 요소를 추가하기 위해서는 add() 메소드를 사용
		t1.add(10);
		t1.add(20);
		t1.add("itbank");
		t1.add(20);
		
		System.out.println("리스트의 크기 :" +t1.size());
		// 리스트를 포함한 컬렉션은  toString이 오버라이딩 되어있다.
		System.out.println(t1);
		
		// 요소를 제거하려면 remove를 이용한다.
		// remove는 오버로딩 되어있다.
		// int를 전달하면 index로 식별하고, 지정한 위치의 값을 제거한다.
		// Object를 전달하면 지정한 객체를 찾아서 제거한다.
		t1.remove(1);			// 1번째의 값을 찾아서 제거한다.
		t1.remove("itbank");	// "itbank"라는 값을 찾아서 제거한다.
		System.out.println(t1);
		
		for(int i =0 ; i < t1.size(); i++) {
			System.out.println(t1.get(i));	// 리스트의 i번째 요소를 가져올 때 get(index)
		}
		System.out.println("리스트 요소 출력 끝");
	}
}
