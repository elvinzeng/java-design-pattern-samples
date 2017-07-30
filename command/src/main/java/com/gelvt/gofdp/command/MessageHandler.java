package com.gelvt.gofdp.command;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 消息处理器
 * @author: Elvin Zeng
 * @date: 17-7-30.
 */
public class MessageHandler {

    private Map<String, String> commandMap;

    public MessageHandler(){
        this.commandMap = new ConcurrentHashMap<>();
    }

    public void registerCommand(String commandName, String commandClassName){
        this.commandMap.put(commandName, commandClassName);
    }

    /**
     * 处理客户端发送过来的消息
     * 客户端发送过来的消息应该是一个byte串，然后通过反序列化解析消息。
     * 这里为了简化代码，假定消息就是一个特定格式的字符串
     * @param message 客户端发送过来的消息
     */
    public void process(String message){
        String[] msgParts = message.split("\\s+");
        String commandName = msgParts[0];
        String[] args = null;
        if (msgParts.length > 1){
            args = new String[msgParts.length -1];
            for(int i = 1; i < msgParts.length; i++){
                args[i - 1] = msgParts[i];
            }
        }
        String commandClassName = this.commandMap.get(commandName);
        try {
            Command command = (Command) Class.forName(commandClassName)
                    .newInstance();
            command.setParameters(args);
            command.execute();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
