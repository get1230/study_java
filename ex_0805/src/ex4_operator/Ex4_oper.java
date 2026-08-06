package ex4_operator;

public class Ex4_oper {
    public static void main(String[] args) {

        // 증감연산자
        // 1씩 증가시키거나 1씩 감소시키는 연산자
        // 선행증감과 후행증감의 차이를 알고 있어야한다.
        int a = 10;
        System.out.println("a:" + ++a);
        // 선행증감 (증가값을 먼저 적용한다.)

        int b = 10;
        System.out.println("b:" + b++);
        // 후행증감 (현재값을 그대로 적용한 후, 다음부터 증가값을 적용한다.)
        System.out.println(b);

        b++;
        ++b;
        --b;
        b++;
        --b;
        b++;
        System.out.println(++b);

    }// main
}// class
