package com.gelvt.gofdp.composite;

/**
 * 文本框
 * @author: Elvin Zeng
 * @date: 17-7-8.
 */
public class TextBox extends Control {

    public TextBox(String id){
        this.setId(id);
    }

    @Override
    public void render() {
        System.out.println("渲染一个Button. id:" + this.getId());
    }
}
