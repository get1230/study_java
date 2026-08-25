package ex4_static;

public class StaticMain {
    
    int n;
    static String str;

    public void test1(){
        n = 10;
        str = "안녕";
    }

    public static void test2(){
        // static 메서드에서는
        // 일반변수의 참조가 불가능하다 ex) n = 10;
        
        str = "안녕";
        //스테틱 변수를 가져오는 것은 문제가 되지 않는다.

        int num = 100;
        //일반적인 변수는 만들 수 있다.

        // static 메서드 안에서 static변수를 정의할 수 없다. ex) static int num2 = 200;


    }

}
