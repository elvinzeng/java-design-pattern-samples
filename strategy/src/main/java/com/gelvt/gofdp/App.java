package com.gelvt.gofdp;

import com.gelvt.gofdp.strategy.NormalDiscountStrategy;
import com.gelvt.gofdp.strategy.PriceCalculator;
import com.gelvt.gofdp.strategy.VipDiscountStrategy;

import java.io.IOException;

/**
 * Client
 * @author: Elvin Zeng
 * @date: 17-7-16.
 */
public class App {
    public static void main(String[] args) throws IOException {
        PriceCalculator calculator = new PriceCalculator(new NormalDiscountStrategy());
        System.out.println("普通客户购买:18, 200, 1300, 7200="
                + calculator.calculate(18, 200, 1300, 7200));

        calculator = new PriceCalculator(new VipDiscountStrategy());
        System.out.println("VIP客户购买:18, 200, 1300, 7200="
                + calculator.calculate(18, 200, 1300, 7200));

    }

}
