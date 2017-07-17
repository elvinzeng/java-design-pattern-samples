package com.gelvt.gofdp.strategy;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 压缩策略
 * @author: Elvin Zeng
 * @date: 17-7-16.
 */
public interface CompressionStrategy {
    /**
     * 压缩指定的文件
     * @param in 输入文件
     * @param out 输出文件
     */
    void compact(File in, File out);
}
