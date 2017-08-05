package com.gelvt.gofdp;

import com.gelvt.gofdp.iterator.Iterator;
import com.gelvt.gofdp.iterator.LinkedList;
import com.gelvt.gofdp.iterator.List;

/**
 * Client
 * @author: Elvin Zeng
 * @date: 17-8-5.
 */
public class App {
    public static void main(String[] args) {
        //  注意这里的List是本程序中自己实现的，不是Java库自带的那个。
        List<String> list = new LinkedList<String>();

        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");

        System.out.println("列表是否为空：" + list.isEmpty());
        System.out.println("列表当前元素总数：" + list.size());
        System.out.println("以下是列表中的所有元素");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
