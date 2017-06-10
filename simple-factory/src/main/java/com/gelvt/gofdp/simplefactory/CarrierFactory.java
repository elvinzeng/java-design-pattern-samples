package com.gelvt.gofdp.simplefactory;

/**
 * Desc: 运载工具工厂
 * Author: Elvin Zeng
 * Date: 17-6-11.
 */
public class CarrierFactory {
    /**
     * 获取指定的运载工具
     * @param type 运载工具的类型
     * @return 运载工具实例
     */
    public static Carrier getCarrier(CarrierType type){
        switch (type) {
            case CAR:
                return new Car();
            case SHIP:
                return new Ship();
            case PLANE:
                return new Plane();
            default:
                throw new IllegalArgumentException("未知的运载工具");
        }
    }
}
