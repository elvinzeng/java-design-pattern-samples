package com.gelvt.gofdp.interpreter;

/**
 * 乘法表达式
 * @author: Elvin Zeng
 * @date: 17-8-14.
 */
public class MulExpression extends BinaryExpression{

    public MulExpression(Expression leftOperand, Expression rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public Object getValue(ElContext context) {
        return (double)getLeftOperand().getValue(context)
                * (double)getRightOperand().getValue(context);
    }

    @Override
    public String toString() {
        return "MulExpression" + super.toString();
    }
}
