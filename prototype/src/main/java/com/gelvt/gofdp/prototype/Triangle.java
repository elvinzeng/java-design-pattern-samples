package com.gelvt.gofdp.prototype;

/**
 * Desc: 三角形
 * Author: Elvin Zeng
 * Date: 17-6-30.
 */
public class Triangle extends Polygon{
    private Coordinate vertex1;
    private Coordinate vertex2;
    private Coordinate vertex3;

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

    @Override
    public Polygon clone() {
        Triangle triangle = new Triangle();
        triangle.setName(this.getName());
        triangle.setVertex1(this.vertex1);
        triangle.setVertex2(this.vertex2);
        triangle.setVertex3(this.vertex3);
        triangle.setBorderWidth(this.getBorderWidth());
        triangle.setColor(this.getColor());
        return triangle;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "vertex1=" + vertex1 +
                ", vertex2=" + vertex2 +
                ", vertex3=" + vertex3 +
                ", color=" + this.getColor() +
                ", borderWidth=" + this.getBorderWidth() +
                '}';
    }
}
