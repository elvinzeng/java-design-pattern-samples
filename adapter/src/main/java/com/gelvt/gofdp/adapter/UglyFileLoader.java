package com.gelvt.gofdp.adapter;

import java.io.File;
import java.io.IOException;

/**
 * Desc: 另一个系统历史遗留的文件加载器
 * 你可以想象成这个类是某一天某个“高手”觉得系统原有的那个OldFileLoader用起来很不爽，
 * 他认为那个设计弱爆了，然后通过根据自己的想法重新封装了一个。这里假设这个类的名称为UglyFileLoader。
 * Author: Elvin Zeng
 * Date: 17-7-1.
 */
public class UglyFileLoader {
    /**
     * 加载url指定的文件，并返回File对象。
     * @param prefix 文件uri的前缀。如果是本地文件，需要以file://打头。
     * @param filename 文件名
     * @return 指定的文件的File对象。
     */
    File getFile(String prefix, String filename) throws IOException {
        //  这里调用平台的其他既有代码去搜索文件并缓存到临时目录
        //  这里为了演示，不管传入什么参数都直接返回一个测试文件。
        return File.createTempFile("com.gelvt.gofdp.adapter", ".txt");
    }

    //  这里还有其他一堆函数
}
