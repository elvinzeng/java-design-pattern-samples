package com.gelvt.gofdp.interpreter;

/**
 * 除法表达式
 * @author: Elvin Zeng
 * @date: 17-8-14.
 */
public class DivExpression extends BinaryExpression{

    public DivExpression(Expression leftOperand, Expression rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public Object getValue(ElContext context) {
        return (double)getLeftOperand().getValue(context)
                / (double)getRightOperand().getValue(context);
    }

    @Override
    public String toString() {
        return "DivExpression" + super.toString();
    }
}
