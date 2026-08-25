package ex3_override;

public class CalMain {
    public static void main(String[] args) {
        
        CalPlus cp = new CalPlus();
        int n = cp.getResult(10,20); // -> 30
        // 자식 입장에서 더하는 형태로 만들어야한다.
        System.out.println(n);



        CalMinus cm = new CalMinus();
        n = cm.getResult(15,10); // -> 5
        System.out.println(n);

    }//main
}
