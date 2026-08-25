package ex1_thread;

public class ThreadSub extends Thread {

    @Override  // 독립적인 형태로 실행하려 한다는 형태
    public void run() {
        // 프로세스의 독립적인 수행을 위한 영역
        for(int i =0 ; i < 10; i++){

            // 0.5초간 휴식 
            try{ // try를 안쓰면, 호출불가능
            Thread.sleep(500);
            }catch(Exception e){

            }
            
            System.out.println("스레드 실행중");


        }//for
        
    }
    
}//ThreadSub
