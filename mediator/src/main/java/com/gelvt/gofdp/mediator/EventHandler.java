package com.gelvt.gofdp.mediator;

/**
 * 事件处理器
 * @author: Elvin Zeng
 * @date: 17-8-8
 */
public interface EventHandler {
    /**
     * 处理事件
     * @param message 消息对象
     */
    void handle(Object message);
}
