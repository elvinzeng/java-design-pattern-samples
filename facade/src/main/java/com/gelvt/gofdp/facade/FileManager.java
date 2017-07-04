package com.gelvt.gofdp.facade;

import java.io.*;

/**
 * 文件管理器
 * @author: Elvin Zeng
 * @date: 17-7-4.
 */
public class FileManager {

    public void saveFile(File file){
        //  将file保存到系统集中存放文件的地方
        System.out.println("将文件[" + file.getPath() + "]保存到文件存储子系统");
    }

    //  这里还有一堆其他的函数
}
