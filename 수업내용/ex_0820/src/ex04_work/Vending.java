package ex04_work;

public class Vending {
    
    private Can[] cans = new Can[5]; 
    // ★중요 자판기안에 음료를 들고가면 안되니, 보안관리 + 여러개
    
    private int money;

    // 자판기에서 관리할 음료수를 준비하는 과정
   public Vending(){
        cans[0] = new Can("환타", 1000);
        cans[1] = new Can("콜라",1100);
        cans[2] = new Can("사이다",1200);
        cans[3] = new Can("몬스터",1300);
        cans[4] = new Can("맥콜",1400);

   }

    // 사용자의 돈을 받는다
    // 이 돈으로 마실 수 있는 음료 목록만 보여주기
    public void showDrink( int money ){
        // 파라미터로 돈을 받아보자!

        for( int i = 0 ; i < cans.length ; i++ ){

            if( cans[i].getPrice() <= money ){
                //나는 캔들을 관리하고 있어요.

                System.out.printf(
                    "%s - %d원\n"
                    cans[i].getName() ????
                );

            }

        }//for

        this.money = money ;

        System.out.println( " >> ");

    }// showDrink()

    // 사용자가 음료수를 선택하면
    // 해당 음료수를 제공하고 잔돈을 돌려준다
    public void dispense( String name ){

    }//dispense

    for( int i = 0; i< cans.length; i++){

        if( cans[i].getName().equals(name)){
            //종류별로 음료수의 이름들을 비교해서, 일치하는게 있으면
            // 그 값을 빼고 돈을 돌려주기 위해
            System.out.println( name + "을(를) 선택함");
            money -= cans[i].getPtice(); //잔돈계산

            System.out.println( "잔액 : " + money);

        }


    }//for

}//class
