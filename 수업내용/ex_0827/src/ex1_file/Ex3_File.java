package ex1_file;

import java.io.File;

public class Ex3_File {

    public static void main(String[] args) {

        String path = "c:/myFile";
        File f = new File(path);

        if (!f.exists()) {

            // mkdir()  : 바로 위 부모 폴더가 이미 있을 때
            // mkdirs() : 필요한 상위 폴더까지 함께 만들 때
            boolean result = f.mkdirs();

            System.out.println("폴더 생성 : " + result);
        } else {
            System.out.println("이미 존재하는 폴더입니다.");
        }
    }
}
