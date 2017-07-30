package com.gelvt.gofdp.command;

import java.util.Date;

/**
 * 发送消息命令
 * @author: Elvin Zeng
 * @date: 17-7-30.
 */
public class SendMessageCommand implements Command {
    private String[] parameters;
    private MessageHistoryService messageHistoryService =
            new MessageHistoryService();

    @Override
    public void setParameters(String[] parameters) {
        this.parameters = parameters;
    }

    @Override
    public void execute() {
        //  这里调用其他模块将消息转发给其他用户
        System.out.println(String.format("[%s] 将用户[%s]的消息转发给用户[%s]，内容：%s",
                new Date(), parameters[0],
                parameters[1], parameters[2]));
        //  接着保存消息到服务器
        messageHistoryService.saveMessageHistory(parameters[0],
                parameters[1], parameters[2]);
    }
}
