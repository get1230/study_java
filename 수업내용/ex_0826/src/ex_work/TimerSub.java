package ex_work;

public class TimerSub extends Thread {
    
    private int time;

    @Override
    public void run() {
        while (true) {
            time++;
            System.out.println("시간 : " + time);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
