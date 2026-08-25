package ex2_work;

public class Ex07_work {
    public static void main(String[] args) {
        
        //배열 arr을 오름차순으로 출력
        // ex)
        // 11 7 9 20 15 3
        // 3 7 9 11 15 20
        int [] arr= {11, 7, 9, 20, 15, 3};

        for(int i=0; i < 6 ;i++){

            for(int j = 0; j < 6; j++){
   //중요point         
                if(arr[j] < arr[i] ){
                int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;        // arr[0] ~ arr[5]의 내용을 정렬
            }
                       
        }//for inner
            
        for( int k = 0; k < arr.length; k++)
        System.out.printf("%d ", arr[k]);
    }//for outer

    }//main
    
}

// 왜 오류나지??