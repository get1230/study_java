package ex2_while;

import java.util.Scanner;

public class Ex2_while {
    public static void main(String[] args) {

        // 키보드에서 3을 입력받을 때까지 영원히 반복하는 while을 만들자
        // ex) {입력 : 1 | 값 : 1} {입력 : 2 | 값 : 2} {입력 : 3 | 값 : 3} 종료됨

        int i = 1;
        Scanner sc = new Scanner(System.in);

        while (i <= 3) {
            System.out.print("입력 : ");
            i = sc.nextInt();

            System.out.print("값 : ");
            
            i++;
            // ---------------------------------------------------
            // 강사님 것 ▼

            int num = 0;

            while (num != 3) {

                System.out.print("입력 : ");
                i = sc.nextInt();
                System.out.print("값 : " + num);
            
            } // while

            System.out.println( "종료됨");

        }

    } // main
}
