package ex4_continue;

public class Ex2_continue {
    public static void main(String[] args) {

        //for문과 continue

        for (int i = 1; i <= 5; i++) {

            switch (i) {
                case 1:
                    System.out.println("case 1");
                    break;

                case 2:
                    System.out.println("case 2");
                    continue; // 원래 못쓰는데, for로 포장이 되어있기 때문에 사용함.
                            // 증감식으로 간다.
            }//switch
            System.out.println("결과 : " + i);

        } // for

    }// main
}
