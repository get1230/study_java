package ex2_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        
        // 연산자는 키보드로
        // 수1 : 10
        // 수2 : 20
        // 연산자 : (?)
        // 10 + 20 = 30

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자1 : ");
        int n1 = sc.nextInt();
        
        System.out.print("숫자2 : ");
        int n2 = sc.nextInt();

        System.out.print("연산자 : ");
        String op = sc.next();

        switch(op){
            
            case "+":
                System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
                break;

               
                default:
                    System.out.println("연산자 오류");
                    break;
        }



    }// main
}
