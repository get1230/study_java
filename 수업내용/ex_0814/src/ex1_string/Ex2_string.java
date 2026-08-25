package ex1_string;

public class Ex2_string {
    public static void main(String[] args) {
        
        String str = "Hong Gil Dong";
        int index = str.length();
        System.out.println("str의 길이 : " + index);

        index = str.indexOf('o'); 
        // indexOf 문자열에서 특정 글자가 '몇 번째 위치'에 있는지 찾는 메서드
        // 위치 정수 값을 넣음
        System.out.println("맨 처음 문자 G의 위치 : " + index);

        index = str.indexOf("Gil");
        System.out.println("문자열 Gil의 위치 : " + index);

        index = str.lastIndexOf('o');
        System.out.println("마지막문자 o의 위치 : " + index);

        char res = str.charAt(6);
        System.out.println("6번째 문자 : " + res);

        String ss = str.substring(1,6);
        System.out.println("잘라낸 문장 : " + ss);

        // "복습" ('위치 번호'는 0부터 시작)
        // indexOf = '문자의 위치 번호'를 알려주는 메서드
        // lastIndex = '맨 뒷자리 문자의 위치 번호'를 알려주는 메서드
        // charAt = '글자 1개를 꺼내는' 메서드
        // substring = 설정한 위치 번호 내의 '문장'을 꺼내는 메서드


        String apple = "apple";
        if (apple.equals("apple") ){
            System.out.println("사과");
        }

        if( apple.equalsIgnoreCase("apple")){
            System.out.println("대소문자 상관없이 : 사과");
        }
        
        // ??.equals() = ??내용이 ()안에 내용과 '동일한지 구분'하는 메서드
        // equalsIgnoreCase = '대소문자를 무시' + '문자열 내용이 같은지 비교'하는 메서드
        // 변수.trim() = 앞뒤에 의미없는 공백 지워짐

        String password = "   1234   ";
            String pwd2 = password.trim(); 
            System.out.println(pwd2 + "의 길이 : " + pwd2.length()); 

        

        String number = "100";
        int num = Integer.parseInt(number); 
        // 문자 100이 숫자100이 된다.
        // 숫자형태의 문자열을 실제 숫자로 바꿔주는 메서드

        System.out.println( num + 1);

        // 기본자료형의 wrapper 클래스
        // boolean -> Boolean
        // char -> Character
        // byte -> Byte
        // short -> Short
        // int -> Integer
        // long -< Long
        // float -> Float
        // double -> Double

    }//main
}
