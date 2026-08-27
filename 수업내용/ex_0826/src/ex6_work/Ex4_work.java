package ex6_work;

import java.util.ArrayList;
import java.util.List;

public class Ex4_work {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list.add("yellow");

        String color = "green";
        int result = -1;

        //color가 몇 번째 index에 있는지 찾기
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(color)) {
                result = i;
                break;
            }
        }

        System.out.println(result);

    }//main
}
