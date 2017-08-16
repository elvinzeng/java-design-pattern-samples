package com.gelvt.gofdp.visitor;

/**
 * 文件访问者
 * @author: Elvin Zeng
 * @date: 17-8-16.
 */
public interface FileInfoVisitor {
    /**
     * 访问普通文件
     * @param file 当前文件
     */
    void visitFile(RegularFileInfo file);

    /**
     * 访问目录
     * @param directory 当前目录
     */
    void visitFile(DirectoryInfo directory);
}
