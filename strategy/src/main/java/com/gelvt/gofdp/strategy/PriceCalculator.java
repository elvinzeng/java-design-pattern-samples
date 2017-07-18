package com.gelvt.gofdp.strategy;

/**
 * 价格计算器
 * @author: Elvin Zeng
 * @date: 17-7-18.
 */
public class PriceCalculator {
    private DiscountStrategy discountStrategy;

    public PriceCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculate(double... price){
        double count = 0;
        for (double originalPrice : price){
            double discountPrice = discountStrategy.discount(originalPrice);
            count += discountPrice;
        }
        return count;
    }
}
