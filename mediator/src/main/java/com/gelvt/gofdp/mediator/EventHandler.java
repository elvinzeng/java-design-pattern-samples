package com.gelvt.gofdp.mediator;

/**
 * 事件处理器
 * @author: Elvin Zeng
 * @date: 17-8-8
 */
public abstract class EventHandler {
    private EventBus eventBus;

    public EventHandler(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public EventBus getEventBus() {
        return eventBus;
    }

    /**
     * 处理事件
     * @param message 消息对象
     */
    public abstract void handle(Object message);
}
