package ex0_list_review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMain {

    public static void main(String[] args) {

        // 학생 수 : 2
        // ----------------
        // 이름 : 홍길동
        // 국어 : 99
        // 영어 : 80
        // ----------------
        // 이름 : 김길동
        // 국어 : 85
        // 영어 : 70
        // ----------------
        // 학생 정보 전체 출력
        // 반 전체 평균 출력

        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<Student>();

        System.out.print("학생 수 : ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {

            System.out.print("이름 : ");
            String name = sc.next();

            System.out.print("국어 : ");
            int kor = sc.nextInt();

            System.out.print("영어 : ");
            int eng = sc.nextInt();

            Student stu = new Student(name, kor, eng);
            list.add(stu);

            System.out.println("----------------");
        }

        float allAvg = 0;

        for (int i = 0; i < list.size(); i++) {

            list.get(i).studentInfo();
            allAvg += list.get(i).getAvg();
        }

        if (list.size() > 0) {
            System.out.printf("반 전체 평균 : %.2f%n", allAvg / list.size());
        }

        sc.close();
    }
}
