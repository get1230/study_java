package ex1_array;

public class Ex2_array {
    public static void main(String[] args) {
        
        //배열 선언 + 생성 + 초기화
        int[] ar = {1, 2, 3, 4, 5}; // new없이 index를 생성하는 문법 (방번호와 개수는 다르다)

        // 1 2 3 4 5

        for(int i = 0; i < ar.length ; i++ ){
            
            
            System.out.print( ar[i] + " ");

        }//for

        System.out.println();
        System.out.println("----------------------");

        // 개선된 루프
        for( int n : ar ){
            System.out.println(n);
                  

        }//for


    }//main
}

// '3의 배수'와 같은 조건을 넣으려면
// ar[i] 를 활용해야 한다. (루프는 어렵다)
// 이유는 모른다. -> 정리 필요