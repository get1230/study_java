package ex_work;

import java.util.Scanner;

public class Ex1_work {public static void main(String[] args) {
    
    // 키보드에서 입력받은 값이 회문인지 판단
    // 회문 : 12321(회문수) | 오디오, 기러기
    // ex) 입력 : abcba | abcba은(는) 회문입니다.
    // ex) 입력 : abc | abc은(는) 회문이 아닙니다.

    Scanner sc = new Scanner(System.in);
    System.out.println("입력 : ");
    
    String str = sc.next(); //원본

    StringBuffer sb = new StringBuffer(str);

    // String rev = ""; //(경우1.) 원본을 뒤집어서 저장할 객체
    
    String rev = sb.reverse().toString();
    // (경우2)
    // reverse : 메모리에 새로 생성하지 않고 그 공간에서 뒤집음
    // 뒤집은 것을 문자열 형태로 처리하려면 .toString을 붙여야 한다.
    

    //★핵심★ (경우1.)
    // for(int i = str.length(); i >=0; i--){
    //     rev += str.charAt(i);
    // }//for

    if (str.equals(rev)){
        System.out.println(str + "은 회문");
    }else{System.out.println(str + "은 안회문");}


}//main
    
}
