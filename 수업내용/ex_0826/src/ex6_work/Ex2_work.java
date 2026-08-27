package ex6_work;

import java.util.ArrayList;
import java.util.List;

public class Ex2_work {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("kiwi");
        list.add("watermelon");

        //가장 긴 문자열 출력
        String max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (max.length() < list.get(i).length()) {
                max = list.get(i);
            }
        }

        System.out.println(max);

    }//main
}
