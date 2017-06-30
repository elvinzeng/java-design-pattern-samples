package com.gelvt.gofdp;

import com.gelvt.gofdp.prototype.Coordinate;
import com.gelvt.gofdp.prototype.Polygon;
import com.gelvt.gofdp.prototype.Rectangle;
import com.gelvt.gofdp.prototype.Triangle;

/**
 * Desc: Client
 * Author: Elvin Zeng
 * Date: 17-6-30.
 */
public class App {
    public static void main(String[] args){
        //  先创建一个三角形原型和一个矩形原型
        Triangle trianglePrototype = new Triangle();
        trianglePrototype.setName("新建三角形");
        trianglePrototype.setVertex1(new Coordinate(1, 1));
        trianglePrototype.setVertex2(new Coordinate(4, 1));
        trianglePrototype.setVertex3(new Coordinate(2, 3));
        trianglePrototype.setColor("black");
        trianglePrototype.setBorderWidth(1);
        //  这里可以想象成还要三角形set很多其他的属性

        Rectangle rectanglePrototype = new Rectangle();
        rectanglePrototype.setName("新建矩形");
        rectanglePrototype.setVertex1(new Coordinate(1, 1));
        rectanglePrototype.setVertex2(new Coordinate(4, 1));
        rectanglePrototype.setVertex3(new Coordinate(1, 3));
        rectanglePrototype.setVertex4(new Coordinate(4, 3));
        rectanglePrototype.setColor("gray");
        rectanglePrototype.setBorderWidth(1);
        //  同样，这里可以想象成还要给矩形set很多其他的属性

        //  现在，我想将上面的三角形和矩形平移并复制多份插入画板中
        System.out.println("平移复制10份三角形");
        for(int i = 0; i < 10; i++){
            Triangle triangle = (Triangle)trianglePrototype.clone();
            triangle.setName("三角新" + (i + 1));
            triangle.getVertex1().setX(triangle.getVertex1().getX() + 1);
            triangle.getVertex2().setX(triangle.getVertex2().getX() + 1);
            triangle.getVertex3().setX(triangle.getVertex3().getX() + 1);
            appendToCanvas(triangle);
        }

        System.out.println("平移复制10份矩形");
        for(int i = 0; i < 10; i++){
            Rectangle rectangle = (Rectangle)rectanglePrototype.clone();
            rectangle.setName("矩形" + (i + 1));
            rectangle.getVertex1().setX(rectangle.getVertex1().getX() + 1);
            rectangle.getVertex2().setX(rectangle.getVertex2().getX() + 1);
            rectangle.getVertex3().setX(rectangle.getVertex3().getX() + 1);
            rectangle.getVertex4().setX(rectangle.getVertex4().getX() + 1);
            appendToCanvas(rectangle);
        }
    }

    private static void appendToCanvas(Polygon polygon){
        //  这里是将多边形插入画板并绘制的模拟操作，自己发挥想象力。
        System.out.println(polygon.toString());
    }
}
