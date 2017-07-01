package com.gelvt.gofdp.adapter;

import java.io.IOException;
import java.io.InputStream;

/**
 * Desc: 资源加载器
 * Author: Elvin Zeng
 * Date: 17-7-1.
 */
public interface ResourceLoader {
    /**
     * 将资源一流的形式加载进来
     * @param resource 要加载的资源
     * @return 资源的输入流
     */
    InputStream loadResourceAsStream(Resource resource) throws IOException;
}
