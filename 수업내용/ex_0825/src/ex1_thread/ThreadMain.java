package ex1_thread;

public class ThreadMain {
    public static void main(String[] args) {
        
        ThreadSub ts = new ThreadSub();
        ts.start(); //스레드를 동작하는 메서드

        try{
            Thread.sleep(1500);
        }catch(Exception e){

        }

        System.out.println("main 스레드가 종료되었어요.");


    }//main
}
