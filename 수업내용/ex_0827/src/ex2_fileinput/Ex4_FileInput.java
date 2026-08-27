package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;

public class Ex4_FileInput {

    public static void main(String[] args) {

        String path = "c:/myFile/work.txt";
        File f = new File(path);

        if (!f.exists()) {
            System.out.println("파일이 없습니다 : " + path);
            return;
        }

        try {

            FileInputStream fis = new FileInputStream(f);

            int code = 0;
            int sum = 0; // 정수들의 총합 계산용

            while ((code = fis.read()) != -1) {

                char ch = (char) code;
                System.out.print(ch);

                // 영상에서 read()가 1byte씩 읽고
                // int로 반환된 뒤 char로 바꾸는 흐름을 확인한 예제.
                if (ch >= '0' && ch <= '9') {
                    sum += ch - '0';
                }
            }

            System.out.println();
            System.out.println("한 자리 숫자들의 합 : " + sum);

            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
