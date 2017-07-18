package com.gelvt.gofdp.strategy;

/**
 * Vip客户的折扣策略
 * @author: Elvin Zeng
 * @date: 17-7-18.
 */
public class VipDiscountStrategy implements DiscountStrategy{
    @Override
    public double discount(double originalPrice) {
        if (originalPrice < 100){
            return originalPrice * 0.85;
        }else if(originalPrice < 500){
            return originalPrice * 0.80;
        }else if(originalPrice < 5000){
            return originalPrice * 0.75;
        }else{
            return originalPrice * 0.65;
        }
    }
}
