package com.gelvt.gofdp;

import com.gelvt.gofdp.factorymethod.Carrier;
import com.gelvt.gofdp.factorymethod.CarrierFactory;


/**
 * Desc: Client
 * Author: Elvin Zeng
 * Date: 17-6-14.
 */
public class App {
    public static void main(String[] args)
            throws ClassNotFoundException,
            IllegalAccessException, InstantiationException {

        System.out.println("factory method pattern");

        //  用于测试的数据
        String[] factoryClasses = {
                "com.gelvt.gofdp.factorymethod.CarFactory",
                "com.gelvt.gofdp.factorymethod.PlaneFactory",
                "com.gelvt.gofdp.factorymethod.ShipFactory"
        };

        int i = 0;
        for(String factoryClass : factoryClasses){
            //  你可以把factoryClass想象成是从配置文件中读取到的
            Class<?> cls = Class.forName(factoryClass);
            CarrierFactory factory = (CarrierFactory) cls.newInstance();
            Carrier carrier = factory.newInstance();
            carrier.transport("第" + (++i) + "批货物", "Elvin的家里");
        }

    }
}
