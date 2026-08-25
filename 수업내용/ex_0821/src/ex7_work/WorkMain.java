package ex7_work;

public class WorkMain {
    public static void main(String[] args) {
        
        // 가장 큰 값을 찾으세요 : 
        int [] arr = {1, 11, 7, 20, 13, 15};

        int big = 0;

        for( int i = 0 ; i < arr.length ; i++ ){

            for(int j =0; j < arr.length ; j++){

                if( arr[i] < arr[j] ){
                    arr[i] = arr[j];
                    
                }


            }//in

        }//for

        System.out.println("가장큰 값은? : " + arr[0] );

    }
}
