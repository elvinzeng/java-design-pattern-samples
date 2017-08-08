package com.gelvt.gofdp.mediator;

/**
 * 程序主窗口
 * @author: Elvin Zeng
 * @date: 17-8-8
 */
public class MainForm extends EventHandler{

    public MainForm(EventBus eventBus) {
        super(eventBus);
    }

    @Override
    public void handle(Object message) {
        String command = message.toString();
        if ("showWindow".equals(command)){
            show();
            getEventBus().post("audio_event", "show-window.mp3");
        }else if ("hideWindow".equals(command)){
            hide();
            getEventBus().post("audio_event", "hide-window.mp3");
        }else{
            System.out.println("未知事件");
        }
    }

    public void show(){
        System.out.println("显示窗口");
    }

    public void hide(){
        System.out.println("隐藏窗口");
    }
}
