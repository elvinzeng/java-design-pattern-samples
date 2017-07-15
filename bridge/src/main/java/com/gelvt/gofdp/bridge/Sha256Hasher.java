package com.gelvt.gofdp.bridge;

/**
 * Sha256 Hash计算器
 * @author: Elvin Zeng
 * @date: 17-7-15.
 */
public class Sha256Hasher implements Hasher {
    @Override
    public String hash(byte[] message) {
        //  模拟计算SHA256
        return "sha256sum[" + new String(message) + "]";
    }
}
