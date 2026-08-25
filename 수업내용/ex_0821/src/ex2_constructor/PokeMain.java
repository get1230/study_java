package ex2_constructor;

public class PokeMain {
    public static void main(String[] args) {
        
        //이름과 타입을 반드시 입력해야만 객체가 생성되도록 강제
        // 필수정보가 빠진 포켓몬이 만들어지는 것을 방지할 수 있다.
        Pokemon p1 = new Pokemon(name:"피카츄", type:"전기");
        p1.setName("라이츄");
        p1.info();

        // 전기타입은 진화해도 풀타입으로 바뀌는 것을 방지하고 싶다. -> 셋타입을 지웠다.
        

        
        /*p1.setName("피카츄");
        p1.setHp(100);*/

        //실수로 안적는 문제를 방지하기 위해 생성자를 이용한다.

        p1.info();
        
        
        /*p1.name = "피카츄";
        p1.type = "전기";
        p1.hp = "100"; */
        
    
    }//main
}
