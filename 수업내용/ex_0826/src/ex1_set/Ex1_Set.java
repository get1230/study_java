package ex1_set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex1_Set {
    public static void main(String[] args) {

        // collection : 많은 수의 데이터를 그 사용 목적에 적합한 구조로 묶어서
        // 하나로 그룹화 한 객체
        // --------------------
        // Set, Map, List

        // Set은 java.util 패키지의 인터페이스다. (제너릭 타입의 인터페이스)
        // 특정 코드에서 중복된 값의 허용이 있어서는 안될 때 사용
        // 복잡한 코드없이 중복요소를 빠르게 제거할 수 있다.

        // Set인터페이스를 구현하고 있는 대표적인 자식클래스
        // HashSet : 정렬이 안됨.
        // TreeSet
        Set<Integer> set = new HashSet<>(); // 실무적인 형태
        set.add(150);
        set.add(70);
        set.add(10);
        set.add(200);
        set.add(10); // 중복이라 안써짐

        set.clear(); // set의 모든 값을 비운다.

        System.out.println("set의 크기 " + set.size());
        System.out.println(set);

        System.out.println("----------------");

        Set<Integer> set2 = new HashSet<Integer>();
        Random rnd = new Random();

        while(true){
            int r = rnd.nextInt(6)+1;
            set2.add(r);

            if(set2.size() == 6){
                break;
            }

        }//while

        System.out.println(set2);

        //set2를 배열로 변환
        Integer [] arr = set2.toArray(new Integer[0]); //공식

        for(int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + " ");
        }//for

        System.out.println("---------------");

        int [] arr2 = new int [ set2.size()];
        int i = 0;
        for(Integer num : set2){
            arr2[i++] = num; //엥? 뭐야?
        }

        for(int j = 0; j < arr2.length; j++){
            System.out.print(arr2[j] + " ");
        }
        
    }// main
}
