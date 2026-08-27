package ex6_work;

import java.util.ArrayList;
import java.util.List;

public class Ex1_work {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //List에서 가장 큰 값을 찾아 출력
        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }

        System.out.println("최댓값 : " + max);

    }//main
}
