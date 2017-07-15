package com.gelvt.gofdp.bridge;

/**
 * Sha1 Hash计算器
 * @author: Elvin Zeng
 * @date: 17-7-15.
 */
public class Sha1Hasher implements Hasher {
    @Override
    public String hash(byte[] message) {
        //  模拟计算SHA1
        return "sha1sum(" + new String(message) + ")";
    }
}
