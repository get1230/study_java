package ex01_work;

public class NumberSub {

    public boolean check( String str ){

        for ( int i = 0 ; i < str.length(); i++){

            char ch =str.charAt(i); //사용자가 넘겨준 str 문자열에서 i번째 값을

            if( ch < '0' || ch > '9'){  // 숫자도 아스키코드 사용 ㄱㄴ
                return false; // 숫자인지, 문자인지 판별
            }

        }//for

        return true;

    }//check
    
}
