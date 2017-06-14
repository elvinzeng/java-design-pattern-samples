package com.gelvt.gofdp.factorymethod;

/**
 * Desc: 汽车工厂
 * Author: Elvin Zeng
 * Date: 17-6-15.
 */
public class CarFactory implements CarrierFactory{

    @Override
    public Carrier newInstance() {
        return new Car();
    }
}
