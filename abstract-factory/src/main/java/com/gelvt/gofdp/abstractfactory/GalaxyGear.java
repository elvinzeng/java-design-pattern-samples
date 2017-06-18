package com.gelvt.gofdp.abstractfactory;

import java.util.Date;

/**
 * Desc: Galaxy Gear
 * Author: Elvin Zeng
 * Date: 17-6-18.
 */
public class GalaxyGear implements SmartWatch {
    GalaxyGear(){}

    @Override
    public void displayCurrentTime() {
        System.out.println("Galaxy Gear报时：" + (new Date()).toString());
    }

    @Override
    public void receivePhoneCall() {
        System.out.println("用Galaxy Gear接听来电");
    }
}
