package collection;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		Random ran =new Random();
		
		// 중복없는 6개의 정수를 1 ~ 45 사이로 추출하여 크기에 맞게 오름차순 정렬하여 출력
		
		// 제네릭<> 안에는 원시자료형이 들어갈 수 없음
		HashSet<Integer> hs = new HashSet<Integer>();
		
		
		// 값을 넣어주는 반복문
//		for(int i=0; i<6; i++) {
//			int ranNum = ran.nextInt() % 45 +1;
//			
//			if (ranNum < 0) {
//			ranNum = -(ranNum);
//			}
//			hs.add(ranNum);
//		}
		
		while(hs.size() != 6) {
			int ranNum = ran.nextInt(45) + 1;
			System.out.println("뽑은 숫자 : " + ranNum);
			hs.add(ranNum);
		}
		
		System.out.println(hs);
		
		// 오름차순 정렬
		ArrayList<Integer> al = new ArrayList<Integer>(hs);
		al.sort(null);
		System.out.println();
		System.out.println("오름차순 정렬");
		System.out.println(al);
		
	
		
	}
}
