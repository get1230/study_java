package ex2_map;

import java.util.HashMap;
import java.util.Map;

public class Ex2_Map {
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<String, String>();

        map.put("id", "aaa");
        map.put("pw", "1111");
        map.put("name", "홍길동");

        System.out.println(map);
        System.out.println(map.get("id"));
        System.out.println(map.get("pw"));
        System.out.println(map.get("name"));

    }//main
}
