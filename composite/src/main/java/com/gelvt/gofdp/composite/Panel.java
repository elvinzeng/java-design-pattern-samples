package com.gelvt.gofdp.composite;

/**
 * 面板
 * 作为其他控件的容器
 * @author: Elvin Zeng
 * @date: 17-7-8.
 */
public class Panel extends CompositeControl {
    private int borderWidth;

    public Panel(String id){
        this.setId(id);
    }

    public Panel(String id, int borderWidth){
        this.setId(id);
        this.borderWidth = borderWidth;
    }

    /**
     * @return 边框尺寸（单位px）
     */
    public int getBorderWidth() {
        return borderWidth;
    }

    /**
     * @param borderWidth 边框尺寸（单位px）
     */
    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    @Override
    public void render(){
        System.out.println("渲染一个Panel. id:" + this.getId());
        super.render();
    }
}
