package com.gelvt.gofdp.abstractfactory;

import java.util.Date;

/**
 * Desc: Apple Watch
 * Author: Elvin Zeng
 * Date: 17-6-18.
 */
public class AppleWatch implements SmartWatch {
    AppleWatch(){}

    @Override
    public void displayCurrentTime() {
        System.out.println("Apple Watch报时：" + (new Date()).toString());
    }

    @Override
    public void receivePhoneCall() {
        System.out.println("用Apple Watch接听来电");
    }
}
