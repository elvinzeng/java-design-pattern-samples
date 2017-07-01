package com.gelvt.gofdp.adapter;

import java.io.File;
import java.io.IOException;

/**
 * Desc: 系统历史遗留的文件加载器
 * Author: Elvin Zeng
 * Date: 17-7-1.
 */
public class OldFileLoader {
    /**
     * 加载url指定的文件，并返回File对象。
     * @param uri 文件uri。如果是本地文件，需要以file://打头。
     * @return 指定的文件的File对象。
     */
    File getFile(String uri) throws IOException {
        //  这里调用平台的其他既有代码去搜索文件并缓存到临时目录
        //  这里为了演示，不管传入什么参数都直接返回一个测试文件。
        return File.createTempFile("com.gelvt.gofdp.adapter", ".txt");
    }

    //  这里还有其他一堆函数
}
