package ex1_statement;

import java.util.Scanner;

public class EX3_for {
    public static void main(String[] args) {

        //은행 이자가 하루에 1원씩 추가된다.
        //'원금'과 '예치일수'를 키보드에 입력받고
        //예치기한이 끝났을 때, 나의 원금이 얼마가 되어있는지 출력
        //-----------------
        //원금 : 1000
        //예치일 : 5
        //5일 후의 잔액은 1005원입니다.
        
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();
        System.out.print("원금 : "+ money);

        int day = sc.nextInt();
        System.out.print("예치일 : "+ day);
        
        //for (int i =0; i < day; i++) { money++}

        for(int i = 1000; i > 1005; i++){
        
            System.out.println(i);
        }//for

        System.out.println(day + "일 후의 잔액 -" + money);
        
}//main
    
}
