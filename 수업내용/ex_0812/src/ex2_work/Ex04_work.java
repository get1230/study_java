package ex2_work;

import java.util.Scanner;

public class Ex04_work {
    public static void main(String[] args) {

        // 배열의 크기를 입력하세요 : 5
        // 정수1 : 6
        // 정수2 : 7
        // 정수3 : 11
        // 정수4 : 20
        // 정수5 : 31
        // --------------
        // 홀수 개수 : 3
        // 짝수 개수 : 2

        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기(개수)를 입력하세요 : ");
        int size = sc.nextInt();

        // *int[] nums = new int[size];
        
        // 정수의 형태로 배열을 만들건데 이름은 넘스야. 
        // 그리고 그 배열의 크기는 '내가 입력'할거야.


        // *int odd = 0; //홀수
        // *int even = 0; //짝수

        for (int i = 0; i < size; i++) {

            System.out.print("정수" + i + 1);
            // *nums[i] = sc.nextInt();

            //  *if (nums[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        } // for

        System.out.print("짝수 : " + even);
        System.out.print("홀수 : " + odd);


    }//main
}
