package ex1_file;

import java.io.File;

public class Ex2_File {

    public static void main(String[] args) {

        String path = "c:/java";
        File f = new File(path);

        if (f.isDirectory()) {

            // 하위 목록을 File[]로 받기
            File[] files = f.listFiles();

            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    System.out.println(files[i].getName());
                }
            }

            System.out.println("----------------");

            // 하위 목록의 이름만 String[]로 받기
            String[] names = f.list();

            if (names != null) {
                for (int i = 0; i < names.length; i++) {
                    System.out.println(names[i]);
                }
            }
        }
    }
}
