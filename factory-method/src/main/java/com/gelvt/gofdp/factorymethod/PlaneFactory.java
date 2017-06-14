package com.gelvt.gofdp.factorymethod;

/**
 * Desc: 飞机工厂
 * Author: Elvin Zeng
 * Date: 17-6-15.
 */
public class PlaneFactory implements CarrierFactory {
    @Override
    public Carrier newInstance() {
        return new Plane();
    }
}
