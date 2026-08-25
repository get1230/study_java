package ex02_work;

public class EncodeSub {

    char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^',
            '&', '*', '(', ')', '-', '_', '+', '=', '|',
            '[', ']', '{', '}', ';', ':', ',', '.', '/' };

    char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

    // String result = ""; (경우1.)
    

    public String encoding( String str){//원본문장을 변환해서 스트링형태로 반환하는게 목표
    
        StringBuffer result = new StringBuffer();

        for(int i =0; i < str.length(); i++){

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z'){

                //result += abcCode[ ch - 'a']; //(경우1.) abcCode배열의 ch - 'a' 번째 코드
                result.append( abcCode[ ch - 'a'] );

            }else if( ch >= '0' && ch <= '9'){
                //result += numCode[ ch - '0']; //(경우1.) numCode배열의 ch - '0' 번째 코드
                result.append( numCode[ ch - '0'] );

            }

        }//for

            //return result; //(경우1.)반환된 결과값
            return result.toString();

    }// encoding
}// class
