package com.gelvt.gofdp.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 表达式上下文
 * @author: Elvin Zeng
 * @date: 17-8-14.
 */
public class ElContext {
    private Map<String, Object> scope;

    public ElContext() {
        this.scope = new HashMap<>();
    }

    public ElContext(Map<String, Object> scope) {
        this.scope = scope;
    }

    public boolean containsKey(Object key) {
        return scope.containsKey(key);
    }

    public Object get(Object key) {
        return scope.get(key);
    }

    public Object put(String key, Object value) {
        return scope.put(key, value);
    }

    public Object remove(Object key) {
        return scope.remove(key);
    }

    public void putAll(Map<? extends String, ?> m) {
        scope.putAll(m);
    }

    public void clear() {
        scope.clear();
    }

    @Override
    public String toString() {
        return "ELContext{" +
                "scope=" + scope +
                '}';
    }
}
