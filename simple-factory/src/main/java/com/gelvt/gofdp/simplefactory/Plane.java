package com.gelvt.gofdp.simplefactory;

/**
 * Desc: 飞机
 * Author: Elvin Zeng
 * Date: 17-6-11.
 */
public class Plane extends Carrier{
    Plane(){}

    @Override
    public void transport(String goods, String destination) {
        System.out.println(String.format("用飞机将%s运输到%s", goods, destination));
    }
}
