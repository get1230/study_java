package ex_work;

import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        TimerSub ts = new TimerSub();
        ts.start();

        int correct = 0;

        while (true) {
            System.out.print("1 + 1 = ");
            int answer = sc.nextInt();

            if (answer == 2) {
                correct++;
                System.out.println("정답");
            } else {
                System.out.println("오답");
            }

            System.out.println("정답 개수 : " + correct);
        }

    }//main
}
