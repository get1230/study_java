package ex1_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Ex1_Set {
    public static void main(String[] args) {
        
        //Set<E>
        //List와 동일하게, 여러개의 데이터를 한꺼번에 저장하는 자료구조
        //List와는 다르게 저장되는 데이터의 순서(index)가 없다.
        //중복되는 값을 허용하지 않는다.

        //Set<자료형> set = new HashSet<자료형>();
        Set<String> set = new HashSet<String>();

        //Set에 데이터 추가
        set.add("홍길동");
        set.add("김길동");
        set.add("박길동");
        set.add("홍길동");

        System.out.println(set);

        System.out.println("--------------------");

        //Set의 크기
        System.out.println(set.size());

        //Set의 데이터 삭제
        set.remove("김길동");
        System.out.println(set);

        System.out.println("--------------------");

        //Set을 배열로 변경
        Object[] arr = set.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("--------------------");

        //Iterator : 반복자
        //Set처럼 index가 없는 자료구조에서 데이터를 순차적으로 꺼내기 위해 사용
        Iterator<String> it = set.iterator();

        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        System.out.println("--------------------");

        //1~45 사이의 난수 6개 생성
        Set<Integer> lotto = new HashSet<Integer>();

        while (lotto.size() < 6) {
            lotto.add(new Random().nextInt(45) + 1);
        }

        System.out.println(lotto);

    }//main
}
