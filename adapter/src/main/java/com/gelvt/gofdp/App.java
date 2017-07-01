package com.gelvt.gofdp;

import com.gelvt.gofdp.adapter.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Desc: Client
 * Author: Elvin Zeng
 * Date: 17-6-21.
 */
public class App {
    public static void main(String[] args)
            throws IOException {
        //  下面演示通过最新的ResourceLoader去加载配置
        Resource configFile = new FileSystemResource("app.config");

        //  通过系统遗留的api去加载文件
        InputStream is1 = loadConfigAsStream1(configFile);
        //  通过“高手”封装的工具去加载文件
        InputStream is2 = loadConfigAsStream2(configFile);
    }

    private static InputStream loadConfigAsStream1(Resource configFile)
            throws IOException {
        ResourceLoader loader = new OldFileLoaderAdapter();
        return loader.loadResourceAsStream(configFile);
    }

    private static InputStream loadConfigAsStream2(Resource configFile)
            throws IOException {
        ResourceLoader loader = new UglyFileLoaderAdapter(new UglyFileLoader());
        return loader.loadResourceAsStream(configFile);
    }
}
