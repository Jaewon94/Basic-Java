package summary5;

// 인터페이스의 필드는 static final이므로
// 모든 객체가 공통으로 사용할 수 있는 불변의 값에 대해서만 사용한다.

// 그 외에 객체마다 다른값을 반드시 가져야 한다.

public interface Companion {
	
	String getName();

}
