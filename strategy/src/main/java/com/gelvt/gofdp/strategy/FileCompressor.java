package com.gelvt.gofdp.strategy;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 文件压缩器
 * @author: Elvin Zeng
 * @date: 17-7-16.
 */
public class FileCompressor {
    private CompressionStrategy strategy;

    public FileCompressor(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public CompressionStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void compactFile(String sourceFilePath,
                         String targetFilePath) throws FileNotFoundException {
        File sourceFile = new File(sourceFilePath);
        File targetFile = new File(targetFilePath);
        if (!sourceFile.exists()){
            throw new FileNotFoundException("输入文件不存在");
        }
        if (!targetFile.getParentFile().exists()){
            throw new FileNotFoundException("输出目录不存在");
        }
        strategy.compact(sourceFile, targetFile);
    }
}
