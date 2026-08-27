package ex8_homework;

import java.util.List;
import java.util.Random;

public class WorkSub extends Thread {

    private List<String> arr;
    private String[] data;
    private Random rnd;

    public WorkSub(List<String> arr, String[] data) { // 메인에서 값을 보내줬어.
        // 메인에서 만든걸 굳이 넘겨볼라고 사용.
        this.arr = arr; // 얕은복사??
        this.data = data; // 주소값을 보내줬어
        rnd = new Random();
    }

    @Override
    public void run() {
        while (true) {
            int random = rnd.nextInt(data.length ); // 메인에서 받아온 값의 크기
            arr.add ( data[random]);

            try{
                Thread.sleep(3000);
            }catch (Exception e){
            }
        }
    }
}
