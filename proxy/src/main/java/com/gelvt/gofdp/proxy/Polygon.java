package com.gelvt.gofdp.proxy;

import java.util.Arrays;

/**
 * 三角面片信息
 * @author: Elvin Zeng
 * @date: 17-7-14.
 */
public class Polygon {
    private Vertex[] vertices;
    private Vertex normal;

    /**
     * @return 所有顶点
     */
    public Vertex[] getVertices() {
        return vertices;
    }

    /**
     * @param vertices 所有的顶点
     */
    public void setVertices(Vertex[] vertices) {
        this.vertices = vertices;
    }

    /**
     * @return 法向量顶点
     */
    public Vertex getNormal() {
        return normal;
    }

    /**
     * @param normal 法向量顶点
     */
    public void setNormal(Vertex normal) {
        this.normal = normal;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                ", normal=" + normal +
                '}';
    }
}