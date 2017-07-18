package com.gelvt.gofdp.strategy;

/**
 * 折扣策略
 * @author: Elvin Zeng
 * @date: 17-7-18.
 */
public interface DiscountStrategy {
    /**
     * 打折
     * @param originalPrice 原价
     * @return 折后价
     */
    double discount(double originalPrice);
}
