package ex5_label;

public class Ex3_label {
    public static void main(String[] args) {
        
        out : for( int i = 1; i <= 3;i++){

            for( int j = 1; j <= 5 ;j++){

                if( j % 2 ==0 ){
                    continue out;
                }

                System.out.println(j + " ");

            }//in

            System.out.println();

        }//out

    }//main
}
