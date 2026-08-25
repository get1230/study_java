package ex1_array;

public class Ex1_array {
    public static void main(String[] args) {

        // 배열은 '같은 자료형끼리 모아둔 하나의 묶음'
        // 효율적인 자료관리를 위해 반드시 필요하다

        int su1 = 100;
        int su2 = 200;
        int su3 = 300;
        int su4 = 400;

        // 1) 배열 선언 (대괄호 : 배열)
        int[] arr;

        // stack에 arr이 기록된다.

        // 2) 배열 생성
        arr = new int[4];

        // stack에서 arr을 new를 통해서 heep 메모리에 집을 찾아라
        // 그리고 int타입만 저장할 수 있는, 4개의 방을 짓는다
        // 방의 순서가 0부터 순차적으로 번호가 붙는다.
        // 0번방에 100을 집어넣는다 => arr[0] 100;

        // 3) 배열 초기화
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        
        // java에서는 존재하지 않는 방에 값을 넣으면 오류
        // 방 = index
        // '코드가 끝나기 전'까지 index를 추가할 수 없다.

        // 배열의 모든 내용을 출력하겠다
        for (int i = 0; i < arr.length; i++){

            System.out.println( arr[i]);

            // arr.length => index 값이 증가해도, '자동으로 최대까지 감지'해서 적용. 

        }//for

    }// main

}

// 메모리 영역 ①stack / ②heap

// 없는 index 를 출력시, 오류문구 : ArrayIndexOutOfBoundsException