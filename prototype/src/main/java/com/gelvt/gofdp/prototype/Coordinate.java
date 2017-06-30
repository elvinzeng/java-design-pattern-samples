package com.gelvt.gofdp.prototype;

/**
 * Desc: 平面直角坐标系的坐标
 * Author: Elvin Zeng
 * Date: 17-6-30.
 */
public class Coordinate {
    private double x;
    private double y;

    public Coordinate(){}

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate(Coordinate another){
        this.x = another.getX();
        this.y = another.getY();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}
