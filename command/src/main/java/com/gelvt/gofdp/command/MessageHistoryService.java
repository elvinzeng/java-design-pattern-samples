package com.gelvt.gofdp.command;

import java.util.Date;

/**
 * 消息历史服务
 * @author: Elvin Zeng
 * @date: 17-7-30.
 */
public class MessageHistoryService {
    /**
     * 保存用户发送的消息到服务器
     * @param sender 消息发送者
     * @param receiver 消息接收者
     * @param message 消息
     */
    public void saveMessageHistory(String sender, String receiver, String message){
        System.out.println(String.format("[%s] 用户[%s]给用户[%s]发送了一条文字消息，内容：%s",
                new Date(), sender, receiver, message));
    }
}
