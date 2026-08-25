package ex10_work;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        
        // 나누기 연산만을 하는 계산식을 만들어 결과를 완성하기
        // (연산결과를 담는 변수는 float이 아닌 int로 하자)
        // ----------------------------
        // ex1.) 수1 : 10
        // 수2 : 2
        // 결과 : 10/2 =5

        // 수 :10
        // 수2 : 0
        // 오류 : 0으로 나눌 수 없습니다

        // 수1 : abc
        // 오류 : 숫자가 아닙니다.

        // 오류 1 InputMismatchException : 문자열
        // 오류 2 ArithmeticException : 정수를 0으로 나눌려고 발생했을때
                
        try{

            Scanner sc = new Scanner(System.in);
            System.out.print("수1 : ");
            int su1 = sc.nextInt();

            System.out.print("수2 : ");
            int su2 = sc.nextInt();

            int sum = su1 / su2;
            System.out.printf("결과 : %d / %d = %d", su1, su2, sum );

        }catch(InputMismatchException e){
            System.out.println("오류 : 숫자가 아님");
        
        }catch(ArithmeticException e){
            System.out.println( " 오류 : 0으로 나눌 수 없음");
        }


    }//main
}
