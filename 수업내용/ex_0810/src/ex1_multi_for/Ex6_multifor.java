package ex1_multi_for;

public class Ex6_multifor {
    public static void main(String[] args) {
        
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        

        for(int i = 1 ; i <= 5 ; i++){

            
            for( int j = 1 ; j <= i ; j++ ){

                System.out.print("* ");
            }//inner

            System.out.println();
        }//outer

    }//main
}

/*  중요 : 정수 -> '문자 변환하는 방법'이 필요가 없었구나...
문제는 해석이 제대로 되지 않았기에 syso에서 헤멨다.
 */
