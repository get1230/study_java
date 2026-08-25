package ex9_work;

import java.util.Random;

public class WorkSub2 {

    Random rnd = new Random();

    public void myLotto(int[] lotto) {
                        //얉은 복사로 인한 원본 변경

        outer: for (int i = 0; i < lotto.length; ) {

            lotto[i] = rnd.nextInt(45) + 1;

            for (int j = 0; j < i; j++) {

                if (lotto[i] == lotto[j]) {
                    continue outer;
                }

            } // inner

            System.out.print(lotto[i] + " ");
            i++;

        } // for

    }

}
