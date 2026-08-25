package ex1_string.ex_work;

import java.util.Scanner;

public class Ex6_work {
    public static void main(String[] args) {

        // 문장을 입력하세요 : abcab
        // 결과 : abc
        // res = "abcabc"
        // res.indexOf('f') -> -1

        Scanner sc = new Scanner(System.in);

        System.out.print("문장을 입력하세요 : ");
        String in = sc.next();
        String str = "";

        int i  = 0; // ★제일 중요!★ 왜 밖으로 나왔는지!
        
        for( ; i < str.length(); i++){
            char ch = str.charAt(i);

            if( ch < '0' || ch > '9'){
                break;
            }
        

    }//for

        if ( i == str.length() ){
            System.out.println(str + "은(는) 숫자임");
        }else{
            System.out.println(str + "은(는) 숫자가 아님");
        }

    }// main



