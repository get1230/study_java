package ex1_string;

import java.util.Scanner;

public class Ex1_string {
    public static void main(String[] args) {
        
        // 대문자 시작이면 '클래스'이다.
        // String 클래스의 두 가지 특징
        // 1) 객체 생성방법이 2가지다.(암시적, 명시적)
        // 2) 한 번 생성된 문자열의 내용은 변하지 않는다.

        String s1 = "abc"; // 첫글자 대문자인 클래스로 만들어진 변수는 '객체'이다.
        String s2 = "abc"; // 암시적 객체생성 
        String s3 = new String( "abc"); // 무조건 새로 집을 지을거고 그 안에 ("값") 값을 넣을거야
        String s4 = new String( "abc"); // 나도 명시적으로 만들거야.


        // 객체간 
        if (s1 == s2){
            System.out.println("같습니다.");
            }else{System.out.println("다릅니다.");
                        }

        Scanner sc = new Scanner(System.in);
        System.out.print("연산자 : ");
        String op = sc.next();

        if ( op == "+"){
            System.out.println("+연산 할께요");
        }
        

    }// main
}
