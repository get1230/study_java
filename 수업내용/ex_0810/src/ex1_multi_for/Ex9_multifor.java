package ex1_multi_for;

public class Ex9_multifor {
    public static void main(String[] args) {

        /*
         
         * 숙제 3.

                 *
               * * *
             * * * * *
           * * * * * * *
         * * * * * * * * *
         
         */

        // -- 내 생각 --
        // 전체를 9번 돌린다. -> 전체 중에 '홀수(2로 나눴을 때, 나머지가 1)'만 돌려라
        // 만약, 홀수라면 적용하고 아니라면 건너뛰어라 -->*에러사항 : else일때도 outer for이 적용되어 띄어쓰기가 적용되버림.
        // 별을 출력한 경우에만, '줄바꿈'
        // ① i값에 의한 공백 출력 → ② 별 출력 → ③ 줄바꿈

        for (int i = 1; i <= 9; i++) {

            int ran = 9 - i;

            if(i % 2 == 1){

                for (int j = 1; j <= ran ; j++) {
                
                    System.out.print(" "); //공백 반복문
                
                }

            for (int j = 1; j <= i; j++) {
                
                System.out.print("* "); // 별 반복문
            
            } // inner
      
        System.out.println();
        }else{System.out.print("");}
        
        } // outer

    }// main
}
