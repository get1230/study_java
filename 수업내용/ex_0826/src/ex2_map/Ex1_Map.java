package ex2_map;

import java.util.HashMap;
import java.util.Map;

public class Ex1_Map {
    public static void main(String[] args) {
        
        //Map<K, V>
        //key와 value의 쌍으로 데이터를 저장하는 자료구조
        //key는 중복될 수 없고, value는 중복될 수 있다.
        //순서(index)가 없다.

        Map<String, Integer> map = new HashMap<String, Integer>();

        //Map에 데이터 추가
        map.put("홍길동", 20);
        map.put("김길동", 30);
        map.put("박길동", 40);
        map.put("홍길동", 50);

        System.out.println(map);

        //key를 통해 value를 가져온다.
        System.out.println(map.get("홍길동"));

        //Map의 크기
        System.out.println(map.size());

        //key가 존재하는지 확인
        System.out.println(map.containsKey("김길동"));

        //value가 존재하는지 확인
        System.out.println(map.containsValue(40));

        //데이터 삭제
        map.remove("김길동");
        System.out.println(map);

    }//main
}
