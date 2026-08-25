package ex3_scanner;

import java.util.Scanner;

public class Ex1_scanner {
    public static void main(String[] args) {

        // 키보드에서 값을 받기위한 scanner객체
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 :");
        int n = sc.nextInt(); // 앞에 정수에 넣어주는 코드
        System.out.println("값 :" + n);

        System.out.print("문자열 : ");
        String s = sc.next(); // 앞에 문자열에 넣어주는 코드
        System.out.println("값 : " + s);

    }// main
}
