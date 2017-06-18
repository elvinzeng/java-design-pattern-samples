package com.gelvt.gofdp.abstractfactory;

/**
 * Desc: SAMSUNG Galaxy
 * Author: Elvin Zeng
 * Date: 17-6-18.
 */
public class SamsungGalaxy implements Phone{
    SamsungGalaxy(){}

    private String owner;

    @Override
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void takePicture() {
        System.out.println(this.owner + "的SAMSUNG Galaxy拍了一张照片");
    }
}
