package ex4_continue;

public class Ex3_continue {
    public static void main(String[] args) {
        
        // while과 continue

        int n = 0;

        while ( n < 10 ) {
            n++;

            if( n % 2 == 0){
                continue; //조건이 참이면 반복 | 반복x
            }
            
            System.out.println(n);
        
        }//while


    }//main
}
