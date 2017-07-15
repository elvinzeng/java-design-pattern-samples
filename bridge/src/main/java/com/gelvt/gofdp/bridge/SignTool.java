package com.gelvt.gofdp.bridge;

/**
 * 签名工具
 * @author: Elvin Zeng
 * @date: 17-7-15.
 */
public abstract class SignTool {
    private String secretkey;
    private Hasher hasher;

    public SignTool(String secretkey, Hasher hasher) {
        this.secretkey = secretkey;
        this.hasher = hasher;
    }

    /**
     * 生成指定消息的数字签名
     * @param message 消息
     * @return 消息的数字签名
     */
    public abstract byte[] sign(byte[] message);

    public String getSecretkey() {
        return secretkey;
    }

    public Hasher getHasher() {
        return hasher;
    }
}
