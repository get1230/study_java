package ex2_while;

import java.util.Scanner;

public class Ex1_while {
    public static void main(String[] args) {
        
        int num = 1;

        while (num <= 4 ) {
            System.out.println(num);
             num++;
            
        }//while

        System.out.println( " -------------");

        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("홀수 : ");
            int num2 = sc.nextInt();
            System.out.println(num2);
        
        } // while
        

    }//main
}

// while (조건식){}
// 조건을 먼저 보고, 조건이 참이면 반복
// 간단한 구성을 가진 반복문
// '비교(조건식이 참인지 거짓인지 확인) -> 후 처리(실행)' 의 반복