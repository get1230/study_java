package ex4_work;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        
        // ★주제 : 클래스 나누기(기능을)
        // 나눌경우 : 뒤집은 내용을 보내거나, 뒤집고 회문인지까지 판단까지

        Scanner sc = new Scanner(System.in);
        System.out.println("입력 : ");
        
        String str = sc.next(); //원본
    
        CheckWord cw = new CheckWord(); // 이게 메모리 할당 하는법
        //cw가 갖고있는 메서드 : check
        cw.check(str);
        
        
    
        if (str.equals(rev)){
            System.out.println(str + "은 회문");
        }else{System.out.println(str + "은 안회문");}
    
        
    }
}
