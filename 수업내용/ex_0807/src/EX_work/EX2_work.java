package EX_work;

import java.util.Scanner;

public class EX2_work {
    public static void main(String[] args) {

        // 숙제2. 구구단
        // 키보드에서 입력받은 2~9사이의 값에 해당하는
        // 구구단을 출력
        // ---------------
        // 1) 단 : 10 -> 2~9 사이의 값을 입력하세요.
        // 2) 단 : 5 -> 5*1 = 5 / 5*2=10 .... / 2*5=10 ....

        Scanner sc = new Scanner(System.in);


        //예시 1 (포메터 적용)
        System.out.print("Goo Ku 단 : ");
        int dan = sc.nextInt();

        if (dan >= 2 && dan <= 9) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf( "%d * %d = %d\n", dan,i,(dan*i));}
        } else {
            System.out.println("2~9 사이의 값을 입력하세요.");
        }
        
        
        //예시 2 
        int dan = sc.nextInt();

        if (dan >= 2 && dan <= 9) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
        } else {
            System.out.println("2~9 사이의 값을 입력하세요.");
        }

        
    }// main
}
