package ex1_statement;

public class Ex3_else_if {
    public static void main(String[] args) {

        // 다중 if문 (else if)
        // 여러개의 조건 비교가 필요한 경우, 사용하는 if문

        // if(조건식 1){조건식 1이 참일 때, 실행되는 영역}
        // else if(조건식 2){조건식 2가 참일 때, 실행되는 영역}

        int num = 75;
        String str = "";
        char sta = ' ';
        // 중간에 참을 만난 시점으로, 뒤의 내용과 관계없이 결과를 도출한다.

        if (num >= 90) {
            sta = 'A';
        } else if (num > 80) {
            sta = 'B';
        } else if (num > 70) {
            sta = 'C';
        } else if (num > 60) {
            sta = 'D';
        } else if (num <= 59) {
            sta = 'F';
        }

        // 위의 조건식들이 모두 거짓일 때, 반드시 호출되는 영역
        System.out.println(sta);

        // 나이가 20이상 -> 성인요금
        // 14이상 20미만 -> 청소년요금
        // 8이상 14미만 -> 어린이요금
        // 8미만 -> 유아요금

        int age = 21;
        if (age >= 20) {
            str = "성인요금";
        } else if (age >= 14) {
            str = "청소년요금";

        } else if (age >= 8) {
            str = "어린이요금";

        } else if (age < 8) {
            str = "유아요금";
        }

        System.out.println(str);

    }// main

}
