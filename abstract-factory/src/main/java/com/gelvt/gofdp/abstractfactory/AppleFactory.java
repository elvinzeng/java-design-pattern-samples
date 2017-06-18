package com.gelvt.gofdp.abstractfactory;

/**
 * Desc: 苹果公司的工厂
 * Author: Elvin Zeng
 * Date: 17-6-18.
 */
public class AppleFactory implements DigitalEquipmentFactory {
    @Override
    public Laptop manufactureLaptop() {
        return new MacBook();
    }

    @Override
    public Phone manufacturePhone() {
        return new IPhone();
    }

    @Override
    public SmartWatch manufactureSmartWatch() {
        return new AppleWatch();
    }
}
