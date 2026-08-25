package ex_work;

import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        
        // 찾을 값 : 10
        // 10보다 큰 첫번 째 요소 : 11
        // 해당 '행'의 모든 요소 : 9 10 11 12
        int [][] array = { { 1,2,3,4 }, { 5,6,7,8}, { 9,10,11,12 }, { 13,14,15,16 } };

        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 값 : ");
        int x = sc.nextInt();

        out : for(int i = 0; i < array.length; i++){
            
            for(int j = 0; j < array[i].length; j++){

                
                    

                if( x < array[i][j] ){
                    System.out.printf( "%d보다 큰 첫번째 요소 : %d\n", x, array[i][j]);
                    
                    System.out.print("해당 행의 모든 요소 : ");

                    for (int k = 0; k < array[i].length; k++) { // break로 끝나기 직전까지 다시 돌려서 숫자를 뽑아내는 방법
                    System.out.print( array[i][k] + " ");
                    }
                    
                        break out;
                }

                

            }//inner

        }//outer
    }
    
}//main

