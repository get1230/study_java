package ex2_work;

import java.util.Scanner;

public class Ex06_work {
    public static void main(String[] args) {
        
        //키보드에서 정수를 10개 입력받아 배열에 담고
        // 가장많이 등장한 정수와 등장한 횟수를 출력
        // ex) 정수 : 1 1 2 2 2 3 4 2 5 6
        // 가장 많이 등장한 숫자 : 2
        // 가장 많이 등장한 숫자의 횟수 : 4

        Scanner sc = new Scanner(System.in);

        int [] jung = new int[10];



        for(int i = 0 ; i < jung.length; i++ ){

            System.out.print("정수 :");
            int x = sc.nextInt();

        

        }

    }//main
}

/*

jung [i] == jung [j]
cnt++

if ( cnt > count ) {

count = cnt;
max = jung[i]; 

*/