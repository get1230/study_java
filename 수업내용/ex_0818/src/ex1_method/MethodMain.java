package ex1_method;

public class MethodMain {
    public static void main(String[] args) {
    
    Methodtest m1 = new Methodtest();
    m1.test1();

    int su = 100;
    String res = m1.test2( su ); //인자를 통해서 m1클래스로 값을 보낸다.

    System.out.println("su : " + res);

    
    }//main
    
}
