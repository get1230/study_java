package ex5_static;

public class Bank {

    String branch;
    String phone;

    static float interest;

    Bank(String branch, String phone) {
        this.branch = branch;
        this.phone = phone;
    }

    void info() {
        System.out.println("지점 : " + branch);
        System.out.println("이자율 : " + interest);
        System.out.println("전화 : " + phone);
        System.out.println();
    }
}
