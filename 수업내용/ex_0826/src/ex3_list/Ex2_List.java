package ex3_list;

import java.util.ArrayList;
import java.util.List;

public class Ex2_List {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>();

        list.add("홍길동");
        list.add("김길동");
        list.add("박길동");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }//main
}
