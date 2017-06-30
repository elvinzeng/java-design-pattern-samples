package com.gelvt.gofdp.prototype;

import org.w3c.dom.css.Rect;

/**
 * Desc: 矩形
 * Author: Elvin Zeng
 * Date: 17-6-30.
 */
public class Rectangle extends Polygon{
    private Coordinate vertex1;
    private Coordinate vertex2;
    private Coordinate vertex3;
    private Coordinate vertex4;

    public Coordinate getVertex1() {
        return vertex1;
    }

    public void setVertex1(Coordinate vertex1) {
        this.vertex1 = vertex1;
    }

    public Coordinate getVertex2() {
        return vertex2;
    }

    public void setVertex2(Coordinate vertex2) {
        this.vertex2 = vertex2;
    }

    public Coordinate getVertex3() {
        return vertex3;
    }

    public void setVertex3(Coordinate vertex3) {
        this.vertex3 = vertex3;
    }

    public Coordinate getVertex4() {
        return vertex4;
    }

    public void setVertex4(Coordinate vertex4) {
        this.vertex4 = vertex4;
    }

    @Override
    public Polygon clone() {
        Rectangle rectangle = new Rectangle();
        rectangle.setName(this.getName());
        rectangle.setVertex1(this.vertex1);
        rectangle.setVertex2(this.vertex2);
        rectangle.setVertex3(this.vertex3);
        rectangle.setVertex4(this.vertex4);
        rectangle.setBorderWidth(this.getBorderWidth());
        rectangle.setColor(this.getColor());
        return rectangle;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "vertex1=" + vertex1 +
                ", vertex2=" + vertex2 +
                ", vertex3=" + vertex3 +
                ", vertex4=" + vertex4 +
                ", color=" + this.getColor() +
                ", borderWidth=" + this.getBorderWidth() +
                '}';
    }
}
