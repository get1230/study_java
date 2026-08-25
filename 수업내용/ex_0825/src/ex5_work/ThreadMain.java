package ex5_work;

public class ThreadMain {
    public static void main(String[] args) {
        
        // 배열 arr에 담긴 값의 합(sum)을 A스레드가 계산
        // arr에 담긴 값의 곱(X)을 B스레드가 계산해서 출력
        // ------------------------
        // 합 : 29
        // 곱 : 3960

        // 곱 : 3960
        // 합 : 29
        

        ThreadSub1 ts1 = new ThreadSub1();
        ThreadSub2 ts2 = new ThreadSub2();

        ts1.start();
        ts2.start();


    }//main
}
