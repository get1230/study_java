package ex1_multi_for;

public class Ex8_multifor {
    public static void main(String[] args) {

        /*
         * 숙제 2.
         * 1 2 3 4 5 6 7 8 9 10
         * 2 3 4 5 6 7 8 9 10 1
         * 3 4 5 6 7 8 9 10 1 2
         * ....
         * 10 1 2 3 4 5 6 7 8 9
         */

        for (int i = 1; i <= 10; i++) {

            for (int x = 0; x <= 9; x++) {

                int res = x + i;

                if (res > 10) {
                    System.out.print(res - 10 + " ");

                    /* if (res >10)
                          res - 10;
                    if 밑에 '결과값이 한 줄'이라면 중괄호를 생략해도 된다. 
                    
                    System.*/ 

                } else {
                    System.out.print(res + " ");
                }

            } // inner
            System.out.println();
        } // outer

        // 중요 : x+i 의 값이 '정수' 이기 때문에, int 'res' 변수 안에 넣을 수 있다.

        // 해석 : 
        // 1). 10줄 이기 때문에, 변수 i가 10번 돌아서 10열을 만든다.
        // 2). 열이 바뀔 때마다, 열의 수를 기점으로 번호가 생성되기 때문에 '열의 수'를 기점으로 증가하는 식을 만든다.
        // 3). '문제'와 '2)번'의 유사하면서 다른 포인트 : 10 이상에서 나타난다.
        // 4). '10을 초과하는 수'에 대해서 10을 빼면, 동일한 패턴을 갖는다.


    }// main
}
