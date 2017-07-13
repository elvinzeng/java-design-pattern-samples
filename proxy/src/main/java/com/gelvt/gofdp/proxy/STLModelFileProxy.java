package com.gelvt.gofdp.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * STL模型文件的虚代理
 * @author: Elvin Zeng
 * @date: 17-7-14.
 */
public class STLModelFileProxy implements ModelFile{
    private String uri;
    private String name;
    private STLModelFile realModelFile;

    public STLModelFileProxy(String uri, String name) {
        this.uri = uri;
        this.name = name;
    }

    @Override
    public String getUri() {
        return this.uri;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<Polygon> getPolygons() {
        if (null == realModelFile){
            //  在这里根据uri去加载真实的3D模型文件信息并初始化polygons
            //  这里只是演示，你想象成下面这句是从this.uri指定的位置加载的数据。
            List<Polygon> polygons = new ArrayList<>();
            try {
                //  这里休眠一会儿模拟从网络中下载文件消耗的时间
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.realModelFile = new STLModelFile(uri, name, polygons);
        }
        return this.realModelFile.getPolygons();
    }
}
