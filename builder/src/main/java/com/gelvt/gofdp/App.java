package com.gelvt.gofdp;

import com.gelvt.gofdp.builder.*;

import java.io.File;

/**
 * Desc: Client
 * Author: Elvin Zeng
 * Date: 17-6-24.
 */
public class App {
    public static void main(String[] args){
        System.out.println("hello builder");
        sendTestMessage1();
        sendTestMessage2();
    }

    public static void sendTestMessage1(){
        MessageBuilder builder = new JavaSerializationBasedMessage
                .JavaSerializationBasedMessageBuilder();

        Message message = builder.withHeader(MessageHeaderName.IS_CONTENT_ENCRYPTED, "false")
                .withHeader(MessageHeaderName.CONTENT_TYPE, "text/xml")
                .withHeader(MessageHeaderName.SENDER_ID, "zenghui")
                .withHeader(MessageHeaderName.RECIPIENT_ID, "elvin")
                .appendStringBody("hi Elvin Zeng!")
                .appendImageBody(new File("~/zenghui.jpg"))
                .compact().build();

        byte[] encodedMessage = message.toByteArray();
        //  调用通信模块将消息发送出去
    }

    public static void sendTestMessage2(){
        MessageBuilder builder = new ProtoBufBasedMessage.ProtoBufBasedMessageBuilder();

        Message message = builder.withHeader(MessageHeaderName.IS_CONTENT_ENCRYPTED, "true")
                .withHeader(MessageHeaderName.ENCRYPTION_ALGORITHM, "RSA")
                .withHeader(MessageHeaderName.CONTENT_TYPE, "text/xml")
                .withHeader(MessageHeaderName.SENDER_ID, "zenghui")
                .withHeader(MessageHeaderName.RECIPIENT_ID, "elvin")
                .appendImageBody(new File("~/zenghui.jpg"))
                .compact().build();

        byte[] encodedMessage = message.toByteArray();
        //  调用通信模块将消息发送出去
    }
}
