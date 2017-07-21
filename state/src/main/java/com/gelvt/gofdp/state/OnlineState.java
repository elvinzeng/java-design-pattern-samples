package com.gelvt.gofdp.state;

/**
 * 在线状态（正常状态）
 * @author: Elvin Zeng
 * @date: 17-7-21.
 */
public class OnlineState implements ClientState{

    private MessengerClient client;

    public OnlineState(MessengerClient client) {
        this.client = client;
    }

    @Override
    public void showChatForm() {
        System.out.println("聊天窗口弹出来了！你可以开始聊天了。");
    }

    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println(String.format("[%s]发送消息[%s]给[%s]",
                client.getUsername(), message, receiver));
    }
}
