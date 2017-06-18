package com.gelvt.gofdp.abstractfactory;

/**
 * Desc: 数码装备工厂
 * Author: Elvin Zeng
 * Date: 17-6-18.
 */
public interface DigitalEquipmentFactory {

    /**
     * @return 笔记本电脑
     */
    Laptop manufactureLaptop();

    /**
     * @return 手机
     */
    Phone manufacturePhone();

    /**
     * @return 智能手表
     */
    SmartWatch manufactureSmartWatch();
}
