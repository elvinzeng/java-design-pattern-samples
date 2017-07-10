package com.gelvt.gofdp.decorator;

import java.io.IOException;

/**
 * 从字节数组中读取数据的输入流
 * 来自Java.io，为了演示精简了一下。
 * @author: Elvin Zeng
 * @date: 17-7-10.
 */
public class ByteArrayInputStream extends InputStream{

    protected byte buf[];
    protected int pos;
    protected int count;

    public ByteArrayInputStream(byte buf[]) {
        this.buf = buf;
        this.pos = 0;
        this.count = buf.length;
    }

    @Override
    public int read() throws IOException {
        return (pos < count) ? (buf[pos++] & 0xff) : -1;
    }
}
