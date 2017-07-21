package com.gelvt.gofdp.state;

/**
 * 离线状态
 * @author: Elvin Zeng
 * @date: 17-7-21.
 */
public class OfflineState implements ClientState {

    @Override
    public void showChatForm() {
        System.out.println("聊天窗口弹出来了！你可以开始聊天了。");
    }

    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("发送消息失败：你离线了，请重新登录。");
    }
}
