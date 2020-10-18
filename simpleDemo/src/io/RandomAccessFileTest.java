package io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    private final static String filePath_r = "c:\\Users\\study\\Desktop\\test_r.txt";
    private final static String filePath_rw = "c:\\Users\\study\\Desktop\\test_rw.txt";
    private final static String filePath_rws = "c:\\Users\\study\\Desktop\\test_rws.txt";
    private final static String filePath_rwd = "c:\\Users\\study\\Desktop\\test_rwd.txt";
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf_r = new RandomAccessFile(filePath_r,"r");
        System.out.println("文本长度" + raf_r.length());
        System.out.println("" + raf_r.getFilePointer());
        raf_r.seek(4);
        System.out.println(""+raf_r.getFilePointer());

        RandomAccessFile raf_rw = new RandomAccessFile(filePath_rw,"rw");
        raf_rw.seek(100);
        String word = "ljh";
        raf_rw.write(word.getBytes());

        RandomAccessFile raf_rws = new RandomAccessFile(filePath_rws,"rws");

        RandomAccessFile raf_rwd = new RandomAccessFile(filePath_rwd,"rwd");
    }
}
