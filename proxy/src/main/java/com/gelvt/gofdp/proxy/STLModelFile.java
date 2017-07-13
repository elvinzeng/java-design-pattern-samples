package com.gelvt.gofdp.proxy;

import java.util.List;

/**
 * 3D模型文件
 * @author: Elvin Zeng
 * @date: 17-7-13.
 */
public class STLModelFile implements ModelFile{

    private String uri;
    private String name;
    private List<Polygon> polygons;

    public STLModelFile(String uri, String name, List<Polygon> polygons){
        this.uri = uri;
        this.name = name;
        this.polygons = polygons;
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
        return polygons;
    }
}
