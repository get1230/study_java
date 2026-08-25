package ex1_string.ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        
        // 이메일 : abc@korea.com
        // 이메일 형식이 올바르지 않습니다.
        
        // 이메일 : aabbcc@n.com
        // aabbcc님 환영합니다

        Scanner sc = new Scanner(System.in);
        System.out.print("이메일을 입력해주세요 : ");

        String email = sc.next();

        String[] sp = email.split("@");
        
        // split : 스트링의 배열형태를 출력한다?
        // @를 기준으로 문자열을 앞뒤로 나누고(분할)
        // sp배열에 담는다 => 앞을 0번방 내용으로, 뒤를 1번방으로 내용 설정

        String res = sp[0];
                
        if( res.length() < 4 || res.length() > 8){
            System.out.println("이메일 형식이 올바르지 않음");
            
        }else{System.out.println(res + "님 환영합니다.");}

    }//main
}
