package com.gelvt.gofdp.iterator;

/**
 * 可迭代的对象
 * @author: Elvin Zeng
 * @date: 17-8-5.
 */
public interface Iterable<T> {
    /**
     * @return 迭代器
     */
    Iterator<T> iterator();
}
