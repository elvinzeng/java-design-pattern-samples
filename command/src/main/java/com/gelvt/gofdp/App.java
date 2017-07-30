package com.gelvt.gofdp;

import com.gelvt.gofdp.command.MessageHandler;

/**
 * Client
 * @author: Elvin Zeng
 * @date: 17-7-28.
 */
public class App {
    public static void main(String[] args) {
        MessageHandler messageHandler = new MessageHandler();
        messageHandler.registerCommand("login",
                "com.gelvt.gofdp.command.LoginCommand");
        messageHandler.registerCommand("sendMessage",
                "com.gelvt.gofdp.command.SendMessageCommand");


        messageHandler.process("login elvin 654321");
        messageHandler.process("sendMessage elvin zenghui hello");
    }

}
