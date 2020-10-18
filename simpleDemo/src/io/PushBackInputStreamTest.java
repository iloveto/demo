package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * 回退流
 * 可以将读取的字节回退到流中，当做什么事都没发生。
 */
public class PushBackInputStreamTest {
    public static void main(String[] args) throws IOException {
        PushbackInputStream input = new PushbackInputStream(new FileInputStream("C:\\Users\\study\\Desktop\\新建文本文档.txt"));
        int data = input.read();
        System.out.println(data);
        input.unread(data);//如果注释unread，则两次read的内容不一样。因为没有回退
        int data2 = input.read();
        System.out.println(data2);
    }
}
