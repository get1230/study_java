package ex4_work;

public class ThreadSub extends Thread {

    private int i;

    public ThreadSub(int i) {
        this.i = i;
    }
    // i는 "받아온 i값"으로 하단을 사용하려고.

    @Override
    public void run() { // 파라미터도 껍데기에 해당된다. (*부모한테 껍데기를 받으면 내용을 자유)

        for (; 0 <= i; i--) {
        try {

            Thread.sleep(1000);
           
                System.out.println(i);

            }catch (Exception e) {

            }
            
        }//for

    }

}
