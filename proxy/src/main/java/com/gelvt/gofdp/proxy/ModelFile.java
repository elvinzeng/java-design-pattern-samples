package com.gelvt.gofdp.proxy;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 3D模型文件
 * @author: Elvin Zeng
 * @date: 17-7-13.
 */
public interface ModelFile {
    /**
     * @return 模型文件所处位置的uri
     */
    String getUri();

    /**
     * @return 模型文件名
     */
    String getName();

    /**
     * @return 3D模型的面片数据
     */
    List<Polygon> getPolygons();

}
