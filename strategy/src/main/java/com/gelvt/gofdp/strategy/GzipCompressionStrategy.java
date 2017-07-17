package com.gelvt.gofdp.strategy;

import java.io.*;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author: Elvin Zeng
 * @date: 17-7-16.
 */
public class GzipCompressionStrategy implements CompressionStrategy {
    @Override
    public void compact(File in, File out) {
        BufferedInputStream bis = null;
        GZIPOutputStream gzipOutputStream = null;
        byte[] buffer = new byte[1024];
        int len = -1;
        try {
            bis = new BufferedInputStream(new FileInputStream(in));
            gzipOutputStream = new GZIPOutputStream(new FileOutputStream(out));
            while ((len = bis.read(buffer)) > 0) {
                gzipOutputStream.write(buffer, 0, len);
            }
            gzipOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != bis){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != gzipOutputStream){
                try {
                    gzipOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
