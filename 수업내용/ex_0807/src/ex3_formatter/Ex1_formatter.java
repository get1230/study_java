package ex3_formatter;

public class Ex1_formatter {
    public static void main(String[] args) {

        // 제 나이는 20살입니다
        int age = 20;
        System.out.printf(
                "제 나이는 %d살입니다\n", age);
        // *f => 포메터의 줄임말
        // %d : 정수 타입
        // \n : 강제 엔터(개행)

        // 저는 20살이고 3층에 살아요

        System.out.printf(
                "저는 %d살이고 %02d층에 살아요\n", 20, 3);
                // % (02) d : 자리수에 맞춰 출력해라

                //나는 박씨야
                System.out.printf("나는 %c씨야\n", '박');

                // %c : 한 글자 (char 타입)

                // 나는 a형이야
                System.out.printf("나는 %C형이야\n", 'a');
                // %C(대문자) : 대문자 캐릭터 타입으로 바꿈

                //원주율 : 3.141592
                System.out.printf("원주율 : %.2f\n", 3.141592);
                // %f : 실수타입 
                // 자릿수 : .x (x는 숫자)

                //저는 홍길동입니다
                System.out.printf("저는 %s 입니다\n", "홍길동");
                // %s : 문자열

                System.out.printf("%s\t %d\t %d\n", "김윤",100,95);

                System.out.printf("%s\t %d\t %d\n", "김길동", 100, 7);
                // \t : Tap 키를 누른 효과

                // 오늘 강수량은 15%입니다.
                System.out.printf("오늘 강수량은 %d%%입니다", 15);
                // % 문자 작성법 : %%

    }// main

    /* 정리
    f = formatter
    \n / \t / %d / %c / %f / %s / %%

    
    */
}
