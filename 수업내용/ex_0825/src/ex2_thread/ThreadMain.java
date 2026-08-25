package ex2_thread;

public class ThreadMain {
    public static void main(String[] args) {
        
        ThreadSub1 ts1 = new ThreadSub1();
        ThreadSub2 ts2 = new ThreadSub2();

        ts1.start(); //누가먼저 실행될지 알 수 없다.
        ts2.start(); // 각각 독립적인 개체

    }//main
}
