package ex8_homework;

import java.util.ArrayList;
import java.util.List;

public class Ex1_workmain {
    public static void main(String[] args) {
        
        List<String> arr = new ArrayList<String>();
        String[] data = {"apple", "banana", "orange", "kiwi"};

        WorkSub ws = new WorkSub(arr, data);
        ws.start();

        while (true) {
            System.out.println(arr);

            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }

    }//main
}
