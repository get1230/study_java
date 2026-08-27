package ex7_homework;

import java.util.ArrayList;
import java.util.List;

public class Ex1_work {
    public static void main(String[] args) {
        
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);

        //두 List의 공통 값 출력
        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                System.out.println(list1.get(i));
            }
        }

    }//main
}
