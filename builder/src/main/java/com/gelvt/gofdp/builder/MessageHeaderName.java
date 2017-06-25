package com.gelvt.gofdp.builder;

/**
 * Desc: 消息头名称枚举
 * Author: Elvin Zeng
 * Date: 17-6-25.
 */
public enum MessageHeaderName {
    /**
     * 消息内容是否已经被加密
     */
    IS_CONTENT_ENCRYPTED("IS_CONTENT_ENCRYPTED"),
    /**
     * 消息内容加密算法
     */
    ENCRYPTION_ALGORITHM("ENCRYPTION_ALGORITHM"),
    /**
     * 消息的内容MIME类型
     */
    CONTENT_TYPE("CONTENT_TYPE"),
    /**
     * 消息接收人的用户ID
     */
    RECIPIENT_ID("RECIPIENT_ID"),
    /**
     * 消息发送人ID
     */
    SENDER_ID("SENDER_ID")
    ;

    private String value;

    MessageHeaderName(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
