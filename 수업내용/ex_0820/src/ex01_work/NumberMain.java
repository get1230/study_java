package ex01_work;

import java.util.Scanner;

public class NumberMain {
    public static void main(String[] args) {
        
        //값 : 100
        // 100은(는) 숫자입니까? true

        // 값 : abc123
        // abc123은(는) 숫자입니까? false
        // *숫자인지 아닌지를 클래스로 뺀다.

        Scanner sc = new Scanner(System.in);
        System.out.print("값 : ");
        String str = sc.next(); // int로 받을 수가 없다.

        NumberSub ns = new NumberSub();
        boolean res = ns.check(str); 
        //str을 보낸다, return(false or ture)받고싶으면 boolean변수로 받아야한다.

        System.out.println(str + "은 숫자입니까?" + res);
        //res 대신, ns.check(str) 도 가능

        

    }//main
}
