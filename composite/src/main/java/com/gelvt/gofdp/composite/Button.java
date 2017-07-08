package com.gelvt.gofdp.composite;

/**
 * 按钮
 * @author: Elvin Zeng
 * @date: 17-7-8.
 */
public class Button extends Control{

    public Button(String id){
        this.setId(id);
    }

    @Override
    public void render() {
        System.out.println("渲染一个Button. id:" + this.getId());
    }
}
