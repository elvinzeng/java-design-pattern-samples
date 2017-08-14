package com.gelvt.gofdp.interpreter;

/**
 * 表达式
 * @author: Elvin Zeng
 * @date: 17-8-14.
 */
public interface Expression {
    Object getValue(ELContext context);
}
