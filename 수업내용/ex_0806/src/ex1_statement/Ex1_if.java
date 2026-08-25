package ex1_statement;

public class Ex1_if {
    public static void main(String[] args) {

        // 제어문 - 프로그램의 흐름을 제어하는 문장
        // 분기문과 반복문으로 나뉜다
        // 분기문 : if, switch
        // 반복문 : for, while, do-while

        // if문
        // if(조건식){
        // 조건식이 참일 때, 실행되는 영역이 만들어진다.
        // }

        int n = 49;

        String str = "안녕하세요"; // 필요없으니 초기화 할때는, 지우지 않고 ""로 변경한다.

        if (n != 50) {
            str = "n은 50입니다";
        }

        // String은 쌍따옴표 안에 여러글자(문자열)를 저장하기 위한 자료형

        // 참이나 거짓으로만 나오는 것 -> 조건식
        if (n == 50) {
            str = "n은 50입니다";
        }

        if (n != 50) {
            str = "n은 50이 아닙니다";
        }
        System.out.println(str);
    }

}
