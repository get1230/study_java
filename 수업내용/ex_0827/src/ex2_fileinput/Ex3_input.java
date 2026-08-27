package ex2_fileinput;

public class Ex3_input {

    public static void main(String[] args) {

        byte[] console = new byte[100];

        try {

            System.out.print("입력 : ");

            // Scanner를 사용하지 않고
            // System.in의 byte 입력을 직접 받아보는 예제
            System.in.read(console);

            String res = new String(console).trim();

            System.out.println("입력값 : " + res);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
