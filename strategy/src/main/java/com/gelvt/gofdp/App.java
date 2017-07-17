package com.gelvt.gofdp;

import com.gelvt.gofdp.strategy.FileCompressor;
import com.gelvt.gofdp.strategy.GzipCompressionStrategy;
import com.gelvt.gofdp.strategy.ZipCompressionStrategy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Client
 * @author: Elvin Zeng
 * @date: 17-7-16.
 */
public class App {
    public static void main(String[] args) throws IOException {
        //  这里先生成一个测试文件和一个目标路径
        String sourceFilePath = generateSourceFileForTest();
        String targetFilePath = generateTargetFileForTest();

        FileCompressor compressor = new FileCompressor(new ZipCompressionStrategy());
        compressor.compactFile(sourceFilePath, targetFilePath);

        //  这里先生成一个测试文件和一个目标路径
        sourceFilePath = generateSourceFileForTest();
        targetFilePath = generateTargetFileForTest();

        compressor = new FileCompressor(new GzipCompressionStrategy());
        compressor.compactFile(sourceFilePath, targetFilePath);


    }

    private static String generateSourceFileForTest() throws IOException {
        File sourceFile = File.createTempFile("FileCompressor_", ".txt");
        FileOutputStream fos = new FileOutputStream(sourceFile);
        OutputStreamWriter writer = new OutputStreamWriter(fos);
        writer.write("https://github.com/elvinzeng/java-design-pattern-samples");
        writer.flush();
        writer.close();
        fos.close();
        return sourceFile.getPath();
    }

    private static String generateTargetFileForTest() throws IOException {
        File targetFile = File.createTempFile("FileCompressor_", ".txt");
        return targetFile.getPath();
    }
}
