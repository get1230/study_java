package ex1_string.ex_work;

import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args) {

        // 키보드에서 아무값이나 입력받는다
        // 입력받은 문자열에 소문자 a의 갯수를 출력
        // ex) 입력 : akjslkdja
        // a의 갯수 : 2

        Scanner sc = new Scanner(System.in);

        System.out.println("문자를 입력하세요 : ");
        String str = sc.next();

        int cnt = 0;

        for (int i = 0; i < str.length(); i++){ // length는 길이(크기)기 때문에, i(번호수)보다 하나 더 적어야한다.

            if (str.charAt(i) == 'a') {
                cnt++;

            }

        } // for

        System.out.println("a의 갯수 : " + cnt);

    }// main
}
