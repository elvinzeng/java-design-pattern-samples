package com.gelvt.gofdp;

import com.gelvt.gofdp.template.Button;
import com.gelvt.gofdp.template.Label;

/**
 * Client
 * @author: Elvin Zeng
 * @date: 17-7-28.
 */
public class App {
    public static void main(String[] args) {

        Label label = new Label();
        label.setTargetInputElement("username");
        label.setContent("用户名");
        label.renderWebControl();

        System.out.println("");

        Button button = new Button();
        button.setType(Button.Type.SUBMIT);
        button.setContent("提交");
        button.renderWebControl();
        System.out.println("");

    }

}
