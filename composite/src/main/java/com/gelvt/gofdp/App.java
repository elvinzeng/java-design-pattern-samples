package com.gelvt.gofdp;

import com.gelvt.gofdp.composite.*;

/**
 * Client
 * @author: Elvin Zeng
 * @date: 17-7-8.
 */
public class App {
    public static void main(String[] args){
        Panel rootPanel = new Panel("rootPanel");
        Panel headPanel = new Panel("headPanel");
        Panel bodyPanel = new Panel("bodyPanel");

        rootPanel.addControl(headPanel);
        rootPanel.addControl(bodyPanel);

        headPanel.addControl(new TextBox("tb1"));
        bodyPanel.addControl(new CheckBox("chkbox1"));

        Panel contentPanel = new Panel("contentPanel");
        contentPanel.addControl(new TextBox("tb2"));
        bodyPanel.addControl(contentPanel);

        bodyPanel.addControl(new Button("btn1"));

        render(rootPanel);
    }

    /**
     * 模拟渲染控件的操作
     * @param control 控件
     */
    private static void render(Control control){
        control.render();
    }
}
