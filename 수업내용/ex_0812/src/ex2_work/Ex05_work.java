package ex2_work;

import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        
        //학생 수를 입력하세요 : 3
        // 학생 1의 성적 : 90
        // 학생 2의 성적 : 73
        // 학생 3의 성적 : 84
        // ----------------
        // 평균 성적 : 82.3336
        // ---평균 이상인 학생들---
        // => 학생1 : 90
        // => 학생3 : 84
        // 평균 이상인 학생 수 : 2

        Scanner sc = new Scanner(System.in);
        
        System.out.println("학생 수를 입력하세요 : ");
        int size = sc.nextInt();

        int [] St = new int[size];

        int sum = 0; // 점수의 합을 저장할 변수
        


        for(int i =0 ; i < size ; i++){
            
            System.out.printf("학생%d의 성적 : ", i+1);
            St[i] = sc.nextInt();

            sum += St[i];
            sum / size;

            if( sum / size ){


            }

        }//for

        System.out.println("-------------");

        float avg = (float)sum / size;
        System.out.printf("평균성적 : %.2f\n", avg); //왜 나왔는지 생각하자!

        System.out.println("--- 평균 이상인 학생들 ---");

        int AC = 0; // 평균이상인 학생수를 담은 변수

        for(int i = 0; i < AC ; i++) {

            if ( St[i] >= avg){
                AC++;
                System.out.printf(
                    "학생%d : %d\n," , i+1, St[i]);
                
            }

            System.out.println("평균이상의 학생수 :" + AC);

        }//for



            
        }


    }//main
}
