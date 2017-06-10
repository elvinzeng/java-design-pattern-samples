package com.gelvt.gofdp;

import com.gelvt.gofdp.simplefactory.Carrier;
import com.gelvt.gofdp.simplefactory.CarrierFactory;
import com.gelvt.gofdp.simplefactory.CarrierType;

/**
 * Desc: Client
 * Author: Elvin Zeng
 * Date: 17-6-11.
 */
public class App {
    public static void main(String[] args){
        System.out.println("hello simple factory!");
        Carrier carrier = CarrierFactory.getCarrier(CarrierType.CAR);
        carrier.transport("西瓜", "县城");
        carrier = CarrierFactory.getCarrier(CarrierType.SHIP);
        carrier.transport("稀土", "美国");
        carrier = CarrierFactory.getCarrier(CarrierType.PLANE);
        carrier.transport("老干妈", "德国");
    }
}
