package ex3_list;

import java.util.ArrayList;
import java.util.List;

public class Ex1_List {
    public static void main(String[] args) {
        
        //List<E>
        //여러개의 데이터를 한꺼번에 저장할 수 있는 자료구조
        //순서(index)가 있고, 중복되는 값을 허용한다.

        List<Integer> list = new ArrayList<Integer>();

        list.add(100);
        list.add(100);
        list.add(50);

        System.out.println(list);

        //특정 위치에 값 추가
        list.add(1, 60);
        System.out.println(list);

        //특정 위치의 값을 변경
        list.set(0, 90);
        System.out.println(list);

        //특정 위치의 값을 삭제
        list.remove(2);
        System.out.println(list);

        //특정 위치의 값을 가져온다.
        System.out.println(list.get(2));

        //List의 크기
        System.out.println(list.size());

        //특정 값이 존재하는지 확인
        System.out.println(list.contains(100));

    }//main
}
