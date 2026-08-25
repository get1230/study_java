import java.util.Scanner;

public class Ex06_work {
    public static void main(String[] args) {
        
        // 정수 : 7
        // 7은(는) 소수입니다

        // 정수 : 10
        // 10은(는) 소수가 아닙니다

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 :");
        int jungsu = sc.nextInt();
        
        int res = 0;

        for (int i = 2; i <= jungsu; i++){


        if(jungsu % i == 0 ){
            res++;

        }
      
    }//for

    if(res == 1) {
        System.out.printf("%d은(는) 소수입니다.",jungsu);

    }else{System.out.printf("%d은(는) 소수가 아닙니다.",jungsu);}

    }//main
}
