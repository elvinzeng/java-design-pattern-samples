package com.gelvt.gofdp.decorator;

import java.io.IOException;

/**
 * 过滤流的基类（装饰器基类）
 * 来自Java.io，为了演示精简了一下。
 * @author: Elvin Zeng
 * @date: 17-7-10.
 */
public class FilterInputStream extends InputStream{
    protected volatile InputStream in;

    protected FilterInputStream(InputStream in) {
        this.in = in;
    }

    public int read() throws IOException {
        return in.read();
    }

}
