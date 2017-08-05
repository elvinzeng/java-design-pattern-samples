package com.gelvt.gofdp.iterator;

/**
 * 列表
 * @author: Elvin Zeng
 * @date: 17-8-5.
 */
public interface List<E> extends Iterable<E> {
    /**
     * @return 列表元素总数
     */
    int size();

    /**
     * @return 列表是否为空
     */
    boolean isEmpty();

    /**
     * 给列表添加元素，插入列表最后。
     * 根据需要还可以重载插入指定位置的版本。
     * 这里为了简化代码就不再演示。
     * @param e 待添加元素
     * @return
     */
    void add(E e);
}
