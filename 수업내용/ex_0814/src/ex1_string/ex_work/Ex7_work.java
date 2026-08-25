package ex1_string.ex_work;

import java.util.Scanner;

public class Ex7_work {
    public static void main(String[] args) {
        
        // 키보드에서 아무값이나 입력받고
        // 숫자인지 안닌지를 판단하기
        // ex) 값 : 123  *모든값은 next로 받아야한다.
        // 123은 숫자입니까? ture
        // 값 : a12 | a12은(는) 숫자입니까? false

        Scanner sc = new Scanner(System.in);
       
       System.out.print("값은 ? ");
        String sut = sc.next();

        int res = Integer.parseInt(sut); 
        

        if(Integer.parseInt(sut) == res ){
         System.out.println("값은 숫자입니다");
        }else{System.out.println("값은 숫자가 아닙니다.");}

    }//main
}
