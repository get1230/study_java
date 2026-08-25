package ex7_work;

import java.util.Random;

public class UpdownSub {

    private int random = new Random().nextInt(50) + 1; // 여기서만 쓰기 위한 private
    private int count = 0;
    private boolean result = true;

    // 정답 판별 메서드
    public boolean check(int n) { // 불린으로 반환하는 check 메서드
        // check() 이곳에 값이 들어감

        count++; // 체크를 호출할 때마다 증가해라

        if (n < random)
            System.out.println("UP"); // 한 기능만 사용하여, {}괄호 생략!
        else if (n > random)
            System.out.println("DOWN");
        else {
            System.out.println(count + "회 만에 정답");
            result = false;
        }

        return result; // 결과를 check에 반환

    }//check

}// class
