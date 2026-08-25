package ex1_inheritance;

public class ExtendsMain {

    public static void main(String[] args) {

        Child c1 = new Child();
        System.out.println(c1.car); // .찍어서 메서드로 접근하는거.

        // 상속관계의 객체들에서 자식클래스는
        // 부모가 가진 속성이나 메서드를 마음대로 가져다 쓸 수 있다.
        System.out.println(c1.money); // 자식으로부터 머니를 호출할 수 있어요.
        System.out.println(c1.str); // 자식입장에서 부모가 가진 재산을 .찍어서 가져올 수 있다.
        // *예외 : 부모가 private로 만들면 못가져옴

        Parent p1 = new Parent();
        // 부모객체는 자식객체의 속성을 가져다 쓸 수 없다.
        // ex) System.out.println( p1.car);

        if (c1 instanceof Parent) { // 출발지점이 동일합니까? 묻는코드
            System.out.println("c1은 Parent의 자식이 맞습니다.");
        }

    }// main

}

// 시작점이 같다 == 인스턴스가 같다.

// ex) 애니멀 클래스(부모)를 만들고 공통적인 눈 2개 / 다리 4개 등..
// 공통분모를 호출 할 수 있다. 라는 장점
// 객체마다의 특징은 본인들이 갖으면된다.
