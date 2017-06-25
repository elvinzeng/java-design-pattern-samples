package com.gelvt.gofdp.builder;

import java.io.File;

/**
 * Desc: 消息创建者
 * Author: Elvin Zeng
 * Date: 17-6-25.
 */
public interface MessageBuilder {
    /**
     * 插入消息头
     * @param headerName 消息头名称
     * @param val 消息头值
     * @return builder
     */
    MessageBuilder withHeader(MessageHeaderName headerName, String val);

    /**
     * 向消息体中插入一个字符串
     * @param content 插入消息体中的字符串
     * @return builder
     */
    MessageBuilder appendStringBody(String content);

    /**
     * 向消息体中插入一张图片。图片将自动被转换为base64字符串。
     * @param image 插入消息体中的字符串
     * @return builder
     */
    MessageBuilder appendImageBody(File image);

    /**
     * 压缩消息
     * @return builder
     */
    MessageBuilder compact();

    /**
     * 创建消息
     * @return 生成的消息
     */
    Message build();
}
