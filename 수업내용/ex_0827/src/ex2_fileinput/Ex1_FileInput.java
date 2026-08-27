package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;

public class Ex1_FileInput {

    public static void main(String[] args) {

        String path = "c:/myFile/test.txt";
        File f = new File(path);

        if (f.exists()) {

            try {

                // File 객체와 실제 입력 스트림을 연결
                FileInputStream fis = new FileInputStream(f);

                int code = 0;

                // read()는 더 읽을 데이터가 없으면 -1을 반환
                while ((code = fis.read()) != -1) {
                    System.out.print((char) code);
                }

                fis.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
