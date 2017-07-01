package com.gelvt.gofdp.adapter;

import java.io.*;

/**
 * Desc: OldFileLoader的适配器
 * Author: Elvin Zeng
 * Date: 17-7-1.
 */
public class OldFileLoaderAdapter extends OldFileLoader
        implements ResourceLoader{

    @Override
    public InputStream loadResourceAsStream(Resource resource)
            throws IOException {
        //  假设这里路径还经过了一系列的处理
        //  比如资源uri的前缀转换等
        String filePath = resource.getURI().toString();
        File file = this.getFile(filePath);
        return new FileInputStream(file);
    }
}
