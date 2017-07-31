package com.gelvt.gofdp;

import com.gelvt.gofdp.memento.Editor;
import com.gelvt.gofdp.memento.History;

/**
 * Client
 * @author: Elvin Zeng
 * @date: 17-7-28.
 */
public class App {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setAuthor("Elvin Zeng");
        editor.setContent("第一个版本");
        history.add(editor.snapshoot());

        editor.setAuthor("Elvin Zeng");
        editor.setContent("第二个版本");
        history.add(editor.snapshoot());

        editor.setAuthor("zenghui");
        editor.setContent("第三个版本");

        System.out.println("编辑器当前状态：" + editor);

        System.out.println("撤回上一个版本");
        editor.revertSnapshot(history.pop());
        System.out.println("编辑器当前状态：" + editor);

        System.out.println("撤回上一个版本");
        editor.revertSnapshot(history.pop());
        System.out.println("编辑器当前状态：" + editor);
    }

}
