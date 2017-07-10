package com.gelvt.gofdp.decorator;

import java.io.*;

/**
 * 带缓冲的输入流
 * 来自Java.io，为了演示精简了一下。
 * @author: Elvin Zeng
 * @date: 17-7-10.
 */
public class BufferedInputStream extends FilterInputStream{
    public BufferedInputStream(InputStream in) {
        super(in);
    }

    @Override
    public synchronized int read() throws IOException {
        //  从缓冲区中读取下一个字节
        //  这里仅仅只是演示，所以直接返回原始流中的下一个字节
        return this.in.read();
    }
}
