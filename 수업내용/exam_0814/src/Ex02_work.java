import java.util.Scanner;

public class Ex02_work {
    public static void main(String[] args) {

        // 1 ~ 12월 사이의 값을 키보드에서 입력
        // 입력된 값에 해당하는 달이 몇일까지 있는지 출력
        // ex) 월 : 3 | 3월은 31일까지 있습니다.

        Scanner sc = new Scanner(System.in);

        System.out.print("1 ~ 12월 사이의 값을 입력하세요 : ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("%d월은 31일까지 있습니다.",month);
                break;

            case 2:
                System.out.printf("%d월은 28일까지 있습니다.", month);
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("%d월은 30일까지 있습니다.", month);
                break;

                default :
                System.out.println(month + "월은 존재하지 않습니다.");
                break;

        }// switch

    }// main
}
