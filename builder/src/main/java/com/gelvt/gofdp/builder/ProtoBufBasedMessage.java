package com.gelvt.gofdp.builder;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Desc: 基于ProtoBuf的消息
 * Author: Elvin Zeng
 * Date: 17-6-26.
 */
public class ProtoBufBasedMessage implements Message {

    //  为了演示不同builder有不同构建过程，这里特地改成与另一个消息不同的数据结构。
    private Map<String, String> headers;
    private byte[] body;

    private ProtoBufBasedMessage(Map<String, String> headers
            , byte[] body){
        this.headers = headers;
        this.body = body;
    }

    @Override
    public String getHeader(MessageHeaderName headerName) {
        return headers.get(headerName.getValue());
    }

    @Override
    public byte[] toByteArray() {
        byte[] msg = null;
        //  这里用ProtoBuf将整个消息对象序列化为字节数组并返回
        return msg;
    }

    public static class ProtoBufBasedMessageBuilder
            implements MessageBuilder{
        private Map<String, String> headers;
        private byte[] body;

        public ProtoBufBasedMessageBuilder(){
            this.headers = new HashMap<>();
        }

        @Override
        public MessageBuilder withHeader(MessageHeaderName headerName, String val) {
            this.headers.put(headerName.getValue(), val);
            return this;
        }

        @Override
        public MessageBuilder appendStringBody(String content) {
            //  将content转为字符串加入到this.body这个字节数组中。
            //  如果长度不够则重新创建。
            return this;
        }

        @Override
        public MessageBuilder appendImageBody(File image) {
            //  将图片以字节流的形式读取进来并追加到this.body这个数组中
            //  如果this.body长度不够则重新创建。
            return this;
        }

        @Override
        public MessageBuilder compact() {
            //  采用约定好的压缩算法压缩this.body对象
            //  this.body = doCompact(this.body);
            return this;
        }

        @Override
        public Message build() {
            ProtoBufBasedMessage message =
                    new ProtoBufBasedMessage(this.headers, this.body);
            return message;
        }
    }
}
