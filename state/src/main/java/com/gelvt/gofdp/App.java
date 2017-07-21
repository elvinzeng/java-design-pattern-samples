package com.gelvt.gofdp;

import com.gelvt.gofdp.state.MessengerClient;
import com.gelvt.gofdp.state.OfflineState;
import com.gelvt.gofdp.state.OnlineState;

/**
 * Client
 * @author: Elvin Zeng
 * @date: 17-7-21.
 */
public class App {
    public static void main(String[] args){
        MessengerClient client = new MessengerClient();

        client.showChatForm();
        client.sendMessage("hi Elvin!", "zenghui");

        client.login("elvinzeng", "123456");
        client.showChatForm();
        client.sendMessage("hi Elvin!", "zenghui");
    }
}
