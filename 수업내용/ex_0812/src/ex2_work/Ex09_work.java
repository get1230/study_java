package ex2_work;

import java.util.Random;

public class Ex09_work {
    public static void main(String[] args) {
        

        // 1~45 사이의 "중복되지 않는" 난수 6개를 출력하는
        // 로또번호 생성기 만들기
        // ex) 17 2 45 27 9 11
        int[] lotto = new int[6];

        for(int i=0;i < lotto.length;i++){
        
        for(int j = 0; j < lotto.length ; j++){
            
            lotto[j] = new Random().nextInt( 6 ) + 1; 
            
            if(lotto[i] == lotto[j] ){
                lotto[i] = lotto[j];  // arr[0] ~ arr[5]의 내용을 정렬해야한다.
            }
            
            

        }//for
        for(){} //for 를 사용해서 출력해야한다.
        System.out.println(lotto[i]);
    }//for outer


    }//main
    
}
