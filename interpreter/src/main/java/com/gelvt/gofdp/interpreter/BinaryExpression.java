package com.gelvt.gofdp.interpreter;

/**
 * 二元表达式
 * @author: Elvin Zeng
 * @date: 17-8-14.
 */
public abstract class BinaryExpression implements Expression{
    private Expression leftOperand;
    private Expression rightOperand;

    public BinaryExpression(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public Expression getLeftOperand() {
        return leftOperand;
    }

    public Expression getRightOperand() {
        return rightOperand;
    }

    @Override
    public String toString() {
        return "{" +
                "leftOperand=" + leftOperand +
                ", rightOperand=" + rightOperand +
                "}";
    }
}
