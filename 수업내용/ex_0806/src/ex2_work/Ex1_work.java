package ex2_work;

public class Ex1_work {
    public static void main(String[] args) {
        

        //나이가 15세 이상이거나, 키가 150cm이상이면 탑승가능
        //그렇지 않으면 탑승불가를 출력

        int age = 17;
        int height = 170;
        String str = "";

        if( age >= 15 || height >= 150 ){str = "탑승가능";}
        else{str = "탑승불가";}
        System.out.println(str);

        //삼학연산자로 해보자

        String res = ( age >= 15 || height >= 150 ) ? "탑승가능" : "탑승불가";
        System.out.println(res);


    }//main
}
