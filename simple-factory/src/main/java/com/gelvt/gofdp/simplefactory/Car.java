package com.gelvt.gofdp.simplefactory;

/**
 * Desc: 汽车
 * Author: Elvin Zeng
 * Date: 17-6-11.
 */
public class Car extends Carrier{
    Car(){}

    @Override
    public void transport(String goods, String destination) {
        System.out.println(String.format("用汽车将%s运输到%s", goods, destination));
    }
}
