package com.gelvt.gofdp.interpreter;

/**
 * 字面常量
 * @author: Elvin Zeng
 * @date: 17-8-14.
 */
public class Literal implements Expression {

    private Object val;

    public Literal(Object val) {
        this.val = val;
    }

    @Override
    public Object getValue(ElContext context) {
        return val;
    }

    @Override
    public String toString() {
        return "Literal{" +
                "val=" + val +
                '}';
    }
}
