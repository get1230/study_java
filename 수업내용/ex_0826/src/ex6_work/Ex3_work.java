package ex6_work;

import java.util.ArrayList;
import java.util.List;

public class Ex3_work {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //20 이상 40 이하 값 출력
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 20 && list.get(i) <= 40) {
                System.out.println(list.get(i));
            }
        }

    }//main
}
