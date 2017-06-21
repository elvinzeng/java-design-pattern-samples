package com.gelvt.gofdp.singleton;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Desc: 应用上下文
 * Author: Elvin Zeng
 * Date: 17-6-21.
 */
public class ApplicationContext {

    private static ApplicationContext instance;
    private static Object lck;
    private Map<String, Object> configs;  //  应用的全局配置

    static {
        lck = new Object();
    }

    private ApplicationContext() {
        this.configs = new ConcurrentHashMap<>();
    }

    /**
     * @return ApplicationContext的唯一实例
     */
    public static ApplicationContext getInstance() {
        if (null == instance) {
            synchronized (lck) {
                if (null == instance) {
                    instance = new ApplicationContext();
                }
            }
        }
        return instance;
    }

    /**
     * 取指定的全局配置项值
     *
     * @param key 配置项的键
     * @return 配置项值
     */
    public Object getConfig(String key) {
        return configs.get(key);
    }

    /**
     * 设置指定的全局配置项值
     *
     * @param key   配置项的键
     * @param value 配置项值
     */
    public Object setConfig(String key, Object value) {
        return configs.put(key, value);
    }

    /**
     * 删除指定的全局配置项
     *
     * @param key 配置项的键
     * @return 被删除的配置项的值
     */
    public Object removeConfig(String key) {
        return configs.remove(key);
    }

    /**
     * 清空所有的全局配置
     */
    public void clearConfig() {
        configs.clear();
    }

    /**
     * 获取应用的所有全局配置项的键
     *
     * @return 所有全局配置项的键的集合
     */
    public Set<String> getConfigKeys() {
        return configs.keySet();
    }
}
