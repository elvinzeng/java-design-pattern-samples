package com.gelvt.gofdp.simplefactory;

/**
 * Desc: 轮船
 * Author: Elvin Zeng
 * Date: 17-6-11.
 */
public class Ship extends Carrier{
    Ship(){}

    @Override
    public void transport(String goods, String destination) {
        System.out.println(String.format("用轮船将%s运输到%s", goods, destination));
    }
}
