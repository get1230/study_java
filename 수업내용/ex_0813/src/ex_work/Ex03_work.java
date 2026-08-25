package ex_work;

import java.util.Scanner;

public class Ex03_work {
    public static void main(String[] args) {

        // 키보드에서 입력받은 값 보다 큰, 첫 번째 요소를 찾아 출력
        // ex) 입력 : 8 |
        int[][] arr = { { 1, 3, 4, 7 }, { 10, 2, 9, 3, 8 }, { 7, 4, 1 } };

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 기입하세요 : ");
        int son = sc.nextInt();

        out : for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (son < arr[i][j]) {
                     System.out.println( "큰 숫자는? : " + arr[i][j]);
                    break out; // 조건이 참이면, 큰 숫자를 표시하고 레이블이 표시된 포문까지 나가라
                    }
            } // inner

        } // outer

    }// main
}
