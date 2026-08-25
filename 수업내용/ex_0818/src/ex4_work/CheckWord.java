package ex4_work;

public class CheckWord {
    //기능을 나눠야 하기 때문에 "main"이 있으면 안됌.

    public String check( String str ){ 
        // 'check' 메서드를 메인에서 사용하려면, CheckWord클래스가 메모리 할당 되어야함.
        // 메인 값을 보낼 때, 문자열을 보낸다는 '약속'이 되어있으면 ㄱㄴ


    String rev = "";
        
        for(int i = str.length(); i >=0; i--){
            rev += str.charAt(i);
        }//for

        // 상위 코드로 원본 'abc'를, rev에 'cba'를 담는 과정 진행완료.

        return rev;
        // rev를 메인으로 돌려줄께
        // 이때 자료형 타입이 void -> String 이어야한다.
    
    }// 19일 39:30
    
}
