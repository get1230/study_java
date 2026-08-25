package EX_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {

        // 1부터 키보드에서 받은 값(n)까지의 합을 출력
        // ex) 입력 : 5, 결과 : 15
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        int n = sc.nextInt();
        int sum = 0;

        for (int a = 1; a <= n; a++) {
            sum += a;
        }
        System.out.println("결과 : " + sum);

        // 중요1). 결과를 합산하는 sum += a 를 기억하자!
        // 중요2). syso는 밖에 작성해야, 최종결과가 하나만 나온다.

    }// main
}
