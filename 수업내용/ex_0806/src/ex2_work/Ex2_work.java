package ex2_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {

        // 비교값으로 1~12월 사이의 값을 준비
        // 준비된 비교값에 해당하는 달이 몇일까지 있는지 출력

        // ex) 3월은 31일까지 있습니다.

        int month = 5;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "월은 31일까지");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "월은 28일까지");
                break;

            case 2:
                System.out.println("2월은 28일까지");
                break;

            default:
                System.out.println(month + "월은 없어요");
                break;
        }// switch
         // 설명할 수 있어야 한다!
         // ------------------------------------------------------------
         // 비교값으로 1~12월 사이의 값을 키보드에서 입력
         // 준비된 비교값에 해당하는 달이 몇일까지 있는지 출력

        // ex) 3월은 31일까지 있습니다.

        Scanner sc = new Scanner(System.in);

        System.out.print("월 : ");
        int mont = sc.nextInt();

        switch (mont) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(mont + "월은 31일까지");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(mont + "월은 28일까지");
                break;

            case 2:
                System.out.println("2월은 28일까지");
                break;

            default:
                System.out.println(mont + "월은 없어요");
                break;

        }// swith
    }// main
}
