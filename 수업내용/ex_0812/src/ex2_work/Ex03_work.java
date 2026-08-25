package ex2_work;

public class Ex03_work {
    public static void main(String[] args) {
        
        // 배열 arr에 담긴 값 중 가장 큰 값을 출력
        // 가장큰 값 : 19
        int [] arr = {4, 13, 7, 19, 1, 15, 21};
        int big = 0;

        


        for(int i = 0; i < arr.length ; i++ ){

            // 번호내용을 바꿔가면서 저장하면 된다.

            if( arr[i] >= big){
                big = arr[i];

            }
            

        }//for
        System.out.println(big);

    }
}
