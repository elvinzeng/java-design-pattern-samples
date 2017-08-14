package com.gelvt.gofdp;

import com.gelvt.gofdp.interpreter.ElContext;
import com.gelvt.gofdp.interpreter.ElParser;
import com.gelvt.gofdp.interpreter.Expression;

/**
 * Client
 * @author: Elvin Zeng
 * @date: 17-8-12.
 */
public class App {
    public static void main(String[] args) {
        ElParser parser = new ElParser();
        ElContext elContext = new ElContext();
        elContext.put("a", 12d);
        elContext.put("b", 3d);
        elContext.put("c", 3d);
        String expressionStr = "a - b * 2 + 6 / c";
        Expression expression = parser.parse(expressionStr);
        System.out.println(expressionStr);
        System.out.println(elContext);
        System.out.println(expression);
        System.out.println(expression.getValue(elContext));

        if (!new Double(8).equals(expression.getValue(elContext))){
            throw new RuntimeException("运行结果是错的！");
        }else {
            System.out.println("运行结果正确！");
        }
    }

}
