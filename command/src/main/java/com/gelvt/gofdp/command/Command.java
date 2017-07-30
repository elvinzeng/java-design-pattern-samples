package com.gelvt.gofdp.command;

/**
 * 命令的抽象
 * @author: Elvin Zeng
 * @date: 17-7-30.
 */
public interface Command {

    /**
     * 设置命令参数
     * @param parameters 命令参数
     */
    void setParameters(String[] parameters);

    /**
     * 执行命令
     */
    void execute();
}
