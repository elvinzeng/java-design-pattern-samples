package com.gelvt.gofdp;

import com.gelvt.gofdp.decorator.BufferedInputStream;
import com.gelvt.gofdp.decorator.ByteArrayInputStream;
import com.gelvt.gofdp.decorator.CheckedInputStream;
import com.gelvt.gofdp.decorator.InputStream;

import java.io.IOException;
import java.util.zip.CRC32;

/**
 * Client
 * @author: Elvin Zeng
 * @date: 17-7-10.
 */
public class App {
    public static void main(String[] args){
        byte[] bytes = "My name is Elvin Zeng.".getBytes();

        readBytesByRawInputStream(bytes);
        readBytesByBufferedInputStream(bytes);
        readBytesByCheckedInputStream(bytes);
        readBytesByBufferedCheckedInputStream(bytes);
        //  应为这个示例代码其实并不是真正的流，所以后续代码省略关闭流的操作。
        //  打开了流不关闭是不负责任的行为，真实代码中请务必关闭。
    }

    private static void readBytesByRawInputStream(byte[] bytes){
        InputStream is = null;

        int data = -1;
        try {
            is = new ByteArrayInputStream(bytes);
            while (-1 != (data = is.read())){
                System.out.print((char) data);
            }
            System.out.println("-------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readBytesByBufferedInputStream(byte[] bytes){
        InputStream is = null;

        int data = -1;
        try {
            is = new ByteArrayInputStream(bytes);
            //  用BufferedInputStream这个装饰器对ByteArrayInputStream进行包装
            is = new BufferedInputStream(is);
            while (-1 != (data = is.read())){
                System.out.print((char) data);
            }
            System.out.println("-------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readBytesByCheckedInputStream(byte[] bytes){
        InputStream is = null;

        int data = -1;
        try {
            is = new ByteArrayInputStream(bytes);
            //  用CheckedInputStream这个装饰器对ByteArrayInputStream进行包装
            CheckedInputStream cis = new CheckedInputStream(is, new CRC32());

            while (-1 != (data = cis.read())){
                System.out.print((char) data);
            }
            System.out.println(" crc32:" + cis.getChecksum().getValue());
            System.out.println("-------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readBytesByBufferedCheckedInputStream(byte[] bytes){
        InputStream is = null;

        int data = -1;
        try {
            is = new ByteArrayInputStream(bytes);
            //  先用BufferedInputStream这个装饰器对ByteArrayInputStream进行包装
            is = new BufferedInputStream(is);
            //  再用CheckedInputStream这个装饰器对已经缓冲的流进行再次包装
            CheckedInputStream cis = new CheckedInputStream(is, new CRC32());
            while (-1 != (data = cis.read())){
                System.out.print((char) data);
            }
            System.out.println(" crc32:" + cis.getChecksum().getValue());
            System.out.println("-------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
