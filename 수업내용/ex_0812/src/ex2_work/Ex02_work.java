package ex2_work;

public class Ex02_work {
    public static void main(String[] args) {
        
        // 배열 arr에 담긴 모든 값의 합을 출력
        // ex) 결과 : 121
        int [] arr = { 10, 11 ,37, 61, 2};

        int sum = 0;

        for(int i = 0; i < 5; i++){

            sum += arr[i];
            
        }//for

        System.out.println("결과 : " + sum); 
        
// syso가 'for안에' 들어가면 중간과정이 / 밖에 사용되면 결과만 출력된다.

    }//main
}
