package ex4_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {

        // id : aaa
        // aaa 회원이 등록되었습니다.
        // id : bbb
        // aaa 회원
        // bbb 회원이 등록되었습니다.
        //.......
        // id : 
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();

        while (true) {

            System.out.print("id : ");
            String id = sc.next();

            if(list.contains(id)){
                System.out.println("중복된 회원입니다.");
                continue;
            }

            list.add(id);

            //전체회원
            for(int i = 0; i < list.size(); i++){
                System.out.println(list.get(i) + " 회원");
            }//for

            System.out.println(id + " 회원이 등록되었습니다.");

        }//while

    }//main
}
