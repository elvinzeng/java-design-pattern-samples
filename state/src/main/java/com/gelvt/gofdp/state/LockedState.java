package com.gelvt.gofdp.state;

/**
 * 客户端锁定状态
 * @author: Elvin Zeng
 * @date: 17-7-21.
 */
public class LockedState implements ClientState {

    private MessengerClient client;

    public LockedState(MessengerClient client) {
        this.client = client;
    }


    @Override
    public void showChatForm() {
        System.out.println("客户端被锁定了，请先解锁。");
    }

    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("锁定状态无法发送消息");
    }
}
