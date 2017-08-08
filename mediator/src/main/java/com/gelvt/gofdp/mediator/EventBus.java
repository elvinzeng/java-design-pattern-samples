package com.gelvt.gofdp.mediator;

/**
 * 事件总线
 * @author: Elvin Zeng
 * @date: 17-8-8.
 */
public interface EventBus {
    /**
     * 发布事件
     * @param type 事件类型
     * @param message 消息对象
     */
    void post(String type, Object message);

    /**
     * 注册事件处理器
     * @param type 感兴趣的事件类型
     * @param eventHandler 事件处理器
     */
    void registerHandler(String type, EventHandler eventHandler);
}
