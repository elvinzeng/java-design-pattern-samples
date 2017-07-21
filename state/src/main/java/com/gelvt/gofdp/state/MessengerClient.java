package com.gelvt.gofdp.state;

/**
 * 即时通讯软件客户端
 * @author: Elvin Zeng
 * @date: 17-7-21.
 */
public class MessengerClient {

    private ClientState state;
    private String username;

    public MessengerClient(String username) {
        this.username = username;
    }

    public void setState(ClientState state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    /**
     * 显示聊天窗口
     */
    public void showChatForm() {
        state.showChatForm();
    }

    /**
     * 发送文字消息给指定好友
     * @param message 文字消息
     * @param receiver 接收人
     */
    public void sendMessage(String message, String receiver) {
        state.sendMessage(message, receiver);
    }
}
