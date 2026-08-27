package ex1_file;

import java.io.File;

public class Ex1_File {

    public static void main(String[] args) {

        // IO(Input / Output)
        // IO는 입출력을 의미한다.
        // File 객체는 "파일의 내용"을 읽는 객체가 아니라
        // 파일/폴더의 경로와 상태를 다루는 객체이다.

        String path = "c:/myFile/test.txt";
        File f = new File(path);

        System.out.println("존재 여부 : " + f.exists());
        System.out.println("파일인가? : " + f.isFile());
        System.out.println("폴더인가? : " + f.isDirectory());
        System.out.println("크기(byte) : " + f.length());
    }
}
