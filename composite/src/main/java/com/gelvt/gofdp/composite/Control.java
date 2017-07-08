package com.gelvt.gofdp.composite;

/**
 * 控件的抽象
 * @author: Elvin Zeng
 * @date: 17-7-8.
 */
public abstract class Control {
    private boolean visible;  //  控件是否可见
    private String id;   //  控件id(唯一)

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    /**
     * 渲染控件
     */
    public abstract void render();
}
