package com.gelvt.gofdp.state;

/**
 * 即时通讯软件客户端
 * @author: Elvin Zeng
 * @date: 17-7-21.
 */
public class MessengerClient {

    private ClientState state;
    private String username;

    public MessengerClient(){
        this.state = new OfflineState(this);
    }

    public MessengerClient(ClientState state) {
        this.state = state;
    }

    public void setState(ClientState state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void login(String username, String password){
        //  这里可以和服务器通讯验证用户帐号
        //  这里只是演示，直接登录成功

        System.out.println(String.format("用户[%s]登录成功", username));
        this.username = username;
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
