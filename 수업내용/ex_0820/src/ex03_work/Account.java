package ex03_work;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {

        /*
         * 잔액이 모자라는지...
         * 1. 입 금
         * 2. 출 금
         * 3. 잔액확인
         * ect.종 료
         * >>1
         * ----입금----
         * 입금액 : 1000
         * 입금성공
         * ------------
         * 1. 입 금
         * 2. 출 금
         * 3. 잔액확인
         * ect.종 료
         * >>3
         * ---잔액확인---
         * 1000원
         * -------------
         * 1. 입 금
         * 2. 출 금
         * 3. 잔액확인
         * ect.종 료
         * >>4
         * atm 사용을 종료합니다.
         */

        Atm atm = new Atm(); //①클래스를 선언하고
        Scanner sc = new Scanner(System.in); //②키보드로 입력하고

        while (true) { // (경우1.) outer : 
            //③atm기가 종료전까지(정해진 횟수x) 반복해서 묻는 과정

            System.out.println("1. 입    금");
            System.out.println("2. 출    금");
            System.out.println("3. 잔액확인");
            System.out.println("ect.종   료");
            System.out.print(">>>");

            int select = sc.nextInt();
            //④형식 + 버튼 번호
            
            int money = 0; // amt에 알려줘야하는 금액
            

            switch (select) {
                case 1:
                    System.out.println("---입금----");
                    System.out.print("입금 : ");
                    money = sc.nextInt();
                    atm.deposit(money);
                    break;

                case 2:
                    System.out.println("---출금---");
                    System.out.print("출금 : ");
                    money = sc.nextInt();
                    atm.withdraw(money);
                    break;

                case 3:
                    System.out.println("---잔액확인---");
                    atm.balance();
                    break;

                default:
                    System.out.println("atm사용을 종료합니다");
                    // break outer;(경우1.)
                    return;// void일 경우, 메인메서드 자체를 종료하고 값없이 돌아간다.

            }

            System.out.println("---------------------------");

        } // while

    }// main
}
