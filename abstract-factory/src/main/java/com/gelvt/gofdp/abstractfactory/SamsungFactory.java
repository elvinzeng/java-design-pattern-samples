package com.gelvt.gofdp.abstractfactory;

/**
 * Desc: 三星公司的工厂
 * Author: Elvin Zeng
 * Date: 17-6-18.
 */
public class SamsungFactory implements DigitalEquipmentFactory{
    @Override
    public Laptop manufactureLaptop() {
        return new SamsungNoteBook();
    }

    @Override
    public Phone manufacturePhone() {
        return new SamsungGalaxy();
    }

    @Override
    public SmartWatch manufactureSmartWatch() {
        return new GalaxyGear();
    }
}
