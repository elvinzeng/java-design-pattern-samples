package com.gelvt.gofdp.decorator;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 输入流的抽象
 * 来自Java.io，为了演示精简了一下。
 * @author: Elvin Zeng
 * @date: 17-7-10.
 */
public abstract class InputStream {

    /**
     * 读取下一个字节的数据
     * @return 下一个字节
     * @throws IOException
     */
    public abstract int read() throws IOException;
}
