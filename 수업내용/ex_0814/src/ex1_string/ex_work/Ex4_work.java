package ex1_string.ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {

        // 키보드에서 입력받은 OX값을 계산하여 출력하기
        // ex) 입력 : ooxxo | o의 갯수에 따른 결과 : 4
        // o가 단개면 1, 붙어있으면 값이 증가, 떨어지면 값을 초기화

        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        String str = sc.next();

        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'o') {
                cnt++;
            } else {
                cnt = 0; // 왜 사용하는지 생각해야한다.
            }

            sum += cnt;
            // 'o' 자체의 숫자가 증가하는 것을 생각하지 말고
            // 카운트로 증가하는 시점의 값을 서로 더하면 된다.
            // 정리 : 주체를 o로 잡지말고, cnt로 잡자.

        } // for

        System.out.println("o의 결과 : " + sum);

    }// main
}
