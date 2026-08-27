package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;

public class Ex2_FileInput {

    public static void main(String[] args) {

        String path = "c:/myFile/test.txt";
        File f = new File(path);

        byte[] read = new byte[100];
        FileInputStream fis = null;

        if (f.exists()) {

            try {

                fis = new FileInputStream(f);

                // 파일의 데이터를 byte[]에 담는다.
                fis.read(read);

                // byte[]를 문자열로 변환
                String res = new String(read).trim();

                System.out.println(res);

                fis.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
