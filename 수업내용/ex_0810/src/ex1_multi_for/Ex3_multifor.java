package ex1_multi_for;

public class Ex3_multifor {
    public static void main(String[] args) {

        // 문제 1.
        // A B C D
        // E F G H
        // I J K L

        // --내가 푼 것--
        int Eng = 'A';
        for (int i = 1; i <= 3; i++) {

            for (int n = 1; n <= 4; n++) {
                System.out.print(" "+ (char)Eng++);
            } // inner
            System.out.println();
        } // outer

        System.out.println("-------------");

        // --강사님 답변--
        char ch = 'A';
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 4; j++) {
                System.out.print(ch++ + " ");
            } // inner
            System.out.println();
        } // outer


    }// main
}

// 중요 : char 코드를 사용하는 방법