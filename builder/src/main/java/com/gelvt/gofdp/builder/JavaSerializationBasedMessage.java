package com.gelvt.gofdp.builder;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Desc: 基于java序列化机制的消息
 * Author: Elvin Zeng
 * Date: 17-6-26.
 */
public class JavaSerializationBasedMessage implements Message {

    private Map<MessageHeaderName, String> headers;
    private String body;

    private JavaSerializationBasedMessage(Map<MessageHeaderName, String> headers
            , String body){
        this.headers = headers;
        this.body = body;
    }

    @Override
    public String getHeader(MessageHeaderName headerName) {
        return headers.get(headerName);
    }

    @Override
    public byte[] toByteArray() {
        byte[] msg = null;
        //  这里调用java序列化将当前对象序列化为字节数组并返回
        return msg;
    }

    public static class JavaSerializationBasedMessageBuilder
            implements MessageBuilder{
        private Map<MessageHeaderName, String> headers;
        private StringBuilder sb;
        private String content;

        public JavaSerializationBasedMessageBuilder(){
            this.headers = new HashMap<>();
            this.sb = new StringBuilder();
        }

        @Override
        public MessageBuilder withHeader(MessageHeaderName headerName, String val) {
            this.headers.put(headerName, val);
            return this;
        }

        @Override
        public MessageBuilder appendStringBody(String content) {
            sb.append(content);
            return this;
        }

        @Override
        public MessageBuilder appendImageBody(File image) {
            //  将图片转换为base64字符串并append到sb对象中。
            return this;
        }

        @Override
        public MessageBuilder compact() {
            //  采用约定好的压缩算法压缩sb对象构建好的字符串
            //  this.content = doCompact(sb.toString());
            return this;
        }

        @Override
        public Message build() {
            JavaSerializationBasedMessage message =
                    new JavaSerializationBasedMessage(this.headers, this.content);
            return message;
        }
    }
}
