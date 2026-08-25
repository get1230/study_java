package ex2_inheritance;

public class Snake extends Animal {

    String merit = "밤에도 잘 봄";

    // 오버라이드 : 메서드의 재정의
    // 상속관계의 객체에서 부모의 함수를 자식이 가져와
    // 자식 사정에 맞도록 내용만 "재정의 하는 것"
    @Override
    public int getLeg() {
        return 0;
    }
}

// 오버라이드 : 부모가 가진 껍데기 메서드만 가져와서
// 자식한테 재정의한다.