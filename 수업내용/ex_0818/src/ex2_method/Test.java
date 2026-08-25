package ex2_method;

public class Test {

    public void average(int su1, int su2, int su3){
        // Test 클래스가 만들어져 있어야

        int num = su1 + su2 + su3 / 3;

        if(num > 50){
            System.out.println("합격 ");
            //return "합격";
        }else{
            System.out.println("불합격");
            //return "불합격"; (사용하기 위해선 타입을 String 으로 바꿔야함)
        }


    }
    
}
