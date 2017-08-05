package com.gelvt.gofdp.iterator;

/**
 * 迭代器
 * @author: Elvin Zeng
 * @date: 17-8-5.
 */
public interface Iterator<E> {
    /**
     * @return 是否还有下一个元素(概念与数学中集合元素一样)
     */
    boolean hasNext();

    /**
     * @return 下一个元素(概念与数学中集合元素一样)
     */
    E next();
}
