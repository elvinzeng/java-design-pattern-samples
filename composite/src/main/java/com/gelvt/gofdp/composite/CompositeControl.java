package com.gelvt.gofdp.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合控件
 * @author: Elvin Zeng
 * @date: 17-7-8.
 */
public abstract class CompositeControl extends Control{
    private List<Control> children = new ArrayList<>();

    @Override
    public void render() {
        for (Control child : children){
            child.render();
        }
    }

    /**
     * 增加一个子控件
     * @param child 子控件
     */
    public void addControl(Control child){
        this.children.add(child);
    }

    /**
     * 移除一个子控件
     * @param child 子控件
     */
    public void removeControl(Control child){
        this.children.remove(child);
    }

    /**
     * @return 子控件
     */
    public List<Control> getChildren(){
        return this.children;
    }
}
