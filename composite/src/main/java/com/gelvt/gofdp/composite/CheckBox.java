package com.gelvt.gofdp.composite;

/**
 * @author: Elvin Zeng
 * @date: 17-7-8.
 */
public class CheckBox extends Control {

    public CheckBox(String id){
        this.setId(id);
    }

    @Override
    public void render() {
        System.out.println("渲染一个CheckBox. id:" + this.getId());
    }
}
