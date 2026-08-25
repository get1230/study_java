package ex1_multiarr;

public class Ex1_multiarr {
    public static void main(String[] args) {

        // 이차원 배열 : '가장 작은 방'에만 '값'을 넣을 수 있다.

        int[][] test = new int[2][3];
        // 큰방개수 : 2개 | 작은방 개수 : 3개

        test[0][0] = 100;
        test[0][1] = 200;
        test[0][2] = 300;

        test[1][0] = 400;
        test[1][1] = 500;
        test[1][2] = 600;

        // 이차원배열 : '이중FOR문'을 사용해야만 결과를 출력할 수 있다.

        for (int i = 0; i < test.length; i++) { // test.length : 큰방 갯수

            for (int j = 0; j < test[i].length; j++) { // test[i].length : i번 큰방의 작은방갯수

                System.out.print(test[i][j] + " ");

            } // inner

            System.out.println();

        } // outer

    }// main
}
