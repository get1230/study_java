package ex2_statement;

public class Ex3_switch {
    public static void main(String[] args) {

        char name = '이';

        switch (name) {

            case '김':
                System.out.println("1000만");
                break;

            case '이':
                System.out.println("730만");
                break;

            case '박':
                System.out.println("419만");
                break;

            default:
                System.out.println("데이터가 없습니다");
                break;

            // break는 나가는 '시점'을 조절하며, break가 없다면 '}'에서 마무리 결과가 도출된다.
            // break의 유무에 따라, case를 신경쓰지 않고 내려가면서 break를 찾을 수 있다.

        }// switch

    }// main
}
