public class Ex01_work {
    public static void main(String[] args) {

        //과수원이 있다.
        // 배, 사과 ,오렌지를 키우고 있는데, 하루에 생산되는 양이
        // 각각 5, 7, 5개.

        // 1. 과수원에서 하루에 생산되는 과일의 총 갯수를 출력
        // 2. 시간당 전체 과일의 평균 생산갯수
        // 단, 과일의 갯수를 담는 변수는 int, 평균을 계산할 변수는 float

        int bea = 5;
        int saga = 7;
        int oran = 5;

        int total = bea + saga + oran;
        float avg = (float)total / 24;

        System.out.printf("하루에 생산되는 과일의 총 갯수 : %d\n", total);
        System.out.printf("시간당 전체 과일의 평균 생산 갯수 : %.3f", avg);


    }// main
}
