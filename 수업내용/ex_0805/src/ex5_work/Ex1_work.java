package ex5_work;

public class Ex1_work {
    public static void main(String[] args) {

        /*
         * 과수원이 있다. 배, 사과, 오렌지를 키우고 있는데, 하루에 생산되는 양이
         * 각각 5, 7, 5개.
         * 
         * 문제
         * 1.과수원에서 하루에 생산되는 과일의 총 갯수를 출력
         * 2.시간당 전체 과일의 평균 생산 갯수
         * 단, 과일의 갯수를 담는 변수는 int, 평균을 계산할 변수는 float
         * 
         * 
         */

        int pear = 5; // 배
        int apple = 7; // 사과
        int organge = 5; // 오렌지
        int total = pear + apple + organge;
        // float avg = (float)total / 24;
        float avg = total / 24f;

        System.out.println("하루생산량 : " + total);
        System.out.println("시간당평균:" + avg);

        /*
         * [연습문제]
         * 
         * 1. 한 달(30일) 동안 이 과수원에서 생산되는 과일의 총 갯수를 구하시오.
         * 
         * 2. 하루에 사과 생산량이 2개씩 증가한다고 할 때, 5일째 되는 날의 사과 생산량과
         * 5일째 전체 과일 생산량은 각각 얼마인지 구하시오.
         * 
         * 3. 하루 총 생산량이 20개가 넘는 경우에는 '과잉 생산', 20개 이하인 경우는 '적정 생산'이라고 한다.
         * 이 분류 기준에 따라 현재의 하루 생산량이 어떤지 출력해보시오.
         * 
         * 4. 시간당 생산량이 1.0 미만인 과일만 골라 그 과일의 이름과 시간당 생산량을 출력하시오.
         */
    }

}
