package ex2_while;

import java.util.Random;

public class Ex5_do_while {
    public static void main(String[] args) {

        // 자바, jsp, 안드로이드의 시험을 봤다.
        // 각 과목별 점수는 랜덤하게 0 ~ 130점이 대입
        //
        // 최종 결과를 화면에 출력
        // ex)----------------------------------
        // 자바 : 37 | jsp : 100 | 안드 : 13
        // 100을 초과하면 안됨 <=100

        int java = 0;
        int jsp = 0;
        int android = 0;

        do {

            java = new Random().nextInt(131);
            jsp = new Random().nextInt(131);
            android = new Random().nextInt(131);

        } while (java > 100 || jsp > 100 || android > 100);

        System.out.println("자바 : " + java);
        System.out.println("jsp : " + jsp);
        System.out.println("and : " + android);

    }
}
