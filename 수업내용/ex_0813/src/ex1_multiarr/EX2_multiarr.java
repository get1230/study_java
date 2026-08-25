package ex1_multiarr;

public class EX2_multiarr {
    public static void main(String[] args) {
        
        String [][] str = new String[2][2];

        str [0][0] = "안녕";
        str [0][1] = "하세요";
        str [1][0] = "반갑";
        str [1][1] = "습니다.";

        for(int i=0 ;  i < str.length; i++){

            for(int j =0; j < str[i].length; j++ ){

                System.out.print(str[i][j]);
            
            }//inner
                System.out.println(); // ★ i가 끝나면 줄바꿈을 출력해라
        }//outer

    }//main
}
