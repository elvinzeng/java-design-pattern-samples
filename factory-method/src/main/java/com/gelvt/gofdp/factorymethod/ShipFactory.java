package com.gelvt.gofdp.factorymethod;

/**
 * Desc: 轮船工厂
 * Author: Elvin Zeng
 * Date: 17-6-15.
 */
public class ShipFactory implements CarrierFactory{
    @Override
    public Carrier newInstance() {
        return new Ship();
    }
}
