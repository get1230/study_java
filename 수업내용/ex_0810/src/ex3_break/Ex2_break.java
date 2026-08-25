package ex3_break;

public class Ex2_break {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 3 ; i++){

            switch(i){
                case 1 :
                    System.out.println("case 1");
                    break;

                case 2 :
                    System.out.println("case 2");
                    break;

            }//swutch
            System.out.println("i의 값 : " + i);


        }//for
    }//main
}
