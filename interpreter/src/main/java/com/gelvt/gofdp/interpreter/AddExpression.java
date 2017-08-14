package com.gelvt.gofdp.interpreter;

/**
 * 加法表达式
 * @author: Elvin Zeng
 * @date: 17-8-14.
 */
public class AddExpression extends BinaryExpression{

    public AddExpression(Expression leftOperand, Expression rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public Object getValue(ELContext context) {
        return (double)getLeftOperand().getValue(context)
                + (double)getRightOperand().getValue(context);
    }

    @Override
    public String toString() {
        return "AddExpression" + super.toString();
    }
}
