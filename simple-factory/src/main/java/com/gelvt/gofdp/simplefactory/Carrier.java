package com.gelvt.gofdp.simplefactory;

/**
 * Desc: 运载工具
 * Author: Elvin Zeng
 * Date: 17-6-11.
 */
public abstract class Carrier {
    /**
     * 将指定货物运输到指定目的地
     * @param goods: 货物
     * @param destination: 目的地
     */
    public abstract void transport(String goods, String destination);
}
