package ex07_work;

import java.util.Random;

public class Graph {
    public static void main(String[] args) {
        
        //0~9사이의 난수를 100개 발생시키고
        //각 숫자가 몇개씩 만들어 졌는지를 그래프화 하시오
        //------------------------
        //0의 갯수 : ############ 12
        //1의 갯수 : ####### 7
        //    ...
        //9의 갯수 : ########## 10


        int[] arr = new int[10];
        
        //new Random().nextInt();
        // 익명클래스 -> 자기 할일이 마무리되면 메모리가 날아간다.

        Random rnd = new Random();
        // 더 이상 익명이 아니다.
        // 자주자주 많이 사용해야하면 이렇게 사용하는게 더 낫다.

        for ( int i = 0; i < 100; i++){
            int r = rnd.nextInt(10);
        arr[r]++; 
        //arr 배열을 받기 위한 서브클래스를 만들예정
        // 정의 : 0부터 9까지의 갯수를 알고 있는 arr배열

        }//for

        PrintGraph pg = new PrintGraph();
        pg.print(arr);

        }//main

    }


