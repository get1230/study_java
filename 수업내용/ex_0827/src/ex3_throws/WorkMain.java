package ex3_throws;

public class WorkMain {

    public static void main(String[] args) {

        WorkSub2 ws = new WorkSub2();

        try {

            // result()가 throws로 넘긴 예외를
            // 호출한 main에서 처리
            ws.result();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
