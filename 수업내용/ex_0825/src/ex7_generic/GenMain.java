package ex7_generic;

public class GenMain {
    public static void main(String[] args) {
        
        GenTest<String> g1 = new GenTest<String>(); //제너링은 타입은 스트링 타입으로 관리할래요~
        g1.setValue("안녕");
        String res = g1.getValue();
        System.out.println("g1 : " + res);

        GenTest<Integer> g2 = new GenTest<Integer>(); // int라고 쓸 수 없다. (래퍼)
        g2.setValue(100);
        int res2 = g2.getValue();
        System.out.println("g2 : " + res2);

        //g2.obj = (String)"abc"; 이게 뭐야?
        // String str = (String)g2.obj; 공간 많이 차지 (잉여 영역을 줄이자)

        //해석하기!


    }//main
}
