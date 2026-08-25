package ex6_work;

import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {
        
        // 1부터 100까지의 숫자 중에서
        // 키보드에서 입력받은 수 보다 큰 첫번째 3의 배수를 찾아 출력
        // ex) 입력 : 20 -> (20보다 큰 첫번째 3의 배수) : 21

        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        int sibal = sc.nextInt();
        

        for (int i = 1; i <= 100; i++) {

            if (i > sibal && i % 3 == 0) {
                System.out.println(i);
                break;
            }
        
        }




    }//main
}
