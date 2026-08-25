package ex7_work;

import java.util.Scanner;

public class UpdownMain {
    public static void main(String[] args) {

        // 1~50사이의 난수를 발생시키고
        // 키보드에서 입력받은 정수를 난수와 비교하기
        // ------------------------
        // 정수 : 30
        // DOWN
        // 정수 : 15
        // UP
        // 정수 : 25
        // 3회 만에 정답
        Scanner sc = new Scanner(System.in);
        int select = 0; // 정답이라고 생각되는 숫자를 넣을 변수
        boolean check = false;

        UpdownSub us = new UpdownSub();

        // do - while : 선처리
        // 키보드 내용이 다르면 반복하도록 설정
        do {
            System.out.print("정수 : ");
            select = sc.nextInt(); //키보드 입력
            check = us.check(select);

        } while (check); // ("check == ture") 라는 뜻

    }// main
}
