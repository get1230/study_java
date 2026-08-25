package ex1_string.ex_work;

import java.util.Random;
import java.util.Scanner;

import javax.script.ScriptContext;

public class Ex1_baseball {
    public static void main(String[] args) {

        /*  
        주제 : 컴퓨터가 생각한 숫자와, 내가 적은 숫자가 무엇인지 / 맞는지 확인
        <해야할 일>
        1) com이 중복되지 않는, 난수 3자리 자동생성한다
        2) 내가 숫자를 맞힐때까지, 맞히는 과정이 반복되어야한다. (반복횟수 모름 -> while) 
        3) 맞히는 과정에서 동일한 숫자가 있는지, 힌트를 주는 과정이 있다. (힌트 : strike || ball)
        4) 없다면 out으로 표시
        5) 맞다면 과정이 종료되며, 종료멘트를 출력해야한다.
        */

        Scanner sc = new Scanner(System.in);

        int[] com = new int[3]; 
        // stack에 정수 변수 com을 생성하고 heep에 방(index)3개를 생성한다.
        // 컴퓨터가 생성하는 값은 '난수'이며 3개를 표시할 것.
        // 방 번호는 0~2까지
        
        int[] user = new int[3];
        //난 왜 com과 같이 배열로 -> 배열이 편하다
        // 하지만 user.charAt(i)도 가능하다.


        outer: for (int i = 0; i < com.length; ) {
            // ★증감연산자가 어디갔지?
            // 방 번호(index)가 0부터 시작이기에~

            com[i] = new Random().nextInt(9) + 1;
            //중복되지 않는 난수 생성시작
            // * 랜덤을 통해 정수가 생성 -> com[i] 배열의 저장 -> 생성된 랜덤은 참조되지 않음

            // << ▼ 0 ~ 2번째 자리가 각각 중복값이 있는지 비교 ▼ >>
            for (int j = 0; j < i; j++) {
                // 무조건 첫 번째 자릿수를 출력하고 시작하기 위해서
                //                         \   /
                // j < i 로 표시함 첫번째는 (0 < 0) 실행불가.
                //                          ㅁ 
                // (j는 계속 다시 시작이기 때문에, com[i]를 com[j]로 계속 비교가능)

                if (com[i] == com[j]) {
                    continue outer;
                    // '참'이라면 안쪽 for(j)을 즉시 끝내고, 
                    // outer(lable)가 표시되어있는 반복문으로 돌아가서
                    // 바깥쪽 for(i)의 다음 차수로 넘어가자.

                }

            } // inner

            i++;
            // 만약 증감연산자가 inner보다 안쪽에 위치하면,
            // ★'중복값을 발견' -> '다시 만들어야지~' 할때 문제발생★
            // ★ 때문에, 중복확인 결과 false 일때 값이 증가. ★

        } // outer

        System.out.println("정답 : " + com[0] + com[1] + com[2]);
        

        int cnt = 0; // '반복 횟수'를 알기위한 변수 생성

        while (true) {

            cnt++; 
            // ①키보드로 입력하고
            // ②ball / strike 인지 판단하고
            // ③아니라면 다시 ①번으로 돌아가고
            // ④strike가 3일때, 종료되는 작업을
            // 몇 번 시도했어?

            System.out.print("입력(예123) : ");

            int number = sc.nextInt();

            user[0] = number / 100;
            user[1] = number / 10 % 10;
            user[2] = number % 10;
            // 소수점은 버려진다.
            // 내가 입력한 값을 배열에 넣는다.

            int strike = 0;
            int ball = 0;

            // '내 배열'과 '컴퓨터 배열'(난수)이
            // '볼 / 스트라이크 / 아웃' 중에 어떤것인지
            // 판단하기위한 작업 ▼

            for (int i = 0; i < user.length; i++) {

                for (int j = 0; j < user.length; j++) {

                    if (i == j) {
                        if (com[i] == user[j])
                            strike++; 
                        // 조건 : [①동일한 자리] [②동일한 숫자] 일 경우. 
                        // 스트라이크 카운터를 증가.

                    } else { //else 안에도 if를 두는구나;
                        if (com[i] == user[j])
                            ball++;
                        // 조건 : [①동일한 숫자] 일 경우만
                        // 볼 카운터를 증가.
                    }

                } // inner

            } // for uter
            // '볼' / '스트라이크' 여부 확인 끝

            // 정답처리
            if (strike == 3) {
                System.out.println("정답!! - " + com[0] + com[1] + com[2]);
                System.out.println(cnt + "회만에 클리어 하셨군요! 훌륭합니다!");
                break;

            } else {

                if (strike > 0 || ball > 0) {
                    System.out.printf(
                            "%d Strike, %d Ball 입니다. 다시 시도하셔야 겠군요.\n", strike, ball);

                } else {
                    System.out.println("OUT");
                }

            }

            System.out.println("--------------");

        } // while

    }// main
}
