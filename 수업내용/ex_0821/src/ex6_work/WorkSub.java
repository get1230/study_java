package ex6_work;

public class WorkSub {

    public boolean isPrime(int so) {

        int i = 2; // 초기식이 대채가능하다.

        for (; i <= so; i++) {

            if (so % i == 0)
                break;

        } // for

        if (i == so)
            return true;
        else
            return false;

    }
}
