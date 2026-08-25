package ex5_label;

public class Ex1_label {
    public static void main(String[] args) {

        // 특정 '반복문'에 Label을 붙여 (*제어문에는 붙일 수 없다.)
        // 한 번에 두 개 이상의 반복문을 제어할 수 있다.

        out: for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 10; j++) {

                if (j % 2 == 0)
                    break out; // 조건이 참이면, out : for를 빠져나가기 때문에, 현재 실행할 것이 없어서 안찍힘

                System.out.println(j + " ");

            } // in

            System.out.println();

        } // out

    }// main
}
