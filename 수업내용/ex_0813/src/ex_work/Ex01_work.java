package ex_work;

public class Ex01_work {
    public static void main(String[] args) {

        // 배열 arr에 담긴 모든 값의 '합'과 '평균' 구하기
        // ex) 총합 : 119 | 평균 : 7.44

        int[][] arr = { { 7, 8, 11, 6 }, { 20, 13, 9, 2, 5 }, { 7, 7, 10 }, { 2, 3, 4, 5 } };

        int total = 0;
        int x = 0;
        float avg = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                total += arr[i][j];
                // x ++ : 작은방의 번호만큼 회전한다.


            } // inner

            x += arr[i].length;

        } // outer

        avg = total / (float) x;

        System.out.println(total);
        System.out.printf("%.3f", avg);

    }// main
}
