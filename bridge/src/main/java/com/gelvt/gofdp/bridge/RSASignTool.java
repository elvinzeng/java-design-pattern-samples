package com.gelvt.gofdp.bridge;

/**
 * 基于RSA算法的数字签名工具
 * @author: Elvin Zeng
 * @date: 17-7-15.
 */
public class RSASignTool extends SignTool {
    public RSASignTool(String secretkey, Hasher hasher) {
        super(secretkey, hasher);
    }

    @Override
    public byte[] sign(byte[] message) {
        String digest = this.getHasher().hash(message);
        return encrypt(digest.getBytes());
    }

    private byte[] encrypt(byte[] message){
        //  在这里用RSA算法进行加密
        //  这里出于演示的目的，直接返回一个常量
        return ArrayUtils.concat(message, "|RSA encrypted data".getBytes());
    }
}
