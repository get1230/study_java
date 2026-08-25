package ex2_statement;

public class Ex1_switch {
    public static void main(String[] args) {
        // switch-case문
        // 비교값과 조건값을 통해서 원하는 결과를 얻어내기 위한 제어문
        // 1.정수(byte, short, int)
        // 2.문자열(String)
        // 3.문자 (char)

        // switch 사용법
        // (비교값)'{
        // case 조건값:
        // break; <-스위치문을 나가는 코드
        // }'
        // ★비교값과 조건값이 일치할 때 실행되는 영역 /(조건'값'은 범위설정이 불가하다)
        // *중복되는 조건값 불가.

        int n = 4;

        switch (n) { // (n : 비교값)

            case 1:
                System.out.println("게임시작");
                break;

            case 2:
                System.out.println("설정");
                break;
            case 3:
                System.out.println("종료");
                break;

            default:
                // 비교값과 일치하는 조건값이 하나도 없을 때
                // 반드시 호출되는 영역
                System.out.println("올바른 값을 입력하세요");
                break;

        }// switch

    }// main
}
