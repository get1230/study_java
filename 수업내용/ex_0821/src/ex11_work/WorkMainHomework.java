package ex11_work;

import java.util.Random;

public class WorkMainHomework {

    public static void main(String[] args) {

        // 문제 : PEALP
        // >> ealpp
        // ealpp 오답
        // >> apple
        // apple 정답!!

        String[] strArr = { "APPLE", "ORANGE", "HOPE", "VIEW" };
        // 랜덤으로 위치번호를 고르고, 안의 내용이 랜덤으로 변경되어 나온다

        int i = new Random().nextInt(4) + 0;
        System.out.println("정답 : " + strArr[i]);

        // j는 횟수(회차)이다.
        // 중복되지 않는 값을 랜덤으로 이어붙여야한다. (위치번호)
        // 이어붙이기 위해서는 문자열의 비교대상이 필요하다.

        // 문제 만들기 시작(랜덤)
        System.out.print("문제 : ");
        outer: for (int j = 0; j < strArr[i].length();) {
            // 랜덤으로 선택된 'i번째의 값(문자열)'의 길이 만큼 회전.
            // 이제 하나하나 뜯어서 이어붙일 것.
            // *아래 뜯는 과정에서 문제발생 시, 재시도 할 것임

            int k = new Random().nextInt(strArr[i].length() - 1) + 0;
            // 선택된 값(문자열)의 '위치번호를 랜덤'으로 지정하여
            // 무작위 순서로 이어붙이기 위함

            char[] ex = new char[strArr[i].length()];
            // 문자를 하나 하나 붙이기 위해, char를 이용하여 배열선언.
            // 크기 : 선택된 값

            for (; k < strArr[i].length();) {
                // 무작위 위치번호K는, "K가 속해있는 값의 길이만큼 회전할 것임"

                ex[j] = strArr[i].charAt(k);
                // 무작위 위치번호K는 char타입인 ex 배열에 0번부터 들어갈거임.

                if (ex[j] == ex[j - 1]) {
                    continue outer; // 위에서 저장된 배열안에 값은 0번부터 시작
                    // 이전 생성 값과 중복되면, 처음부터 다시 랜덤 생성시작.

                }
            } // inner

            System.out.print(ex[i] + " ");
            j++;
        } // outer

        // int cnt = 0;

        // while(true){

        // cnt++;

        // System.out.println("");

        // if( strArr[i] ){

        // }

        // }//while

    }
}
