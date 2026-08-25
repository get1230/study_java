package ex1_multiarr;

public class Ex4_multiarr {
    public static void main(String[] args) {

        //이런것도 있다는 느낌으로

        char[][] cArr = new char[2][]; //큰방 2개 만 만들어놨다.
        cArr[0] = new char[2]; // 여기서 새로 큰0번방에서 -> 작은방 2개 만들었다.
        cArr[1] = new char[3]; // 새로 큰1번방에서 -> 작은방 3개 만들었다.

        cArr[0][0] = '안';
        cArr[0][1] = '녕';
        
        cArr[1][0] = '하';
        cArr[1][1] = '세';
        cArr[1][2] = '요';

        for(int i = 0; i < cArr.length; i++){

            for(int j =0; j < cArr[i].length; j++){

                System.out.print(cArr[i][j]);

            }//inner

        }//outer

    }// main
}
