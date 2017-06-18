package com.gelvt.gofdp.abstractfactory;

/**
 * Desc: 三星笔记本电脑
 * Author: Elvin Zeng
 * Date: 17-6-18.
 */
public class SamsungNoteBook implements Laptop {
    SamsungNoteBook(){}

    @Override
    public void coding(String operator) {
        System.out.println(operator + "用SAMSUNG NoteBook写代码");
    }
}
