package com.gelvt.gofdp.adapter;

import java.io.File;
import java.net.URI;

/**
 * Desc: 资源的抽象
 * Author: Elvin Zeng
 * Date: 17-7-1.
 */
public interface Resource {
    /**
     * 指示当前资源是否存在
     */
    boolean exists();

    /**
     * 返回指定资源的文件对象
     */
    File getFile();

    /**
     * 获取资源的文件名
     */
    String getFilename();

    /**
     * 返回资源的URI
     */
    URI getURI();
}
