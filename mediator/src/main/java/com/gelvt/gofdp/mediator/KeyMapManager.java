package com.gelvt.gofdp.mediator;

/**
 * 键盘映射管理器
 * @author: Elvin Zeng
 * @date: 17-8-8
 */
public class KeyMapManager implements EventHandler {
    private EventBus eventBus;

    public KeyMapManager(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    public void handle(Object message) {
        String key = message.toString();
        System.out.println("你按下了：" + key);
        if ("alt+d".equals(key)){
            eventBus.post("main_form_event", "hideWindow");
        }else if ("alt+s".equals(key)){
            eventBus.post("main_form_event", "showWindow");
        }
    }
}
