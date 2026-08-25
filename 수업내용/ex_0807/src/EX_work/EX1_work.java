package EX_work;

import java.util.Scanner;

public class EX1_work {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // 숙제1번 : 윤년구하기
        // --조건1. '키보드'에서 '년도'를 입력하여 윤년인지 평년인지를 판단해야함.(O)
        
        // --조건 2. '윤년'의 조건
        // 1). 4로 나누어 떨어지지만, (동시에) 100으로는 나눠 떨어지지 않아야함
        // 2). 100과 400 두 값으로 나누어 져야함 (각각은 안됨)
       
        // --조건 3. '평년'의 조건
        // 1). 4년 주기에 포함이 되어 있더라도 100으로 나눠지는 해
        // 2). 연도가 100으로 나눠 떨어지는 해

        //---------------
        // 연도 : 2020 -> 2020년은 윤년입니다.
        // 연도 : 2021 -> 2021년은 평년입니다
        // *일단 for문은 아님

        System.out.print("년도를 기재하세요 : ");
        int year = sc.nextInt();
        String res = "";

        if(year % 4 == 0 && year % 100 != 0 ){ res = "윤년입니다"; 

        }else if(year % 100 == 0 && year % 400 == 0){res = "윤년입니다";
        }else{res = "평년입니다";}

        System.out.println(res);

        // * boolean res = year % 4 == 0 && year % 100 != 0 || year % 400 == 0
        // if (res == true) 이것은, (res) 이것과 동일하다.
        // if ( res == false ) 이것은, (!res) 이것과 동일하다.
        // year + "년은 윤년"
        // *||까지 사용해서 간단하게 만들어보자!
}// main
}
