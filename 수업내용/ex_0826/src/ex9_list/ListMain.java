package ex9_list;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        
        List<Student> list = new ArrayList<Student>();

        Student s1 = new Student();
        s1.setName("홍길동");
        s1.setAge(20);

        Student s2 = new Student();
        s2.setName("김길동");
        s2.setAge(30);

        list.add(s1);
        list.add(s2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + "/" + list.get(i).getAge());
        }

    }//main
}
