package com.gelvt.gofdp.abstractfactory;

/**
 * Desc: 手机
 * Author: Elvin Zeng
 * Date: 17-6-18.
 */
public interface Phone {

    /**
     * 设置手机的所有者
     * @param owner 手机所有者
     */
    void setOwner(String owner);

    /**
     * 拍照
     */
    void takePicture();
}
