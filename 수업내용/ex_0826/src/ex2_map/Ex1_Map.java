package ex1_set.ex2_map;

import java.util.HashMap;
import java.util.Map;

public class Ex1_Map {
    public static void main(String[] args) {

        // map : 대량의 데이터 중에서 원하는 키값만 알면, 값을 꺼내오는 속도가 매우 빠르다.
        // key , value
        Map<Integer, Character> map = new HashMap<>();
        map.put(10, 'A');
        map.put(11, 'C');
        map.put(12, 'A');
        map.put(10, 'D'); // key값이 중복되면, 마지막값이 갱신된다.
        System.err.println("size : " + map.size()); // set처럼 size가 곶이곶대로 늘어나지 않는다.

        char res = map.get(11);
        System.out.println(res);

        System.out.println("map : " + map); // index가 없기에, 바로찍을 수 있다.

        if (map.containsKey(10)) {
            System.out.println("map에 key가 10인 데이터가 있음");
        }

        if( map.containsValue('A')){
            System.out.println("map에 A가 저장되어 있음");
        }

    }// main

}
