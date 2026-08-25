package ex2_work;

import java.util.Scanner;

public class Ex01_work {
    public static void main(String[] args) {
        
        // 입력 : 5
        // ABCDE
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int x = sc.nextInt();

        char[] ic = new char [x];

        for(int i = 0; i < x ; i++){

// x대신 ic.length 사용가능 한 이유?

            ic[i] = (char)('A' + i);
            // 해설 : 'ic' 의 'i' index(번방)는, 캐릭터 형태의 변수값인 ('A' + i(번방))이다

            System.out.println(ic[i]);

        }//for

    }//main
}
