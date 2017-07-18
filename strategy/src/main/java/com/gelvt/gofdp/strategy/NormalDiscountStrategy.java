package com.gelvt.gofdp.strategy;

/**
 * 普通客户折扣策略
 * @author: Elvin Zeng
 * @date: 17-7-18.
 */
public class NormalDiscountStrategy implements DiscountStrategy {
    @Override
    public double discount(double originalPrice) {
        if (originalPrice < 100){
            return originalPrice * 0.95;
        }else if(originalPrice < 500){
            return originalPrice * 0.90;
        }else if(originalPrice < 5000){
            return originalPrice * 0.85;
        }else{
            return originalPrice * 0.75;
        }
    }
}
