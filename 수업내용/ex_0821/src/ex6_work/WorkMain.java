package ex6_work;

import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {

        // 정수 : 9
        // 9은(는) 소수가 아닙니다.

        // 정수 : 7
        // 7은(는) 소수입니다.

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 : ");
        int so = sc.nextInt();

        WorkSub ws = new WorkSub();
        boolean res = ws.isPrime(so);

        if (res) // res== true ?? 묻는 것
            System.out.println(so + "은 소수");
        else
            System.out.println(so + "은 안소수");

    }
}
