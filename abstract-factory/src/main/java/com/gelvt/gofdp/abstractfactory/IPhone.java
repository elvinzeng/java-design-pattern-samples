package com.gelvt.gofdp.abstractfactory;

/**
 * Desc: iPhone
 * Author: Elvin Zeng
 * Date: 17-6-18.
 */
public class IPhone implements Phone {
    IPhone(){}

    private String owner;

    @Override
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void takePicture() {
        System.out.println(this.owner + "的iPhone拍了一张照片");
    }
}
