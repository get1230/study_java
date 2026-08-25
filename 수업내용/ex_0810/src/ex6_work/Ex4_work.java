package ex6_work;

public class Ex4_work {
    public static void main(String[] args) {
        //키보드에서 입력받은 두 개의 수의 최대공약수 출력
        // 반드시 '수1'이 '수2' 보다 작아야 한다.
        // ex) 수1 : 10 / 수2 : 4 | 최대공약수 : 2 
    


        //유클리드 호제법으로 최대공약수 구하기
        // 최소공배수 = 수1 * 수2 / 최대공약수
        
        while ( su2 !=0) {
            
            int tmp = su1 % su2
            su1 = su2;
            su2 = tmp;
        
        }//while

        System.out.println( "최대공약수 : " + su1);
    
    }//main
}
