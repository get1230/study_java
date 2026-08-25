package ex3_stringbuffer;

public class Ex3_stringbuffer {
    public static void main(String[] args) {
        
        //주제 : 메모리에 쌓이는 과정 및 덮어씌우기 설명

        String str = "안녕"; //메모리에 "안녕"저장
        str = "반갑습니다"; // "반갑습니다"저장, 안녕 잊음
        str += "!"; // "반갑습니다!"저장, 반갑습니다 잊음
        System.out.println(str);

        StringBuffer sb = new StringBuffer("안녕");
        //StringBuffer : 명시적 생성만 가능 + 확인방법 : 객체.toString
        //객체가 "안녕" 문자열을 저장
        
        System.out.println(sb.toString());
        sb.setLength(0);
        //setLength : 객체의 길이 새로세팅
        sb.append("반가워요"); // append : 이어붙임(추가)
        
        //String = 문자열 자체
        
        /*  StringBuffer = 문자열을 담아서 편집하기 좋은 상자
            때문에, 문자열로 나오려면 .toString을 사용해야함.
        */

    }//main
}
