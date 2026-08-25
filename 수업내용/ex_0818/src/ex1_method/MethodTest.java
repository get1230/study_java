package ex1_method;

public class MethodTest {

    public void test1(){
        System.out.println("test1 메서드 호출");
    }

    //반환형에 int | String ... 다 넣을 수 있다 하지만
    // 반환형이 'void가 아닌 시점에서 return이 필요'하다.

    public String test2(int n){ //인자 파라메터 는 원본을 주지 않는다. (기본적으로 복사본을 활용)
        n++;
        System.out.println("결과 : "+ n);

        // 나를 호출한 곳으로 return값을 딱 한개만 가지고 돌아간다.
        return "메롱";
        // 강제 종료하고 돌아갈께요~
    }
    
}
