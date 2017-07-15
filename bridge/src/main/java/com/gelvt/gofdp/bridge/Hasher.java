package com.gelvt.gofdp.bridge;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 散列工具
 * @author: Elvin Zeng
 * @date: 17-7-15.
 */
public interface Hasher {

    /**
     * 计算消息哈希值
     * @param message 消息
     * @return 哈希值
     */
    String hash(byte[] message);
}
