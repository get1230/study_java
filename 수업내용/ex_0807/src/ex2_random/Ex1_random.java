package ex2_random;

import java.util.Random;

public class Ex1_random {
    public static void main(String[] args) {

        // 문제1. 2 ~ 5 사이의 난수
        int num = new Random().nextInt(4) + 2;
        // '시작의 숫자 : 2' 와 '(난수의 범위: 2,3,4,5 )'를 기재
        System.out.println(num);

        // 문제2. 7 ~ 13 사이의 난수 : 바운드가 7 / 시작의 수가 7
        // 문제3. 216 ~ 1378 사이의 난수
        // int num = new Random().nextInt(1378 - 216 + 1) + 216 ;

        // (범위 구하는 공식 : "큰수 - 작은수 + 1")

        // 문제4. 2 ~ 9 사이의 난수에 해당하는 구구단 (if가 없어도 되네?)
        int dan = new Random().nextInt(8) + 2;

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + "*" + i + "=" + (dan * i));
        } // for

    }// main
}
