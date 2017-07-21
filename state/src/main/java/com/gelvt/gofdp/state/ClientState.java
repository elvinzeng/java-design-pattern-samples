package com.gelvt.gofdp.state;

/**
 * 即时通讯软件客户端状态
 * @author: Elvin Zeng
 * @date: 17-7-21.
 */
public interface ClientState {
    /**
     * 显示聊天窗口
     */
    void showChatForm();

    /**
     * 发送消息
     * @param message 消息
     * @param receiver 收件人
     */
    void sendMessage(String message, String receiver);
}
