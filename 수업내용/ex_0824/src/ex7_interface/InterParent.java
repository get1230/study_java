package ex7_interface;

public interface InterParent {
    // 인터페이스의 구성
    // 접근제한자           인터페이스명
    // public interface InterParent{
    // 상수
    // 추상메서드
    //}

    final int VALUE = 100; 
    // 처음 값을 입력한 후에, 상수는 값이 고정 (나중에 바꿀 수 없음)
    // 상수는 대문자로 만든다
    abstract int getValue();
    
}

// 인터페이스의 약속, abstract 및 상수만 사용가능