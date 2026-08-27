package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;

public class Ex5_work {

    public static void main(String[] args) {

        // C:/myFile/work2.txt 내용을 읽어서
        // 읽어온 문자열이 회문인지 확인
        //
        // 예)
        // 토마토은(는) 회문입니다.

        String path = "c:/myFile/work2.txt";
        File f = new File(path);

        if (!f.exists()) {
            System.out.println("파일이 없습니다 : " + path);
            return;
        }

        byte[] console = new byte[(int) f.length()];
        FileInputStream fis = null;

        String ori = "";
        String rev = "";

        try {

            fis = new FileInputStream(f);
            fis.read(console);

            ori = new String(console).trim();

            // 원본문자열(ori)을 뒤집어서 rev에 저장
            for (int i = ori.length() - 1; i >= 0; i--) {
                rev += ori.charAt(i);
            }

            if (ori.equals(rev)) {
                System.out.println(ori + "은(는) 회문");
            } else {
                System.out.println(ori + "은(는) 안회문");
            }

            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
