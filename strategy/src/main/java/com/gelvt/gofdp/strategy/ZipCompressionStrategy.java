package com.gelvt.gofdp.strategy;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author: Elvin Zeng
 * @date: 17-7-16.
 */
public class ZipCompressionStrategy implements CompressionStrategy {
    @Override
    public void compact(File in, File out) {
        BufferedInputStream bis = null;
        ZipOutputStream zipOutputStream = null;
        byte[] buffer = new byte[1024];
        int len = -1;
        try {
            bis = new BufferedInputStream(new FileInputStream(in));
            zipOutputStream = new ZipOutputStream(new FileOutputStream(out));
            zipOutputStream.putNextEntry(new ZipEntry(out.getName()));
            while ((len = bis.read(buffer)) > 0) {
                zipOutputStream.write(buffer, 0, len);
            }
            zipOutputStream.flush();
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
            if (null != zipOutputStream){
                try {
                    zipOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
