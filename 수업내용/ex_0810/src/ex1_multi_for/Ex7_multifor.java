package ex1_multi_for;

public class Ex7_multifor {
    public static void main(String[] args) {
        
        // 숙제 1.
        // 2 x 1 = 2    3 x 1 = 3   4 x 1 = 4 ... 9 x 1 = 9
        // 2 x 9 = 18   3 x 9 = 27 .............. 9 x 9 = 81
        

        for( int i = 1 ; i <= 9 ; i++ ){

            for( int x = 2 ; x <=9 ; x++ ){
                System.out.print( "(" + x + " * " + i + " = " + (x*i)+ " "+ ")");

                //System.out.printf( "%d x %d = %d\t", j, i, j*i);
                //깔끔

            }//inner

            System.out.println();

        }//outer



    }//main
}

// *i == 1일때 9바퀴를 돌려야한다.