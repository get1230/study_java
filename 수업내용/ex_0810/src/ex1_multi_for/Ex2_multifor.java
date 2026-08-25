package ex1_multi_for;

public class Ex2_multifor {
    public static void main(String[] args) {
        
        // 01 02 03 04
        // 05 06 07 08
        // 09 10 11 12

            int cnt = 0;
        for(int a = 1; a <= 3; a++){

            for(int b = 1; b <= 4; b++ ){
                System.out.printf("%02d ", cnt++); 
                //cnt까지 00이 12번 돌아가니, 준비가 완료되었고 cnt++을 사용

            }//inner
            System.out.println();
        }//outer

    }//main
}
