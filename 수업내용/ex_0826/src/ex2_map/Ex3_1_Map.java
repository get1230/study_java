package ex2_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3_1_Map {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("aaa", 1111);
        map.put("bbb", 2222);
        map.put("ccc", 3333);

        System.out.print("id : ");
        String id = sc.next();

        System.out.print("pw : ");
        int pwd = sc.nextInt();

        if (!map.containsKey(id)) {
            System.out.println("아이디가 없습니다.");
        } else if (map.get(id) == pwd) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
        }

    }//main
}
