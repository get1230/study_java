package ex4_super;

public class Child extends Parent {
    
    public Child(){ //생성자
        
        super(); // 자식클래스의 생성자 전에, 부모의 생성자가 먼저 만들어진다.
        System.out.println("자식클래스의 생성자");
        //ex) super();라고 순서를 바꾸면 오류가 난다.

        public int getNum()???

        public super.getNum();
    }
}
