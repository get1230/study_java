package ex03_work;

import java.util.Scanner;

public class Atm { // 기능

    private int money;// 잔액
    // (atm기기 안에서만 돌아가기 때문에 private를 사용)

    // 입금
    public void deposit(int money) {
        System.out.println("입금성공");
        this.money += money; // this 지역변수

    }

    // 출금
    public void withdraw(int money) {

        if (this.money - money < 0) {
            System.out.println("잔액부족");
        } else {
            System.out.println("출금성공");
            this.money -= money;
        }
    }

    // 잔액확인
    public void balance() {
        System.out.println("잔액 : " + money);
    }

}// check
