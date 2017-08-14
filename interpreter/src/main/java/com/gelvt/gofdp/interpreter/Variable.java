package com.gelvt.gofdp.interpreter;

/**
 * 变量
 * @author: Elvin Zeng
 * @date: 17-8-14.
 */
public class Variable implements Expression{

    private String variableName;

    public Variable(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public Object getValue(ElContext context) {
        return context.get(variableName);
    }

    @Override
    public String toString() {
        return "Variable{" +
                "variableName='" + variableName + '\'' +
                '}';
    }
}
