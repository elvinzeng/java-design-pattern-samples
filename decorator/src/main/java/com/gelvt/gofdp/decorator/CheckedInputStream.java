package com.gelvt.gofdp.decorator;

import java.io.*;
import java.util.zip.Checksum;

/**
 * 可以一边读取一边计算校验和的输入流
 * 来自java.util.zip，为了演示精简了一下。
 * @author: Elvin Zeng
 * @date: 17-7-10.
 */
public class CheckedInputStream extends FilterInputStream{
    private Checksum cksum;

    public CheckedInputStream(InputStream in, Checksum cksum) {
        super(in);
        this.cksum = cksum;
    }

    @Override
    public int read() throws IOException {
        //  可以一边读取数据一边计算校验和
        int b = in.read();
        if (b != -1) {
            cksum.update(b);
        }
        return b;
    }

    public Checksum getChecksum() {
        return cksum;
    }
}
