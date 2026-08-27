package ex3_throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WorkSub2 {

    File f = new File(MyPath.PATH + "work.txt");
    byte[] console = new byte[(int) f.length()];
    FileInputStream fis = null;

    // throws
    // => 이 메서드 안에서 예외를 직접 처리하지 않고
    //    이 메서드를 호출한 쪽으로 예외 처리를 넘긴다.
    public void result() throws FileNotFoundException, IOException {

        fis = new FileInputStream(f);
        fis.read(console);

        System.out.println(new String(console).trim());

        fis.close();
    }
}
