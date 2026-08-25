package ex1_constructor;

public class ConMain {
    public static void main(String[] args) {
        
        ConSub cs = new ConSub();
        // 이미 생성자가 호출이 되었다.
        // new는 빈자리를 찾는것
        // 집을 짓는것은 생성자
        // 생성자 : 객체가 생성될 때, '메모리 할당을 위해' 딱 한번 반드시 호출되는 것

        //cs.ConSub();처럼 다시 불러다 쓸 수 없다.

        ConSub [] cs = new ConSub[2];
        // 이것만으로는 생성자를 호출 할 수 없다.

        cs[0] = new ConSub(); // 수동으로 생성자로 메모리 할당 받아야한다.
        cs[1] = new ConSub(); 


    }//main
    
}
