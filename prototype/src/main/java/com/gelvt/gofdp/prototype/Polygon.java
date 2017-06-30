package com.gelvt.gofdp.prototype;

/**
 * Desc: 多边形
 * Author: Elvin Zeng
 * Date: 17-6-30.
 */
public abstract class Polygon {
    private String color;
    private int borderWidth;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;  //  多边形名称

    /**
     * 克隆这个多边形(深拷贝)
     * @return 当前多边形的副本
     */
    public abstract Polygon clone();
}
