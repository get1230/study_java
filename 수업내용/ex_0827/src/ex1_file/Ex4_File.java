package ex1_file;

import java.io.File;

public class Ex4_File {

    public static void main(String[] args) {

        String path = "c:/myFile/abc";
        File f = new File(path);

        // !f.exists()
        // => 해당 경로가 존재하지 않는다면
        if (!f.exists()) {

            System.out.println("폴더를 생성합니다.");

            // 중간 폴더까지 필요하면 mkdirs()를 사용
            f.mkdirs();
        }
    }
}
