package com.gelvt.gofdp.adapter;

import java.io.*;

/**
 * Desc: UglyFileLoader的适配器
 * Author: Elvin Zeng
 * Date: 17-7-1.
 */
public class UglyFileLoaderAdapter implements ResourceLoader{
    private UglyFileLoader uglyFileLoader;

    public UglyFileLoaderAdapter(UglyFileLoader uglyFileLoader){
        this.uglyFileLoader = uglyFileLoader;
    }


    @Override
    public InputStream loadResourceAsStream(Resource resource)
            throws IOException {
        //  通过resource参数获取资源位置，然后解析路径并设置好下面两个变量（简单的说就是转换参数格式）。
        String prefix = "";
        String filename = "";
        //  调用“高手”封装的文件加载器去获取资源
        File file = this.uglyFileLoader.getFile(prefix, filename);
        return new FileInputStream(file);
    }
}
