package com.gelvt.gofdp;

import com.gelvt.gofdp.state.LockedState;
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
        MessengerClient client = new MessengerClient("elvinzeng");
        client.setState(new OfflineState(client));

        client.showChatForm();
        client.sendMessage("hi zenghui!", "zenghui");
        System.out.println("------------");

        client.setState(new OnlineState(client));
        client.showChatForm();
        client.sendMessage("hi zenghui!", "zenghui");
        System.out.println("------------");

        client.setState(new LockedState(client));
        client.showChatForm();
        client.sendMessage("hi zenghui!", "zenghui");
        System.out.println("------------");
    }
}
