package com.gelvt.gofdp.builder;

/**
 * Desc: 客户端与服务器通信的消息的抽象
 * Author: Elvin Zeng
 * Date: 17-6-25.
 */
public interface Message {
    /**
     * 获取消息头
     * @param headerName
     * @return 指定的消息头
     */
    String getHeader(MessageHeaderName headerName);

    /**
     * 将消息转换为字节数组
     * @return 消息序列化之后的字节数组
     */
    byte[] toByteArray();
}
