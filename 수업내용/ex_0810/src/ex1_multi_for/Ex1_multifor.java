package ex1_multi_for;

public class Ex1_multifor {
    public static void main(String[] args) {
        
       // 이중 for문 : 안쪽 for문을 반복시키는
       
        // 문제1). 1 2 3 4 5 (3줄)
       
        for(int i =1 ; i <= 3; i++){

            for(int j = 1; j <=5; j++){
                System.out.printf("%d ",j);

            }//inner for

            System.out.println(); //엔터만 치는코드

        }//outer for
        // 바깥 2번 -> 안쪽 6번

        System.out.println("-------------");

        // 문제2). 5 4 3 2 1 (3줄)

        
        for(int i =1 ; i <= 3; i++){

            for(int j = 5; j >= 1; j--){
                System.out.printf("%d ",j);
                
                // 해석 : j가 1까지 같게, 하나씩 낮아진다.
            }//inner for

            System.out.println(); //엔터만 치는코드

        }//outer for



    }//main
}