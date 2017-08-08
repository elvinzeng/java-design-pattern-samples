package com.gelvt.gofdp.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 消息总线默认实现
 * @author: Elvin Zeng
 * @date: 17-8-8
 */
public class DefaultEventBus implements EventBus {
    private static DefaultEventBus instance;
    private static Object lockObj = new Object();
    private Map<String, List<EventHandler>> eventHandlerMap;

    private DefaultEventBus(){
        eventHandlerMap = new HashMap<>();
    }

    public static DefaultEventBus getInstance(){
        if (null == instance){
            synchronized (lockObj){
                if (null == instance){
                    instance = new DefaultEventBus();
                }
            }
        }
        return instance;
    }


    @Override
    public void post(String type, Object message) {
        List<EventHandler> handlers = eventHandlerMap.get(type);
        if (null != handlers){
            for (EventHandler handler : handlers){
                handler.handle(message);
            }
        }
    }

    @Override
    public synchronized void registerHandler(String type, EventHandler eventHandler) {
        if (eventHandlerMap.containsKey(type)){
            List<EventHandler> handlers = eventHandlerMap.get(type);
            handlers.add(eventHandler);
        }else{
            List<EventHandler> handlers = new ArrayList<>();
            handlers.add(eventHandler);
            eventHandlerMap.put(type, handlers);
        }
    }
}
