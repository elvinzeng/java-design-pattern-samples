package com.gelvt.gofdp;


import com.gelvt.gofdp.abstractfactory.DigitalEquipmentFactory;
import com.gelvt.gofdp.abstractfactory.Laptop;
import com.gelvt.gofdp.abstractfactory.Phone;
import com.gelvt.gofdp.abstractfactory.SmartWatch;

/**
 * Desc: Client
 * Author: Elvin Zeng
 * Date: 17-6-17.
 */
public class App {
    public static void main(String[] args)
            throws ClassNotFoundException,
            IllegalAccessException, InstantiationException {

        System.out.println("abstract factory pattern");

        //  用于测试的数据
        String[] factoryClasses = {
                "com.gelvt.gofdp.abstractfactory.AppleFactory",
                "com.gelvt.gofdp.abstractfactory.SamsungFactory"
        };

        int i = 0;
        for(String factoryClass : factoryClasses){
            //  你可以把factoryClass想象成是从配置文件中读取到的
            Class<?> cls = Class.forName(factoryClass);
            DigitalEquipmentFactory factory = (DigitalEquipmentFactory) cls.newInstance();

            Laptop laptop = factory.manufactureLaptop();
            laptop.coding("Elvin Zeng");

            Phone phone = factory.manufacturePhone();
            phone.setOwner("Elvin Zeng");
            phone.takePicture();

            SmartWatch smartWatch = factory.manufactureSmartWatch();
            smartWatch.displayCurrentTime();
            smartWatch.receivePhoneCall();
        }

    }
}
