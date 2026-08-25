import java.util.Scanner;

public class Ex03_work {
    public static void main(String[] args) {

        // 수1 : 10
        // 수2 : 20
        // 연산자 : +
        // 10 + 20 = 30

        int su1 = 0;
        int su2 = 0;
        int res = su1 + su2;

        String yeon = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("수1 :");
        int su1 = sc.nextInt();

        System.out.print("수2 :");
        int su2 = sc.nextInt();

        System.out.print("연산자 : ");
        String yeon = sc.next();

        switch (yeon) {

            case "+":
                break;

            case "-":
                break;

            case "*":
                break;

            case "/":
                break;

                default:
                    System.out.println("연산자 입력 오류");                                                                                    

        }

        System.out.println(su1 + "+" + su2 + "=" + res);

    }// main
}
