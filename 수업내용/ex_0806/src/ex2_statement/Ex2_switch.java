package ex2_statement;

public class Ex2_switch {
    public static void main(String[] args) {
        //   (변수)(변수의 내용)
        String str = "S";
        String res = "";

        // '비교값' 과 '조건값'의 '타입'은 동일해야한다.

        switch (str) {

            case "A":
                res = "90~100";
                break;

            case "B":
                res = "80~89";
                break;

            case "C":
                res = "70~79";
                break;

            case "D":
                res = "60~69";
                break;

            case "F":
                res = "59점 이하";
                break;

            default:
                System.out.println("고처야한다!");
                break;

        }// switch

        System.out.println(res);

    }// main
}
