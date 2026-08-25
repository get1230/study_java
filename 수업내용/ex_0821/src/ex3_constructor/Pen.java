package ex3_constructor;

public class Pen {

    private String name;
    private int price;
    private String color;
    private boolean limited;
    // 최소한 세터가 없으면 값을 못바꾸는 상태

    public Pen() {
        // 팬 클래스 생성자
        // limited를 파라미터로 받는 생성자 호출
        this(false);

    }

    // 한정판 생성을 위한 오버로딩 생성자
    public Pen(boolean limited) {
        // 생성자도 오버로드 된다.
        this.limited = limited;

        if (limited) { // Limited == ture 묻는것과 동일
            name = "모나미153-G";
            price = 20000;
            color = "금색";
            
        }else{
            name =  "모나미153";
            price = 500;
            color = "흰색";
        }

    }

    public void info() {
        System.out.println("이름 : " + name);
        System.out.println("가격 : " + price);
        System.out.println("일반판");
        System.out.println("-----------------");

        if (!limited){ //limited == false
            System.out.println("일반판 /" + color);

        }else{
            System.out.println("한정판 / "+ color);
        }

    }

}
