package ex1_string.ex_work;

import java.util.Scanner;

public class Ex6_work_my {
    public static void main(String[] args) {

        // 문장을 입력하세요 : abcab
        // 결과 : abc
        // res = "abcabc"
        // res.indexOf('f') -> -1

        Scanner sc = new Scanner(System.in);

        System.out.print("문장을 입력하세요 : ");
        String in = sc.next();
        String res = "";


        int cnt = 0;

        for (int i = 0; i < in.length(); i++) {

           char curr = in.charAt(i); //하나씩 걸러진다.

           if( res.indexOf(curr) == -1){ //이게 왜 참이지????????????????????
            
            res += curr; //res에 값이 채워지니까 for을 한번 더 돌릴 필요가 없구나!!
           }

            } // inner

        } // for

    }// main
}
