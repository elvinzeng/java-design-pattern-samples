package com.gelvt.gofdp.interpreter;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;

/**
 * 表达式解析器
 *
 * @author: Elvin Zeng
 * @date: 17-8-14.
 */
public class ElParser {

    private Stack<Expression> operandStack = new Stack<>();  //  操作数栈
    private Stack<String> operatorStack = new Stack<>();  //  操作符栈

    private boolean isOperator(String str) {
        if ("+".equals(str) || "-".equals(str)
                || "*".equals(str) || "/".equals(str)
                || "#".equals(str)) {
            return true;
        }
        return false;
    }

    private boolean isPrecedeThanTopOfStack(String operator) {
        String topOfStack = operatorStack.peek();
        if (("*".equals(operator) || "/".equals(operator))
                && ("+".equals(topOfStack) || "-".equals(topOfStack))) {
            return true;
        }
        if (!"#".equals(operator) && "#".equals(topOfStack)) {
            return true;
        }
        return false;
    }

    /**
     * 将字符串解析成表达式的抽象表示
     *
     * @param expressionStr 待解析的字符串
     * @return 表达式的抽象表示
     */
    public Expression parse(String expressionStr) {
        //  先删去空格方便解析
        expressionStr = expressionStr.replaceAll("\\s+", "");
        //  给表达式前后加入边界标识符
        expressionStr = "#" + expressionStr + "#";

        Tokenizer tokenizer = new Tokenizer(expressionStr);
        String token = null;
        token = tokenizer.nextToken();
        do{
            if("#".equals(token) && operatorStack.empty()){
                operatorStack.push(token);
                if (tokenizer.hasMoreTokens()){
                    token = tokenizer.nextToken();
                }
            }else if("#".equals(token) && "#".equals(operatorStack.peek())){
                operatorStack.pop();
            }else {
                if (!isOperator(token)) {
                    operandStack.push(parseTerminal(token));
                    if (tokenizer.hasMoreTokens()){
                        token = tokenizer.nextToken();
                    }
                } else {
                    if (operatorStack.empty()){
                        throw new RuntimeException("异常的表达式");
                    }
                    if (isPrecedeThanTopOfStack(token)){
                        operatorStack.push(token);
                        if (tokenizer.hasMoreTokens()){
                            token = tokenizer.nextToken();
                        }
                    }else{
                        String operator = operatorStack.pop();
                        Expression rightOperand = operandStack.pop();
                        Expression leftOperand = operandStack.pop();

                        Expression expression = parseBinaryExpression(operator,
                                leftOperand,
                                rightOperand);
                        operandStack.push(expression);
                    }
                }
            }
        }while (!operatorStack.empty());

        return operandStack.pop();
    }

    private Expression parseTerminal(String str){
        Expression expression = null;
        if (Pattern.matches("[\\d\\.]+", str)){
            expression = new Literal(Double.valueOf(str));
        }else if (Pattern.matches("[a-zA-Z_]+", str)){
            expression = new Variable(str);
        }
        return expression;
    }

    private Expression parseBinaryExpression(String operatorStr,
                                             Expression leftOperand,
                                             Expression rightOperand){
        Expression expression = null;
        switch (operatorStr){
            case "+":
                expression = new AddExpression(leftOperand, rightOperand);
                break;
            case "-":
                expression = new SubExpression(leftOperand, rightOperand);
                break;
            case "*":
                expression = new MulExpression(leftOperand, rightOperand);
                break;
            case "/":
                expression = new DivExpression(leftOperand, rightOperand);
                break;
            default:
                throw new RuntimeException("未知的运算符");
        }
        return expression;
    }

    /**
     * 表达式分解工具
     */
    private static class Tokenizer {
        private String str;
        private List<String> tokens;
        private int currentIndex;

        public Tokenizer(String str) {
            this.str = str;
            tokens = new LinkedList<>();
            currentIndex = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                String currentChar = Character.toString(str.charAt(i));
                if ("*".equals(currentChar) || "/".equals(currentChar)
                        || "+".equals(currentChar) || "-".equals(currentChar)
                        || "#".equals(currentChar)) {
                    if (sb.length() > 0) {
                        tokens.add(sb.toString());
                        sb.delete(0, sb.length());
                    }
                    tokens.add(currentChar);
                } else {
                    sb.append(currentChar);
                }
            }
        }

        /**
         * @return 是否还有token
         */
        public boolean hasMoreTokens() {
            if (null != tokens && tokens.size() > currentIndex) {
                return true;
            } else {
                return false;
            }
        }

        /**
         * @return 下一个token
         */
        public String nextToken() {
            return tokens.get(currentIndex++);
        }
    }
}
