package ex1_statement;

public class Ex1_for {
    public static void main(String[] args) {

        // for문 : 특정 코드를 원하는 만큼 '반복'하고자 할 때
        // ★사용방법
        // for(초기식;조건식;증감식){
        // 조건식이 참일 때 수행되는 영역
        // (안에서 발생하는 '지역'변수)
        // }
        // 밖에서 사용하는 '전역'변수

        int k = 0;

        for (k = 0; k <= 2; k++) {

            System.out.println(k);

        } // for
          // ①초기식 -> ②조건식(참) -> ③출력 -> ④증감식 -> ⑤조건식 -> ⑥'참'이면 출력 / '거짓'이면 종료
          // 조건식이 '거짓이 나올 때까지 반복'한다.
          // *초기식은 없을 수 있다.

        // 문제 : 10 ~ 1까지 반복하는 for문

        for (int n = 10; n >= 1; n--) {

            System.out.println("결과 : " + n);
        } // for
        System.out.println("--------------");

        // 1~100까지 반복하는 for문을 만들되, 5의 배수만 출력

        for (int j = 100; j >= 1; j--) {

            if (j % 5 == 0) {
                System.out.println(j);
            }

        } // for
        System.out.println("-------------------");

        for (int i = 5; i <= 95;) {
            i += 5;
            System.out.println(i);

        }

    }// main
}
