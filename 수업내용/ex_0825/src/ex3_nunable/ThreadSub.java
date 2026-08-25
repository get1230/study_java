package ex3_nunable;

public class ThreadSub extends Thread {
    
    @Override
    public void run() {
        
        for (int i =0; i < 10; i++){
            try{
                Thread.sleep(500);
                System.out.println(i);

            }catch(Exception e){

            }

        }//for
    }
}
