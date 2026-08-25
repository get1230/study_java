package ex3_nunable;

public class ThreadMain {
    public static void main(String[] args) {
        
        ThreadSub ts = new ThreadSub(); // 여기서 실행시키고 싶지만 스타트는 없고
        Thread t = new Thread(ts); // 실행은 못하지만 strat는 있으니, 합쳤다.
        
        t.start();
        
    }
}
