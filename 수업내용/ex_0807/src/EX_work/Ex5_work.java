package EX_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        
        // 정수n1, n2를 입력받고, n1~n2 사이의 합을 출력
        // ex) 수1 : 2 | 수2 : 5 | 결과 : 14 이면서
        //     수1 : 5 | 수2 : 2 | 결과 : 14

        Scanner sc = new Scanner(System.in);
       
        System.out.print("수1 : ");
        int n1 = sc.nextInt();

        System.out.print("수2 : ");
        int n2 = sc.nextInt();
        
        int sum = 0;

        // n1과 n2의 값을 교환하는 공식
        if (n1 > n2){
            int n3 = n1;
            n1 = n2;
            n2 = n3;
        } // n3는 한 번만 쓰기 위해서, 지역변수로 사용했다.

        for(  ; n1 <= n2 ; n1++){
            sum += n1;
        }//for (작은 수를 먼저 받는 것)

        System.out.println("결과 : " + sum);


    }//main
    
}
