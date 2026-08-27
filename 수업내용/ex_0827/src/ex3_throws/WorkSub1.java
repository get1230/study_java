package ex3_throws;

import java.io.File;
import java.io.FileInputStream;

public class WorkSub1 {

    File f = new File(MyPath.PATH + "test.txt");
    FileInputStream fis = null;

    public void result() {

        try {

            fis = new FileInputStream(f);

            byte[] console = new byte[(int) f.length()];
            fis.read(console);

            System.out.println(new String(console).trim());

            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
