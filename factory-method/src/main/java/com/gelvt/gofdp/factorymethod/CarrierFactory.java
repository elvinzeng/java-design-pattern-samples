package com.gelvt.gofdp.factorymethod;

/**
 * Desc: 运载工具工厂
 * Author: Elvin Zeng
 * Date: 17-6-14.
 */
public interface CarrierFactory {
    /**
     * 创建运载工具的实例
     * @return 运载工具实例
     */
    Carrier newInstance();
}
