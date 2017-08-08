package com.gelvt.gofdp;

import com.gelvt.gofdp.mediator.*;

/**
 * Client
 * @author: Elvin Zeng
 * @date: 17-8-8.
 */
public class App {
    public static void main(String[] args) {
        EventBus eventBus = DefaultEventBus.getInstance();

        //  tips: type常量在程序中可以抽取到常量类中
        eventBus.registerHandler("keyboard_event", new KeyMapManager(eventBus));
        eventBus.registerHandler("audio_event", new AudioPlayer(eventBus));
        eventBus.registerHandler("main_form_event", new MainForm(eventBus));

        //  老板来了，赶紧隐藏窗口！！
        eventBus.post("keyboard_event", "alt+d");
        //  老板走了，显示窗口继续玩。
        eventBus.post("keyboard_event", "alt+s");

    }

}
