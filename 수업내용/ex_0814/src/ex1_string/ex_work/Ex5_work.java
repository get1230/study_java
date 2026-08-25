package ex1_string.ex_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        
        // 영문장을 입력하세요 : HelloWorld
        // 내용 중에 홀수 번째 값들만 추출하세요.

        Scanner sc = new Scanner(System.in);
        
        System.out.println("영문장을 입력하세요 : ");
        String english = sc.next();

        String res = "";

        for(int i =0; i < english.length() ;i+=2){
            res += english.charAt(i);
        }//for

        /* 내가 작성하려고 한거.
        System.out.println("홀수 번째 영문자 : ");
        for(int i =0; i < english.length() ;i++){          
        if(int ?? ){
        System.out.println(??);
        } */

    }// main

    System.out.println(res);

    }

