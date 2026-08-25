package EX_work;

import java.util.Random;

public class Ex3_work {
    public static void main(String[] args) {
       
        // A ~ Z 사이의 값 중 하나를 랜덤으로 출력

        int n = new Random().nextInt(90-65+1) + 65;
        System.out.println((char)n);

        int rnd = new Random().nextInt('Z' - 'A'+1) + 'A';
        
        // ★아스키코드의 활용
        // '문자끼리의 정수 형태를 변환'할 수 없기 때문에,
        //  강제로 int(정수형태)로 변환된다.
    }//main
}
