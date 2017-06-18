package com.gelvt.gofdp.abstractfactory;

/**
 * Desc: 苹果笔记本
 * Author: Elvin Zeng
 * Date: 17-6-18.
 */
public class MacBook implements Laptop{
    MacBook(){}

    @Override
    public void coding(String operator) {
        System.out.println(operator + "用Macbook写代码");
    }
}
